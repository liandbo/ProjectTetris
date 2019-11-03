package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Screen extends JFrame {
	
	private Draw drawS = new Draw();
	private Block blockS = new Block();
	
	public Screen() {
		setSize(800, 800);
		setVisible(true);
		setLocation(600, 100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(drawS);
		
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_LEFT) {
					blockS.giamX();
				}
				if(keyCode == KeyEvent.VK_RIGHT){
					blockS.tangX();
				}
			}
			
		});
	}
	
	public static void main(String[] args) {
		Screen screen = new Screen();
		
	}

}
