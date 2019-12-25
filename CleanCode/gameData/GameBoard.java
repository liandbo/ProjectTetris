package gameData;

public class GameBoard {
	
	private static int x = GameVariables.getBlockYAmount();
	private static int y = GameVariables.getBlockYAmount();
	
	public static int[][] board = new int[x][y];//10.16 should be the default value
	
	public void setBoard() {
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				board[i][j]=0;
			}
		}
	}
	
	public void addTetris(int x,int y) {
		board[x/GameVariables.getBlockXSize()][y/GameVariables.getBlockYSize()] = 1;
	}
	
	public void removeTetris(int x,int y) {
		board[x/GameVariables.getBlockXSize()][y/GameVariables.getBlockYSize()] = 0;
	}
	
	public void removeLine(int y) {
		if(y != -1) {
			for(int i = 0; i < x; i++) {
				removeTetris(i*GameVariables.getBlockXSize(),y*GameVariables.getBlockYSize());
			}
		}
	}

}
