package game;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("BRICK");
		
		BlockBreakerPanel Panel =new BlockBreakerPanel();
		
		frame.getContentPane().add(Panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(500, 700);
		
		frame.setResizable(false);

	}

}
