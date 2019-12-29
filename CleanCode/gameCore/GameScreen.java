package gameCore;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gameData.*;


public class GameScreen extends JFrame {
	
	GameFunction gameFunction = new GameFunction();
	GameLogic gameLogic = new GameLogic();
	GameBoard gameBoard = new GameBoard();
	GameDraw gameDraw = new GameDraw();
	GameScore gameScore = new GameScore();
	
	public GameScreen(){
		gameBoard.setBoard();
		
		setTitle("Game xep hinh VN chat luong cao.");
		setSize(GameVariables.getScreenXSize(),GameVariables.getScreenYSize());
		setVisible(true);
		setLocation(0,0);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(gameDraw);
		
		//Bam nut action
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_LEFT) {
					gameFunction.decreaseBlockX(gameLogic);
					repaint();
				}
				if(keyCode == KeyEvent.VK_RIGHT){
					gameFunction.increaseBlockX(gameLogic);
					repaint();
				}
				if(keyCode == KeyEvent.VK_DOWN) {
					gameFunction.increaseBlockY(gameLogic);
					gameScore.ScoreforDown();
					if(!gameFunction.checkBlock(gameLogic)){
						gameFunction.resetBlock(gameLogic);
					}
					gameFunction.checkBoardLine(gameLogic);
					repaint();
				}
				if(keyCode == KeyEvent.VK_UP) {
						gameFunction.rotateBlock(gameLogic);
						repaint();
					
				}
			}
			
		});
	}
	public void Gameover (JFrame j) {
		int option = JOptionPane.showConfirmDialog(null," Want to try again?","GAME OVER", JOptionPane.YES_NO_OPTION );
		if (option == JOptionPane.YES_OPTION) {
			j.dispose();
			new GameScreen();
			}
		else {
			System.exit(0);
			}	
}
	public static void main(String[] args) {
		GameScreen screen = new GameScreen();
		screen.Gameover(screen);
	}
}
