package _3장;

import java.awt.Color;
import java.awt.Graphics;

public class RectangleClass extends java.applet.Applet{

	private int baseX, baseY;
	private int thick;
	private int recWidth, recHeight;
	
	public void init() {
		
		baseX=50;
		baseY=50;
		thick=15;
		recWidth=recHeight=200;
		
		setSize(400, 400);
	
	}
	
	public void paint(Graphics g) {
		
		for(int i=thick;i>=0;i--) {
			
			if(i>0)
				g.setColor(Color.blue);
			else
				g.setColor(Color.yellow);
			
			g.fillRect(baseX+i, baseY+ i, recWidth, recHeight);
			
		}
		
		
		g.setColor(Color.red);
		g.drawString("2016108251 강재희", 100, 150);
	
		g.drawRect(10,  10,  100,  50);
		g.drawRect(50,  50,  150 , 170);
	
		
		
	}
	
	
	
}
