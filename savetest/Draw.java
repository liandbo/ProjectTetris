package test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Draw extends JPanel implements Runnable{
	
	public Draw() {
		Thread threadD = new Thread(this);
		threadD.start();
	}
	
	public void paint(Graphics g) {
		int i;
		int x=0;
		int h=0;
		g.setColor(Color.cyan);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.white);
		for(i=0;i<11;i++) {
			g.drawLine(x, 0, x, getHeight());
			x+=50;
		}
		for(i=0;i<16;i++) {
			g.drawLine(0, h, 500, h);
			h+=50;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
