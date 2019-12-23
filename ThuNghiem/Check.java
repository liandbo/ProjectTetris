package test;

public class Check {
	
	private Block blockC = new Block();
	private Data dataC = new Data();
	private BlockDraw blockDC = new BlockDraw();

	
	//checkBlockCanResetChua
	public void ResetChua (){
		if ( BlockDraw.f1/100==0 || BlockDraw.f2/100==0 || BlockDraw.f3/100==0 || BlockDraw.f4/100==0 ) {
			dataC.LuuHinh(BlockDraw.x1, BlockDraw.y1);
			dataC.LuuHinh(BlockDraw.x2, BlockDraw.y2);
			dataC.LuuHinh(BlockDraw.x3, BlockDraw.y3);
			dataC.LuuHinh(BlockDraw.x4, BlockDraw.y4);
			blockC.resetBlock();
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
	
	public boolean checkSideLeft() {
		if (BlockDraw.f1 %100%10==0 || BlockDraw.f2 %100%10==0 || BlockDraw.f3 %100%10==0 || BlockDraw.f3 %100%10==0) return false;
		return true;
	}
	
	public boolean checkSideRight() {
		if (BlockDraw.f1 %100/10==0 || BlockDraw.f2 %100/10==0 || BlockDraw.f3 %100/10==0 || BlockDraw.f3 %100/10==0) return false;
		return true;
	}
	
	public void checkTruHang() {
		int j,i;
		int sum = 0;
		for (j=15;j>=0;j--) {
			for(i=0;i<10;i++) {
				sum += Data.board[i][j];
			}
			if (sum==10) {
				dataC.TruHang(j);
			}
			sum=0;
		}
	}
	public void checkxoay() {
		
	}
}










