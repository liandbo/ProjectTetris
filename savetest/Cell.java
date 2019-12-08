package test;

import java.awt.Graphics;

public class Cell {
	
	
	
	//ve cell va check cell co roi dc ko
	public boolean cellDF(Graphics g, int a, int b) {
		g.fillRect(a, b, 50, 50);
			if ( Data.board[a/50][(b/50) +1]==1 || b==700) return false;
		return true;
	}
	
	
	
}
