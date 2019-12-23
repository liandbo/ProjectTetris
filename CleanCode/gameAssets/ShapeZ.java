package gameAssets;

import gameInterface.*;

public class ShapeZ implements ShapeInterface{
	private static int x=200;
	private static int y=50;
	private static int rotate = 1;
	private static int x1,x2,x3,x4;
	private static int y1,y2,y3,y4;
	
	public int getX() {
		return x;
	}
	
	public int getX1() {
		return x1;
	}
	
	public int getX2() {
		return x2;
	}
	
	public int getX3() {
		return x3;
	}
	
	public int getX4() {
		return x4;
	}
	
	public int getY() {
		return y;
	}
	
	public int getY1() {
		return y1;
	}
	
	public int getY2() {
		return y2;
	}
	
	public int getY3() {
		return y3;
	}
	
	public int getY4() {
		return y4;
	}
	
	public int getRotate() {
		return rotate;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setX1(int x1) {
		this.x1=x1;
	}
	
	public void setX2(int x2) {
		this.x2=x2;
	}
	
	public void setX3(int x3) {
		this.x3=x3;
	}
	
	public void setX4(int x4) {
		this.x4=x4;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void setY1(int y1) {
		this.y1=y1;
	}
	
	public void setY2(int y2) {
		this.y2=y2;
	}
	
	public void setY3(int y3) {
		this.y3=y3;
	}
	
	public void setY4(int y4) {
		this.y4=y4;
	}
	
	public void setRotate(int rotate) {
		this.rotate=rotate;
	}
	
	public void setBlock() {
		
		switch (rotate) {
		case 1:
		case 3:			
			x1=x;		y1=y;
			x2=x+50;	y2=y;
			x3=x-50;	y3=y-50;
			x4=x;		y4=y-50;
			break;
		case 2:
		case 4:
			x1=x;		y1=y;
			x2=x;		y2=y+50;
			x3=x+50;	y3=y;
			x4=x+50;	y4=y-50;
			break;
		}
		
	}
}
