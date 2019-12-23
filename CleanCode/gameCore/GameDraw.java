package gameCore;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import gameData.GameBoard;

public class GameDraw extends JPanel implements Runnable {
	
	GameFunction gameFunction = new GameFunction();
	GameLogic gameLogic = new GameLogic();
	GameBoard gameBoard = new GameBoard();
	
	public GameDraw() {
		Thread thread1 = new Thread(this);
		thread1.start();
	}
	
	public void paint(Graphics g) {
		int x=0;
		int h=0;
		
		//ve nen`
		
		g.setColor(Color.cyan);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//ve block
		
		g.setColor(Color.red);
		gameFunction.getCurrentBlock().setBlock();
		g.fillRect(gameFunction.getCurrentBlock().getX1(),gameFunction.getCurrentBlock().getY1(), 50, 50);
		g.fillRect(gameFunction.getCurrentBlock().getX2(),gameFunction.getCurrentBlock().getY2(), 50, 50);
		g.fillRect(gameFunction.getCurrentBlock().getX3(),gameFunction.getCurrentBlock().getY3(), 50, 50);
		g.fillRect(gameFunction.getCurrentBlock().getX4(),gameFunction.getCurrentBlock().getY4(), 50, 50);
		for(int i=0;i<10;i++) {
			for(int j=0;j<16;j++) { 
				if(GameBoard.board[i][j] == 1) {
					g.fillRect(i*50, j*50, 50, 50);
				}
			}
		}
		
		// ve vach
		
		g.setColor(Color.white);
		for(int i=0;i<11;i++) {									// doc
			g.drawLine(x, 0, x, 750);
			x+=50;
		}
		for(int i=0;i<16;i++) {									// ngang
			g.drawLine(0, h, 500, h);
			h+=50;
		}
	}
	
	public void run() {
		while (true) {
			
			//set delay
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			gameFunction.increaseBlockY(gameLogic);
			
			repaint();
			
			
			if(!gameFunction.checkBlock(gameLogic)){
				gameFunction.resetBlock(gameLogic);
			}
			
			
			
			
		}
	}
	

}
