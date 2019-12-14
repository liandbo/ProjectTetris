package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Screen extends JFrame {
	
	private Draw drawS = new Draw();
	private Block blockS = new Block();
	private Check checkS = new Check();
	private Data dataS = new Data();
	private BlockDraw blockDS = new BlockDraw();
		
	
	public Screen() {
		dataS.setboard();
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
					if(checkS.checkSideLeft()&&checkS.checkSideLeftTetrino())
					blockS.giamX();
					repaint();
				}
				if(keyCode == KeyEvent.VK_RIGHT){
					if(checkS.checkSideRight()&&checkS.checkSideRightTetrino())
					blockS.tangX();
					repaint();
				}
				if(keyCode == KeyEvent.VK_DOWN) {
					blockS.tangY();
					repaint();
				}
				if(keyCode == KeyEvent.VK_UP) {
					int x = blockDS.getX();
					int move = checkS.automove();
					blockDS.setX(x+move);
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
