package game.spw;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private BufferedImage bi;	
	Graphics2D big;
	

	public GamePanel() {
		bi = new BufferedImage(400, 600, BufferedImage.TYPE_INT_ARGB);
		big = (Graphics2D) bi.getGraphics();
		big.setBackground(Color.BLACK);
		big.clearRect(0, 0, 400, 600);
	}

	public void updateGameUI(GameReporter reporter){

		big.setColor(Color.WHITE);		
		big.drawString(String.format("%08d", reporter.getScore()), 300, 20);
		/*for(int i=1;i<0;i++){

		}*/
		repaint();
	}


	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(bi, null, 0, 0);
	}

}