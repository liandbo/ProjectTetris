package test;

public class Check {
	
	private Block blockC = new Block();
	private Data dataC = new Data();
	private BlockDraw blockDC = new BlockDraw();

	
	//checkBlockCanResetChua
	public void ResetChua (){
		if ( !BlockDraw.f1 || !BlockDraw.f2 || !BlockDraw.f3 || !BlockDraw.f4 ) {
			dataC.LuuHinh(BlockDraw.x1, BlockDraw.y1);
			dataC.LuuHinh(BlockDraw.x2, BlockDraw.y2);
			dataC.LuuHinh(BlockDraw.x3, BlockDraw.y3);
			dataC.LuuHinh(BlockDraw.x4, BlockDraw.y4);
			blockC.resetBlock();
		}
			
	}
	
	//check dung tuong phai 
	public boolean checkSideRight() {
		int a=blockDC.getA();
		int xoay=blockDC.getXoay();
		int x=blockDC.getX();
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
	
	public boolean checkSideRightTetrino() {
		int a=blockDC.getA();
		int xoay=blockDC.getXoay();
		int x=blockDC.getX();
		int y=blockDC.getY();
		System.out.println("x="+x+" y="+y+" xoay="+xoay);
		switch (a) {
		case 1:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+2,y/50+1))?true:false;
		case 2:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50+1, y/50+1)&&dataC.checkTetrino(x/50+1, y/50+2)&&dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50+3, y/50))?true:false;
			case 3:return(dataC.checkTetrino(x/50+1, y/50+1)&&dataC.checkTetrino(x/50+1, y/50+2)&&dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50+3, y/50))?true:false;
			default:return true;
			}
		}
		case 3:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+1, y/50-1)&&dataC.checkTetrino(x/50+1, y/50+1))?true:false;
			case 3:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+1, y/50+1))?true:false;
			case 4:return(dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+1, y/50-1)&&dataC.checkTetrino(x/50+1, y/50+1))?true:false;
			default:return true;
			}
		}
		case 4:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+2, y/50+1)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50, y/50+1))?true:false;
			case 3:return(dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+1, y/50+1)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+2, y/50-1))?true:false;
			default: return true;
			}
		}
		case 5:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+1, y/50+1)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50, y/50-1))?true:false;
			case 3:return(dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+1, y/50+1)&&dataC.checkTetrino(x/50+2, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+2, y/50+1))?true:false;
			default: return true;
			}
		}
		case 6:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+2, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+2, y/50+1)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 3:return(dataC.checkTetrino(x/50+1, y/50)&&dataC.checkTetrino(x/50+2, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+2, y/50+1)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			default: return true;
			}
		}
		case 7:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+1, y/50+1)&&dataC.checkTetrino(x/50+2, y/50-1))?true:false;
			case 3:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+1, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50+2, y/50)&&dataC.checkTetrino(x/50+1, y/50+1)&&dataC.checkTetrino(x/50+2, y/50-1))?true:false;
			default: return true;
			}
		}
		default:return true;
		}
	}
	
	//check dung tuong trai
	public boolean checkSideLeft() {
		int a=blockDC.getA();
		int xoay=blockDC.getXoay();
		int x=blockDC.getX();
		switch(a) {
		case 1:return(x>=50)?true:false;
		case 2:return(x>50)?true:((xoay==1||xoay==3)&&x==50)?true:false;
		case 3:return(x>50)?true:(xoay==2&&x==50)?true:false;
		case 4:return(x>50)?true:(xoay==1&&x==50)?true:false;
		case 5:return(x>50)?true:(xoay==3&&x==50)?true:false;
		case 6:return(x>=50)?true:false;
		case 7:return(x>50)?true:((xoay==2||xoay==4)&&x==50)?true:false;
		default:return true;
		}
		
	}	
	
	public boolean checkSideLeftTetrino() {
		int a=blockDC.getA();
		int xoay=blockDC.getXoay();
		int x=blockDC.getX();
		int y=blockDC.getY();
		System.out.println("x="+x+" y="+y+" xoay="+xoay);
		switch(a) {
		case 1:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1,y/50+1))?true:false;
		case 2:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50-1, y/50+1)&&dataC.checkTetrino(x/50-1, y/50+2)&&dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50-2, y/50))?true:false;
			case 3:return(dataC.checkTetrino(x/50-1, y/50+1)&&dataC.checkTetrino(x/50-1, y/50+2)&&dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50-2, y/50))?true:false;
			default:return true;
			}
		}
		case 3:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1, y/50-1)&&dataC.checkTetrino(x/50-1, y/50+1))?true:false;
			case 3:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50-1, y/50+1))?true:false;
			case 4:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50-1, y/50-1)&&dataC.checkTetrino(x/50-1, y/50+1))?true:false;
			default:return true;
			}
		}
		case 4:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1, y/50+1)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50-2, y/50+1))?true:false;
			case 3:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1, y/50+1)&&dataC.checkTetrino(x/50-2, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50, y/50-1))?true:false;
			default: return true;
			}
		}
		case 5:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-2, y/50+1)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50-2, y/50-1))?true:false;
			case 3:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1, y/50+1)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50, y/50+1))?true:false;
			default: return true;
			}
		}
		case 6:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50, y/50+1)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 3:return(dataC.checkTetrino(x/50-2, y/50)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50, y/50+1)&&dataC.checkTetrino(x/50-1, y/50-1))?true:false;
			default: return true;
			}
		}
		case 7:{
			switch(xoay) {
			case 1:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-2, y/50-1))?true:false;
			case 2:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1, y/50+1)&&dataC.checkTetrino(x/50, y/50-1))?true:false;
			case 3:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-2, y/50-1))?true:false;
			case 4:return(dataC.checkTetrino(x/50-1, y/50)&&dataC.checkTetrino(x/50-1, y/50+1)&&dataC.checkTetrino(x/50, y/50-1))?true:false;
			default: return true;
			}
		}
		default:return true;
		}
		
	}	
	
	//neu dung wa gan tuong se tu dong dich chuyen ra 1 chut
	public int automove() {
		int a=blockDC.getA();
		int xoay=blockDC.getXoay();
		int x=blockDC.getX();
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
