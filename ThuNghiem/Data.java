package test;

public class Data {
	
	private Block blockDa = new Block();
	
	public static int[][] board = new int[10][16];//10.16
	private int i;
	private int j;
	
	
	//tao board de check dieu kien
	public void setboard() {
		for(i=0;i<10;i++) {
			for(j=0;j<16;j++) {
				board[i][j]=0;
			}
		}
	}
	
	//Luu anh da co vao data
	public void LuuHinh(int x, int y) {
		int xx = x/50;
		int yy = y/50;
		Data.board[xx][yy] = 1;
	}
		
	public void TruHang() {
	}
	
	public boolean checkTetrino(int x,int y) {
		return(board[x][y]==1)?false:true;
	}
	
	
}
