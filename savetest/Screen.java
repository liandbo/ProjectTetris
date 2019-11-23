package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Screen extends JFrame {
	
	private Draw drawS = new Draw();
	private Block blockS = new Block();
	private Check checkS = new Check();
		
	
	public Screen() {
		checkS.setboard();
		setTitle("Game xep hinh VN chat luong cao.");
		setSize(800, 800);
		setVisible(true);
		setLocation(600, 100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(drawS);
		
		//Bam nut action
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_LEFT) {
					if(checkS.checkSideLeft())
					blockS.giamX();
					repaint();
				}
				if(keyCode == KeyEvent.VK_RIGHT){
					if(checkS.checkSideRight())
					blockS.tangX();
					repaint();
				}
				if(keyCode == KeyEvent.VK_DOWN) {
					blockS.tangY();
					repaint();
				}
				if(keyCode == KeyEvent.VK_UP) {
					int x = blockS.getX();
					int move = checkS.automoveRight();
					blockS.setX(x-move);
					blockS.xoayblock();
					repaint();
				}
			}
			
		});
	}
	
	public static void main(String[] args) {
		Screen screen = new Screen();
		
	}

}
