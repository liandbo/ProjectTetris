package test;

public class Check {
	
	private Block blockC = new Block();
	
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
	
	//check cham day
	public void checkBottom() {
		int temp;
		
		if(blockC.getY() == 700) {
			blockC.setY(0);
			temp=blockC.getX()/50;
			board[temp][14]=1;
			blockC.random();
		}
	}
	
}
