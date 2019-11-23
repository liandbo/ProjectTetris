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
			blockC.setX(200);
			temp=blockC.getX()/50;
			board[temp][14]=1;
			blockC.random();
		}
	}
	public boolean checkSideRight() {
		int a=Block.getA();
		int xoay=Block.getXoay();
		int x=blockC.getX();
		switch (a) {
		case 1:return(x<400)?true:false;
		case 2:return(x<350)?true:((xoay==2||xoay==4)&&x==350)?false:true;
		case 3:return(x<400)?true:(xoay==4&&x==400)?true:false;
		case 4:return(x<400)?true:(xoay==3&&x==400)?true:false;
		case 5:return(x<400)?true:(xoay==1&&x==400)?true:false;
		case 6:return(x<400)?true:((xoay==2||xoay==4)&&x==400)?true:false;
		case 7:return(x<400)?true:false;
		default:return true;
		}
	}
	
	public boolean checkSideLeft() {
		int a=Block.getA();
		int xoay=Block.getXoay();
		int x=blockC.getX();
		switch(a) {
		case 2:return(x>50)?true:((xoay==1||xoay==3)&&x==50)?true:false;
		case 3:return(x>50)?true:(xoay==2&&x==50)?true:false;
		case 4:return(x>50)?true:(xoay==1&&x==50)?true:false;
		case 5:return(x>50)?true:(xoay==3&&x==50)?true:false;
		case 6:return(x>50)?true:false;
		case 7:return(x>50)?true:((xoay==2||xoay==4)&&x==50)?true:false;
		default:return true;
		}
		
	}
	
	public boolean checkRotate() {
		int x=blockC.getX();
		int a=Block.getA();
		return((x>400||x==0)||(a==2&&(x>=400||x==0)))?false:true;
	}
	
}
