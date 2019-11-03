package test;

import javax.swing.JFrame;

public class Screen extends JFrame {
	
	private Draw drawS = new Draw();
	
	public Screen() {
		setSize(800, 800);
		setVisible(true);
		setLocation(600, 100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(drawS);
	}
	
	public static void main(String[] args) {
		Screen screen = new Screen();
		
	}

}
