package test;

public class Check {
	
	private Block blockC = new Block();
	private Data dataC = new Data();

	
	//checkBlockCanResetChua
	public boolean ResetChua (){
		if ( !Block.f1 || !Block.f2 || !Block.f3 || !Block.f4) 
			return true;
		return false;
	}
	
	//check dung tuong phai 
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
	
	//check dung tuong trai
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
	
	//neu dung wa gan tuong se tu dong dich chuyen ra 1 chut
	public int automove() {
		int a=blockC.getA();
		int xoay=blockC.getXoay();
		int x=blockC.getX();
		switch (a) {
		case 1:return 0;
		case 2:return(xoay==1||xoay==3)?(x==450)?-100:(x==400)?-50:(x==0)?50:0:0;
		case 3:return(xoay==4&&x==450)?-50:(xoay==2&&x==0)?50:0;
		case 4:return(xoay==3&&x==450)?-50:(xoay==1&&x==0)?50:0;
		case 5:return(xoay==1&&x==450)?-50:(xoay==3&&x==0)?50:0;
		case 6:return((xoay==2||xoay==4)&&x==450)?-50:0;
		case 7:return((xoay==2||xoay==4)&&x==0)?50:0;
		default:return 0;
		}
	}
	
}
