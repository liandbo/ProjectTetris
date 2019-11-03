package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Block extends JPanel{
	
	private static int x=0;
	private static int y=0;
	private int i,j;


	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
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
		if(x<500) {
			x+=50;
		}
	}
	
	//di qua trai (giam x)
	public void giamX() {
		if(x>0) {
			x-=50;
		}
	}
	
	
	//ve block
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 50, 50);
		
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
