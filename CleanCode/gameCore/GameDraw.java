package gameCore;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import gameData.*;

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
		g.setColor(GameVariables.getBoardColor());
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//ve block
		
		g.setColor(GameVariables.getBlockColor());
		gameFunction.getCurrentBlock().setBlock();
		g.fillRect(gameFunction.getCurrentBlock().getX1(),gameFunction.getCurrentBlock().getY1(), GameVariables.getBlockXSize(), GameVariables.getBlockYSize());
		g.fillRect(gameFunction.getCurrentBlock().getX2(),gameFunction.getCurrentBlock().getY2(), GameVariables.getBlockXSize(), GameVariables.getBlockYSize());
		g.fillRect(gameFunction.getCurrentBlock().getX3(),gameFunction.getCurrentBlock().getY3(), GameVariables.getBlockXSize(), GameVariables.getBlockYSize());
		g.fillRect(gameFunction.getCurrentBlock().getX4(),gameFunction.getCurrentBlock().getY4(), GameVariables.getBlockXSize(), GameVariables.getBlockYSize());
		
		//ve block co san
		for(int i=0;i<GameVariables.getBlockXAmount();i++) {
			for(int j=0;j<GameVariables.getBlockYAmount();j++) { 
				if(GameBoard.board[i][j] == 1) {
					g.fillRect((i*GameVariables.getBlockXSize())+GameVariables.getBoardXOffset(), (j*GameVariables.getBlockYSize())+GameVariables.getBoardYOffset(), GameVariables.getBlockXSize(), GameVariables.getBlockYSize());
				}
			}
		}
		
		// ve vach
		
		g.setColor(GameVariables.getLineColor());
		for(int i=0;i<GameVariables.getBlockXAmount()+1;i++) {									// doc
			g.drawLine(x, GameVariables.getBoardYOffset(), x, GameVariables.getBoardYSize());
			x+=GameVariables.getBlockXSize();
		}
		for(int i=0;i<GameVariables.getBlockYAmount();i++) {									// ngang
			g.drawLine(GameVariables.getBoardXOffset(), h, GameVariables.getBoardXSize(), h);
			h+=GameVariables.getBlockYSize();
		}
	}
	
	public void run() {
		while (true) {
			
			//set delay
			try {
				Thread.sleep(GameVariables.getGameTick());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			gameFunction.increaseBlockY(gameLogic);
			
			if(!gameFunction.checkBlock(gameLogic)){
				gameFunction.resetBlock(gameLogic);
			}
			gameFunction.checkBoardLine(gameLogic);
			repaint();
			
			
			
			
		}
	}
	

}
