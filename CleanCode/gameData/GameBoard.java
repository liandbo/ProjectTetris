package gameData;

public class GameBoard {
	
	private static int x = 10;
	private static int y = 16;
	
	public static int[][] board = new int[x][y];//10.16
	
	public void setBoard() {
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				board[i][j]=0;
			}
		}
	}
	
	public void addTetris(int x,int y) {
		board[x/50][y/50] = 1;
	}

	public void removeTetris(int x,int y) {
		board[x/50][y/50] = 0;
	}

}
