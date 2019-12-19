package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Draw extends JPanel implements Runnable{
	
	private Block blockD = new Block();
	private Check checkD = new Check();
	private Data dataD = new Data();
	private BlockDraw blockbdD = new BlockDraw();
	
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
		blockbdD.paint(g);
		
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
		int a=1000;
		boolean r,l;
		while (true) {
			
			//set delay
			try {
				Thread.sleep(a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
			blockD.tangY();
			
			checkD.ResetChua();
			l=checkD.checkSideLeft();
			r=checkD.checkSideRight();
			a++;
						
			int xoay=blockbdD.getXoay();
			int x=blockbdD.getX();
			int y=blockbdD.getY();
			System.out.println("x="+x+" y="+y+" xoay="+xoay+" Toc do roi="+a+"\t"+l+"\t"+r);
		}
	}

}
