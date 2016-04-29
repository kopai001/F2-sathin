package game.spw;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.Timer;

public class GameEngine implements  GameReporter{
	GamePanel gp;
	private Timer timer;
	private long score = 0;
	private double difficulty = 0.1;
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();	

	public GameEngine(GamePanel gp) {
		this.gp = gp;

		timer = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				process();
			}
		});
		timer.setRepeats(true);
		
	}

	public void start(){
		timer.start();
	}
	private void generateEnemy(){
		Enemy e = new Enemy((int)(Math.random()*390), 30);
		gp.sprites.add(e);
		enemies.add(e);
	}


	private void process(){
		
		if(Math.random() < difficulty){
			generateEnemy();
		}
		
		Iterator<Enemy> e_iter = enemies.iterator();
		while(e_iter.hasNext()){
			Enemy e = e_iter.next();
			e.proceed();
			
			if(!e.isAlive()){
				e_iter.remove();
				gp.sprites.remove(e);
				score += 100;
			}
		}
		
		gp.updateGameUI(this);
		
		
		Rectangle2D.Double er;
		for(Enemy e : enemies){
			er = e.getRectangle();
			
		}
	}
	public long getScore(){
		return score;
	}
	public void die(){
		timer.stop();
	}
}