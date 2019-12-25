package gameCore;

import gameAssets.*;
import gameData.*;
import gameInterface.*;

public class GameLogic implements LogicInterface {
	
	
	private int timer = 1000;
	
	public int getTimer(){
		return timer;
	}
	
	public boolean checkDown(int x,int y) {
		return(y/50 > 13 || GameBoard.board[x/50][(y/50) +1]==1)?false:true;
	}
	
	public boolean checkRight(int x,int y) {
		return(x/50 > 8 || GameBoard.board[(x/50) +1][y/50]==1)?false:true;
	}
	
	public boolean checkLeft(int x,int y) {
		return(x/50 < 1 || GameBoard.board[(x/50) -1][y/50]==1)?false:true;
	}
	
	public boolean checkPosition(int x, int y) {
		return(x>450 || x<0 || GameBoard.board[x/50][y/50]==1)?false:true;
	}


}
