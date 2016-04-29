package game.spw;

import javax.swing.*;
import java.awt.*;
public class frame {
	public static void main(String[]args){
		JFrame frame = new JFrame("Space Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600);
		
		frame.getContentPane().setLayout(new BorderLayout());
		SpaceShip v = new SpaceShip(180, 550, 20, 20);
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp,v);
		frame.getContentPane().add(gp,BorderLayout.CENTER);
		frame.setVisible(true);

		engine.start();
	}
}