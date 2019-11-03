package test;

public class Check {
	
	private Block blockC = new Block();
	
	public static int[][] board = new int[10][15];
	private int i;
	private int j;
	
	//tao board de check dieu kien
	public void setboard() {
		for(i=0;i<10;i++) {
			for(j=0;j<15;j++) {
				board[i][j]=0;
			}
		}
	}
	
	//check cham day
	public void checkBottom() {
		int a;
		
		if(blockC.getY() == 700) {
			blockC.setY(0);
			a=blockC.getX()/50;
			board[a][14]=1;
		}
	}
}
