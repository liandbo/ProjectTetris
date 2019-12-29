package gameCore;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import gameData.*;

public class GameDraw extends JPanel implements Runnable {
	
	GameFunction gameFunction = new GameFunction();
	GameLogic gameLogic = new GameLogic();
	GameBoard gameBoard = new GameBoard();
	GameScore gameScore = new GameScore();
	
	Thread thread1;
	
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
		g.fillRect(gameFunction.getCurrentBlock().getX1(),gameFunction.getCurrentBlock().getY1(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.fillRect(gameFunction.getCurrentBlock().getX2(),gameFunction.getCurrentBlock().getY2(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.fillRect(gameFunction.getCurrentBlock().getX3(),gameFunction.getCurrentBlock().getY3(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.fillRect(gameFunction.getCurrentBlock().getX4(),gameFunction.getCurrentBlock().getY4(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		
		//ve block du doan
		g.fillRect(gameFunction.getNextBlock().getXX1(),gameFunction.getNextBlock().getYY1(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.fillRect(gameFunction.getNextBlock().getXX2(),gameFunction.getNextBlock().getYY2(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.fillRect(gameFunction.getNextBlock().getXX3(),gameFunction.getNextBlock().getYY3(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.fillRect(gameFunction.getNextBlock().getXX4(),gameFunction.getNextBlock().getYY4(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		//ve vien block du doan
		g.setColor(GameVariables.getLineColor());
		g.drawRect(gameFunction.getNextBlock().getXX1(),gameFunction.getNextBlock().getYY1(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.drawRect(gameFunction.getNextBlock().getXX2(),gameFunction.getNextBlock().getYY2(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.drawRect(gameFunction.getNextBlock().getXX3(),gameFunction.getNextBlock().getYY3(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		g.drawRect(gameFunction.getNextBlock().getXX4(),gameFunction.getNextBlock().getYY4(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
		
		//ve block co san
		g.setColor(GameVariables.getBlockColor());
		for(int i=0;i<GameVariables.getBlockXAmount();i++) {
			for(int j=0;j<GameVariables.getBlockYAmount();j++) { 
				if(GameBoard.board[i][j] == 1) {
					g.fillRect((i*GameVariables.getBlockSize())+GameVariables.getBoardXOffset(), (j*GameVariables.getBlockSize())+GameVariables.getBoardYOffset(), GameVariables.getBlockSize(), GameVariables.getBlockSize());
				}
			}
		}
		
		// ve vach
		
		g.setColor(GameVariables.getLineColor());
		for(int i=0;i<GameVariables.getBlockXAmount()+1;i++) {									// doc
			g.drawLine(x, GameVariables.getBoardYOffset(), x, GameVariables.getBoardYSize());
			x+=GameVariables.getBlockSize();
		}
		for(int i=0;i<GameVariables.getBlockYAmount();i++) {									// ngang
			g.drawLine(GameVariables.getBoardXOffset(), h, GameVariables.getBoardXSize(), h);
			h+=GameVariables.getBlockSize();
		}
		
		//in diem
		g.setColor(GameVariables.getScoreColor());
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("Diem:" + gameScore.getScore(), GameVariables.getScoreXPos(), GameVariables.getScoreYPos());
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
			
			
			
			if(!gameFunction.checkBlock(gameLogic)){
				gameFunction.resetBlock(gameLogic);
			}
			gameFunction.increaseBlockY(gameLogic);
			gameFunction.checkBoardLine(gameLogic);
			repaint();
			if (gameLogic.checkGameOver()) {
			    JOptionPane.showMessageDialog(null, "Game Over");
				thread1.stop();
			}
			
			
			
		}
	}
	

}
