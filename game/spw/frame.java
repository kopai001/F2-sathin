package game.spw;

import javax.swing.*;
import java.awt.*;
public class frame {
	public static void main(String[]args){
		JFrame frame = new JFrame("Space Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		
		frame.getContentPane().setLayout(new BorderLayout());
		
		GamePanel gp = new GamePanel();
		frame.getContentPane().add(gp,BorderLayout.CENTER);
		frame.setVisible(true);


	}
}