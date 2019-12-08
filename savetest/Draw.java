package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Draw extends JPanel implements Runnable{
	
	private Block blockD = new Block();
	private Check checkD = new Check();
	private Data dataD = new Data();
	
	public Draw() {
		Thread threadD = new Thread(this);
		threadD.start();
	}
	
	public void paint(Graphics g) {
		int i,j;
		int x=0;
		int h=0;
		
		//ve nen`
		g.setColor(Color.cyan);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//ve block
		blockD.paint(g);
		
		// ve vach
		g.setColor(Color.white);
		for(i=0;i<11;i++) {									// doc
			g.drawLine(x, 0, x, 750);
			x+=50;
		}
		for(i=0;i<16;i++) {									// ngang
			g.drawLine(0, h, 500, h);
			h+=50;
		}
		

	}

	//Ve
	public void run() {
		while (true) {
			
			
			
			//set delay
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			blockD.tangY();
			repaint();
			if(checkD.ResetChua()) {
				dataD.LuuHinh(Block.x1, Block.y1);
				dataD.LuuHinh(Block.x2, Block.y2);
				dataD.LuuHinh(Block.x3, Block.y3);
				dataD.LuuHinh(Block.x4, Block.y4);
				blockD.resetBlock();
			}
			
			
			
		}
	}

}
