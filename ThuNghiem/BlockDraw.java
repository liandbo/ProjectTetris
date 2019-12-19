package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BlockDraw extends JPanel {

	private Cell cellBD = new Cell();
	
	private static int x=200;
	private static int y=50;
	private int i,j;
	private static int a=1;
	private static int xoay= 1;
	public static int f1,f2,f3,f4;
	public static int x1,x2,x3,x4;
	public static int y1,y2,y3,y4;
	
	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public static void setXoay(int xoay) {
		BlockDraw.xoay = xoay;
	}

	public int getX() {
		return x;
	}
	
	public static void setX(int x) {
		BlockDraw.x = x;
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
		BlockDraw.a = a;
	}

	public static void setY(int y) {
		BlockDraw.y = y;
		}
	//ve block
		public void paint(Graphics g) {
//			a=2;
			g.setColor(Color.red);
			switch (a) {
			case 1:								//hinh vuong	
				x1=x;		y1=y;
				x2=x+50;	y2=y;
				x3=x;		y3=y-50;
				x4=x+50;	y4=y-50;
				f1=cellBD.cellDF(g, x1, y1);
				f2=cellBD.cellDF(g, x2, y2);
				f3=cellBD.cellDF(g, x3, y3);
				f4=cellBD.cellDF(g, x4, y4);
				break;
				
				
				
			case 2:								//hinh line
				switch (xoay) {
				case 1:
				case 3:			
					x1=x;		y1=y;
					x2=x;		y2=y-50;
					x3=x;		y3=y+50;
					x4=x;		y4=y+100;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 2:
				case 4:
					x1=x;		y1=y;
					x2=x-50;	y2=y;
					x3=x+50;	y3=y;
					x4=x+100;	y4=y;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				}
				break;
				
				
				
				
			case 3:								//hinh chu T
				switch (xoay) {
				case 1:
					x1=x;		y1=y;
					x2=x-50;	y2=y;
					x3=x+50;	y3=y;
					x4=x;		y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 2:
					x1=x;		y1=y;
					x2=x+50;	y2=y;
					x3=x;		y3=y-50;
					x4=x;		y4=y+50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 3:
					x1=x;		y1=y;
					x2=x-50;	y2=y;
					x3=x+50;	y3=y;
					x4=x;		y4=y+50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 4:
					x1=x;		y1=y;
					x2=x-50;	y2=y;
					x3=x;		y3=y+50;
					x4=x;		y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					
				}
				break;
				
				
				
			case 4:								//hinh L
				switch (xoay) {
				case 1:
					x1=x;		y1=y;
					x2=x+50;	y2=y+50;
					x3=x;		y3=y-50;
					x4=x;		y4=y+50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 2:
					x1=x;		y1=y;
					x2=x+50;	y2=y;
					x3=x-50;	y3=y;
					x4=x-50;	y4=y+50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 3:
					x1=x;		y1=y;
					x2=x;		y2=y+50;
					x3=x;		y3=y-50;
					x4=x-50;	y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 4:
					x1=x;		y1=y;
					x2=x+50;	y2=y;
					x3=x-50;	y3=y;
					x4=x+50;	y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				}
				break;
		
				
				
			case 5:								//hinh j
				switch (xoay) {
				case 1:
					x1=x;		y1=y;
					x2=x;		y2=y+50;
					x3=x;		y3=y-50;
					x4=x-50;	y4=y+50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 2:
					x1=x;		y1=y;
					x2=x+50;	y2=y;
					x3=x-50;	y3=y;
					x4=x-50;	y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 3:
					x1=x;		y1=y;
					x2=x;		y2=y-50;
					x3=x;		y3=y+50;
					x4=x+50;	y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 4:
					x1=x;		y1=y;
					x2=x-50;	y2=y;
					x3=x+50;	y3=y;
					x4=x+50;	y4=y+50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				}
			break;
				
			
			
			case 6:								//hinh S
				switch (xoay){
				case 1:
				case 3:
					x1=x;		y1=y;
					x2=x-50;	y2=y;
					x3=x;		y3=y-50;
					x4=x+50;	y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				case 2:
				case 4:
					x1=x;		y1=y;
					x2=x;		y2=y-50;
					x3=x+50;	y3=y;
					x4=x+50;	y4=y+50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
					break;
				}
				break;
				
				
				
			case 7: 							//hinh Z
				switch (xoay){
				case 1:
				case 3:
					x1=x;		y1=y;
					x2=x+50;	y2=y;
					x3=x-50;	y3=y-50;
					x4=x;		y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
				break;
				case 2:
				case 4:
					x1=x;		y1=y;
					x2=x;		y2=y+50;
					x3=x+50;	y3=y;
					x4=x+50;	y4=y-50;
					f1=cellBD.cellDF(g, x1, y1);
					f2=cellBD.cellDF(g, x2, y2);
					f3=cellBD.cellDF(g, x3, y3);
					f4=cellBD.cellDF(g, x4, y4);
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
