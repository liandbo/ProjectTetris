package gameCore;

import gameAssets.*;
import gameData.*;
import gameInterface.*;

public class GameLogic implements LogicInterface {
	Score score = new Score();
	
	public boolean checkDown(int x,int y) {
		return(y/GameVariables.getBlockSize() > (GameVariables.getBlockYAmount()-3) || GameBoard.board[x/GameVariables.getBlockSize()][(y/GameVariables.getBlockSize()) +1]==1)?false:true;
	}
	
	public boolean checkRight(int x,int y) {
		return(x/GameVariables.getBlockSize() > (GameVariables.getBlockXAmount()-2) || GameBoard.board[(x/GameVariables.getBlockSize()) +1][y/GameVariables.getBlockSize()]==1)?false:true;
	}
	
	public boolean checkLeft(int x,int y) {
		return(x/GameVariables.getBlockSize() < 1 || GameBoard.board[(x/GameVariables.getBlockSize()) -1][y/GameVariables.getBlockSize()]==1)?false:true;
	}
	
	public boolean checkPosition(int x, int y) {
		return(x/GameVariables.getBlockSize() < 0 || x/GameVariables.getBlockSize() > (GameVariables.getBlockXAmount()-1) || GameBoard.board[x/GameVariables.getBlockSize()][y/GameVariables.getBlockSize()]==1)?false:true;
	}

	public int checkLine() {
		int sum = 0;
		for(int lap=0; lap <GameVariables.getBlockYAmount(); lap++) {
			for (int j=GameVariables.getBlockYAmount()-1;j>=0;j--) {
				for(int i=0;i<GameVariables.getBlockXAmount();i++) {
					sum += GameBoard.board[i][j];
				}
				if (sum==GameVariables.getBlockXAmount()) {
					score.ScoreforLine();
					return j;
				}
				sum=0;
			}
		}
		return -1;
	}


}
