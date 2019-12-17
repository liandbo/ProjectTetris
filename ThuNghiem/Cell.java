package test;

import java.awt.Graphics;

public class Cell {
	
	
	
	//ve cell va check dieu kien cua cell
	public int cellDF(Graphics g, int a, int b) {
		g.fillRect(a, b, 50, 50);
		int down,right,left;
		if (a<450) {
			if ( Data.board[(a/50) +1][b/50]==1) right=0; else right=1;
			}
		else right=0;
		if (a>0) {
			if ( Data.board[(a/50) -1][b/50]==1) left=0; else left=1;
			}
		else left=0;
		if (b<700) {
			if ( Data.board[a/50][(b/50) +1]==1) down=0; else down=1;
		}
		else down=0;		
		
		return down*100 + right*10 + left;
	}
	
	
}
