package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Block extends JPanel{
	
	private Cell cellB = new Cell();
	
	private static int x=200;
	private static int y=0;
	private int i,j;
	private static int a=1;
	private static int xoay= 1;
	public static boolean f1,f2,f3,f4;
	public static int x1,x2,x3,x4;
	public static int y1,y2,y3,y4;

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public static void setXoay(int xoay) {
		Block.xoay = xoay;
	}

	public int getX() {
		return x;
	}
	
	public static void setX(int x) {
		Block.x = x;
	}


	public int getY() {
		return y;
	}
	
	public int getA()
	{
		return a;
	}
	
	public static int getXoay() {
		return xoay;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public static void setA(int a) {
		Block.a = a;
	}

	public static void setY(int y) {
		Block.y = y;
	}

	//giam do cao
	public void tangY() {
		if(y<700) {
			if (f1 && f2 && f3 && f4) {
				y+=50;
			}
		}
	}
	
	
	//di qua phai (tang x)
	public void tangX() {
		if(x<450) {
			x+=50;
		}
	}
	
	//di qua trai (giam x)
	public void giamX() {
		if(x>0) {
			x-=50;
		}
	}
	
	//random loai block
	public void random() {
		int a1=0;
		int a2=0;
		boolean trung=true;
		Random rd = new Random();
		a2=a1;
		a1=a;
		a = rd.nextInt(7)+1;
		while (trung == true) {
			if (a!=a1 && a!=a2) {
				trung = false;
			} else
				a = rd.nextInt(7)+1;
		}
		trung = true;
	}
	
	//xoay block
	public void xoayblock() {
		if (xoay == 4) {
			xoay =1;
		} else {
			xoay++;
		}
	}
	
	//reset do cao
	public void resetBlock() {
		y=0;
		x=200;
		random();
		xoay=1;
		f1=true; f2=true; f3=true; f4=true;
	}
	
	
	//ve block
	public void paint(Graphics g) {
		a=2;
		g.setColor(Color.red);
		switch (a) {
		case 1:								//hinh vuong	
			x1=x;		y1=y;
			x2=x+50;	y2=y;
			x3=x;		y2=y+50;
			x4=x+50;	y4=y+50;
			f1=cellB.cellDF(g, x, y);
			f2=cellB.cellDF(g, x+50, y);
			f3=cellB.cellDF(g, x, y+50);
			f4=cellB.cellDF(g, x+50, y+50);
			break;
			
			
			
		case 2:								//hinh line
			switch (xoay) {
			case 1:
			case 3:			
				x1=x;		y1=y;
				x2=x;		y2=y-50;
				x3=x;		y3=y+50;
				x4=x;		y4=y+100;
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x, y-50);
				f3=cellB.cellDF(g, x, y+50);
				f4=cellB.cellDF(g, x, y+100);
				break;
			case 2:
			case 4:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x-50, y);
				f3=cellB.cellDF(g, x+50, y);
				f4=cellB.cellDF(g, x+100, y);
				break;
			}
			break;
			
			
			
			
		case 3:								//hinh chu T
			switch (xoay) {
			case 1:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x-50, y);
				f3=cellB.cellDF(g, x+50, y);
				f4=cellB.cellDF(g, x, y-50);
				break;
			case 2:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x+50, y);
				f3=cellB.cellDF(g, x, y-50);
				f4=cellB.cellDF(g, x, y+50);
				break;
			case 3:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x-50, y);
				f3=cellB.cellDF(g, x+50, y);
				f4=cellB.cellDF(g, x, y+50);
				break;
			case 4:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x-50, y);
				f3=cellB.cellDF(g, x, y+50);
				f4=cellB.cellDF(g, x, y-50);
				
			}
			break;
			
			
			
		case 4:								//hinh L
			switch (xoay) {
			case 1:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x+50, y+50);
				f3=cellB.cellDF(g, x, y-50);
				f4=cellB.cellDF(g, x, y+50);
				break;
			case 2:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x+50, y);
				f3=cellB.cellDF(g, x-50, y);
				f4=cellB.cellDF(g, x-50, y+50);
				break;
			case 3:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x, y+50);
				f3=cellB.cellDF(g, x, y-50);
				f4=cellB.cellDF(g, x-50, y-50);
				break;
			case 4:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x+50, y);
				f3=cellB.cellDF(g, x-50, y);
				f4=cellB.cellDF(g, x+50, y-50);
				break;
			}
			break;
	
			
			
		case 5:								//hinh j
			switch (xoay) {
			case 1:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x, y+50);
				f3=cellB.cellDF(g, x, y-50);
				f4=cellB.cellDF(g, x-50, y+50);
				break;
			case 2:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x+50, y);
				f3=cellB.cellDF(g, x-50, y);
				f3=cellB.cellDF(g, x-50, y-50);
				break;
			case 3:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x, y-50);
				f3=cellB.cellDF(g, x, y+50);
				f4=cellB.cellDF(g, x+50, y-50);
				break;
			case 4:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x-50, y);
				f3=cellB.cellDF(g, x+50, y);
				f4=cellB.cellDF(g, x+50, y+50);
				break;
			}
		break;
			
		
		
		case 6:								//hinh S
			switch (xoay){
			case 1:
			case 3:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x-50, y);
				f3=cellB.cellDF(g, x, y-50);
				f4=cellB.cellDF(g, x+50, y-50);
				break;
			case 2:
			case 4:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x, y-50);
				f3=cellB.cellDF(g, x+50, y);
				f4=cellB.cellDF(g, x+50, y+50);
				break;
			}
			break;
			
			
			
		case 7: 							//hinh Z
			switch (xoay){
			case 1:
			case 3:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x+50, y);
				f3=cellB.cellDF(g, x-50, y-50);
				f4=cellB.cellDF(g, x, y-50);
			break;
			case 2:
			case 4:
				f1=cellB.cellDF(g, x, y);
				f2=cellB.cellDF(g, x, y+50);
				f3=cellB.cellDF(g, x+50, y);
				f4=cellB.cellDF(g, x+50, y-50);
			break;
			}
		break;
		default:
			break;
		}
		
		
		
		//ve block co san
		g.setColor(Color.red);
		for(i=0;i<10;i++) {
			for(j=0;j<16;j++) {
				if(Data.board[i][j] == 1) {
					g.fillRect(i*50, j*50, 50, 50);
				}
			}
		}
	}

}
