package blockBreaker;

import javax.swing.JFrame;

public class MainGame {
	public static void main(String[] args){
		// Create a  JFrame  object
		JFrame  frame  = new JFrame("Block Breaker");
		
		BlockBreakerPanel panel = new BlockBreakerPanel();
		
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
		frame.setSize(480, 600);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
	}
}
