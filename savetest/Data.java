package test;

public class Data {
	
	private Block blockDa = new Block();
	
	public static int[][] board = new int[10][16];
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
	
	//xet coi block con` roi dc ko
	public boolean Canfall() {
		int a = blockDa.getA();
		int xoay = Block.getXoay();
		int x = blockDa.getX() / 50;
		int y = blockDa.getY() / 50;
		
		switch (a) {
		case 1:
			if ( board[x][y+1]==1 || board[x+1][y+1]==1 ) return true;
		case 2:
			if ( board[x][y+3]==1 && (xoay==1 || xoay==3)) return true;
			if ( (board[x-1][y+1]==1 || board[x][y+1]==1 || board[x+1][y+1]==1 || board[x+2][y+1]==1 ) && (xoay==2 || xoay==4)) return true;
			
		case 3:
			switch (xoay) {
			case 1:
				if ( board[x-1][y+1]==1 || board[x][y+1]==1 || board[x+1][y+1]==1) return true;
			case 2:
				if ( board[x][y+2]==1 || board[x+1][y+1]==1 ) return true;
			case 3:
				if ( board[x-1][y+1]==1 || board[x][y+2]==1 || board[x+1][y+1]==1) return true;
			case 4:
				if ( board[x][y+2]==1 || board[x-1][y+1]==1 ) return true;
			}
		 
		case 4:
			break;
			default:
				break;
			
			
		}
		
		return false;
	}
	
	public void LuuHinh() {
		
	}
		
	public void TruHang() {
		
	}
}
