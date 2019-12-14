package test;

import java.util.Random;


public class Block{
	
	private Cell cellB = new Cell();
	private BlockDraw blockB = new BlockDraw();
	

	//giam do cao
	public void tangY() {
		if(blockB.getY()<700) {
			if (blockB.f1 && blockB.f2 && blockB.f3 && blockB.f4) {
				blockB.setY(blockB.getY()+50);
				blockB.y1+=50;
				blockB.y2+=50;
				blockB.y3+=50;
				blockB.y4+=50;
			}
		}
	}
	
	
	//di qua phai (tang x)
	public void tangX() {
		if(blockB.getX()<450) {
			blockB.setX(blockB.getX()+50);
			blockB.x1+=50;
			blockB.x2+=50;
			blockB.x3+=50;
			blockB.x4+=50;
		}
	}
	
	//di qua trai (giam x)
	public void giamX() {
		if(blockB.getX()>0) {
			blockB.setX(blockB.getX()-50);
			blockB.x1-=50;
			blockB.x2-=50;
			blockB.x3-=50;
			blockB.x4-=50;
		}
	}
	
	//random loai block
	public void random() {
		int a1=0;
		int a2=0;
		boolean trung=true;
		Random rd = new Random();
		a2=a1;
		a1=blockB.getA();
		blockB.setA(rd.nextInt(7)+1);
		while (trung == true) {
			if (blockB.getA()!=a1 && blockB.getA()!=a2) {
				trung = false;
			} else
				blockB.setA(rd.nextInt(7)+1);
		}
		trung = true;
	}
	
	//xoay block
	public void xoayblock() {
		if (blockB.getXoay() == 4) {
			blockB.setXoay(1);
		} else {
			blockB.setXoay(blockB.getXoay()+1);
		}
	}
	
	//reset do cao
	public void resetBlock() {
		blockB.setY(0);
		blockB.setX(200);
		random();
		blockB.setXoay(1);
		blockB.f1=true; blockB.f2=true; blockB.f3=true; blockB.f4=true;
	}

}
