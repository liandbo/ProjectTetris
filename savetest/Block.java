package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Block extends JPanel{
	
	private static int x=200;
	private static int y=0;
	private int i,j;
	private static int a=4;
	private static int xoay= 1;


	public int getX() {
		return x;
	}
	
	public static void setX(int x) {
		Block.x = x;
	}


	public int getY() {
		return y;
	}
	
	public static int getA()
	{
		return a;
	}
	
	public static int getXoay()
	{
		return xoay;
	}
	
	
	public static void setY(int y) {
		Block.y = y;
	}

	//giam do cao
	public void tangY() {
		if(y<700) {
			y+=50;
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
		Random rd = new Random();
		a = rd.nextInt(7)+1;
	}
	
	//xoay block
	public void xoayblock() {
		if (xoay == 4) {
			xoay =1;
		} else {
			xoay++;
		}
	}
	
	
	//ve block
	public void paint(Graphics g) {
		//a=2;
		g.setColor(Color.red);
		switch (a) {
		case 1:								//hinh vuong
			g.fillRect(x, y-50, 100, 100);
			break;
			
			
			
		case 2:								//hinh line
			switch (xoay) {
			case 1:
			case 3:
				g.fillRect(x, y, 50, 150);
				g.fillRect(x, y-50, 50, 50);
				break;
			case 2:
			case 4:
				g.fillRect(x, y, 150, 50);
				g.fillRect(x-50, y, 50, 50);
				break;
			}
			break;
			
			
			
			
		case 3:								//hinh chu T
			switch (xoay) {
			case 1:
				g.fillRect(x-50, y, 150, 50);
				g.fillRect(x, y-50, 50, 50);
				break;
			case 2:
				g.fillRect(x, y-50, 50, 150);
				g.fillRect(x, y, 100, 50);
				break;
			case 3:
				g.fillRect(x-50, y, 150, 50);
				g.fillRect(x, y, 50, 100);
				break;
			case 4:
				g.fillRect(x, y-50, 50, 150);
				g.fillRect(x-50, y, 50, 50);
				
			}
			break;
			
			
			
		case 4:								//hinh J
			switch (xoay) {
			case 1:
				g.fillRect(x, y-50, 50, 150);
				g.fillRect(x, y+50, 100, 50);
				break;
			case 2:
				g.fillRect(x-50, y, 150, 50);
				g.fillRect(x-50, y, 50, 100);
				break;
			case 3:
				g.fillRect(x, y-50, 50, 150);
				g.fillRect(x-50, y-50, 50, 50);
				break;
			case 4:
				g.fillRect(x-50, y, 150, 50);
				g.fillRect(x+50, y-50, 50, 50);
				break;
			}
			break;
	
			
			
		case 5:								//hinh L
			switch (xoay) {
			case 1:
				g.fillRect(x, y-50, 50, 150);
				g.fillRect(x-50, y+50, 50, 50);
				break;
			case 2:
				g.fillRect(x-50, y, 150, 50);
				g.fillRect(x-50, y-50, 50, 50);
				break;
			case 3:
				g.fillRect(x, y-50, 50, 150);
				g.fillRect(x+50, y-50, 50, 50);
				break;
			case 4:
				g.fillRect(x-50, y, 150, 50);
				g.fillRect(x+50, y+50, 50, 50);
				break;
			}
		break;
			
		
		
		case 6:								//hinh S
			switch (xoay){
			case 1:
			case 3:
				g.fillRect(x, y-50, 100, 50);
				g.fillRect(x-50, y, 100, 50);
				break;
			case 2:
			case 4:
				g.fillRect(x-50, y-100, 50, 100);
				g.fillRect(x, y-50, 50, 100);
				break;
			}
			break;
			
			
			
		case 7: 							//hinh Z
			switch (xoay){
			case 1:
			case 3:
				g.fillRect(x-50, y-50, 100, 50);
				g.fillRect(x, y, 100, 50);
			break;
			case 2:
			case 4:
				g.fillRect(x+50, y-100, 50, 100);
				g.fillRect(x, y-50, 50, 100);
			break;
			}
		break;
		default:
			break;
		}
		
		
		
		//ve block co san
		g.setColor(Color.red);
		for(i=0;i<10;i++) {
			for(j=0;j<15;j++) {
				if(Check.board[i][j] == 1) {
					g.fillRect(i*50, 700, 50, 50);
				}
			}
		}
	}

}
