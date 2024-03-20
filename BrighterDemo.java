//E2.9-E2.10

import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		Color color = new Color(50, 100, 150);
		frame.getContentPane().setBackground(color);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
