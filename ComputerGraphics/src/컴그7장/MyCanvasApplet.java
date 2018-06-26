package 컴그7장;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

class MyCanvasApplet extends Canvas {
	Random random;
	int x, y, w, h;
	
	public MyCanvasApplet(int width, int height) {
		super();
		this.setSize(width, height);
		random=new Random();
	}
	
	public void paint(Graphics g) {
		Graphics2D g2=(Graphics2D)g;
		
		Dimension d = getSize();
		Rectangle2D rect;
		Ellipse2D ellipse;
		
		g2.setPaint(Color.black);
		rect=new Rectangle2D.Double(0, 0, d.width-1, d.height-1);
		g2.fill(rect);
		g2.draw(rect);
		
		g.setColor(Color.white);
		for(int i=0;i<50;i++) {
			x=(int)(random.nextDouble()*(d.width-1));
			y=(int)(random.nextDouble()*(d.height-1));
			w=h=(int)(random.nextDouble()*70);
			
			ellipse=new Ellipse2D.Double(x, y, w, h);
			g2.draw(ellipse);
		}
	}
}

