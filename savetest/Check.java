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
			temp=blockC.getX()/50;
			board[temp][14]=1;
			blockC.setY(0);
			blockC.setX(200);
			blockC.random();
			blockC.setXoay(1);
		}
	}
	public boolean checkSideRight() {
		int a=blockC.getA();
		int xoay=blockC.getXoay();
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
		int a=blockC.getA();
		int xoay=blockC.getXoay();
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
	
//	public boolean checkRotate() {
//		int x=blockC.getX();
//		int a=blockC.getA();
//		return((x>400||x==0)||(a==2&&(x>=400||x==0)))?false:true;
//	}
	
	public int automove() {
		int a=blockC.getA();
		int xoay=blockC.getXoay();
		int x=blockC.getX();
		switch (a) {
		case 1:
			return 0;
		case 2:
			if(xoay==1 || xoay ==3) {
				if (x==450) return -100;
				if (x==400) return -50;
			} else 
			if (xoay==2 || xoay==4) {
				if (x==0) return 50;
			} else return 0;
		case 3:
			if (xoay==4) {
				if (x==450) return -50;
			} else 
			if (xoay==2) {
				if (x==0) return 50;
			} else return 0;
		case 4:
			if (xoay==3) {
				if(x==450) return -50;
			} else 
			if (xoay==1) {
				if (x==0) return 50;
			} else return 0;
		case 5:
			if (xoay==1) {
				if(x==450) return -50;
			} else
			if (xoay==3) {
				if(x==0) return 50;
			} else return 0;
		case 6:
			if ( xoay==2 || xoay==4) {
				if (x==450) return -50;
			} else return 0;
		case 7:
			if (xoay==2 || xoay==4) {
				if (x==0) return 50;
			} else return 0;
		default:
			return 0;
		}
	}
	
}
