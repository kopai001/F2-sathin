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

	public GameEngine(GamePanel gp) {
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


	private void process(){

		for(int i=1;i>0;i++){
			score += 100;
		}
	}

	public long getScore(){
		return score;
	}
	public void die(){
		timer.stop();
	}
}