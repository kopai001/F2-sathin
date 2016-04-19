import javax.swing.*;
import java.awt.*;
public class frame {
	public static void main(String[]args){
		JFrame frame = new JFrame("Space Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);

		JPanel facesPanel = new JPanel();
		facesPanel.setBackground(Color.BLACK);
	}
}