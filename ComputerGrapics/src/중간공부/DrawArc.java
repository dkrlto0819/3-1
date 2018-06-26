package 중간공부;

import java.awt.*;
import javax.swing.*;

public class DrawArc extends JApplet{	
	private int mNumberOfLines=25;
	private Color [] mColors= {Color.red, Color.blue, Color.green};
	
	public void init() {
		
	}
	
	Color[] color;
	
	public void paint(Graphics g) {
		
		color=new Color[3];
		
		color[0]= Color.black;
		color[1]= Color.blue;
		color[2]=Color.YELLOW;
		
		for(int i=0;i<15;i++) {
			g.setColor(color[i%3]);
			g.drawOval(250-(i*15), 190-(i*15), i*15, i*15);
		}
		
		/*
		Dimension d=getSize();
		g.setColor(Color.black);
		g.drawRect(0, 0, d.width-1, d.height-1);
		
		for(int i=0;i<mNumberOfLines;i++) {
			double ratio=(double)i/(double)mNumberOfLines;
			
			g.setColor(mColors[i%mColors.length]);
			g.drawLine(0, (int)(ratio*d.height), (int)(ratio*d.width), d.height);
		}
		g.drawRect(0, 0, 299, 199);
		
		g.setColor(Color.black);
		for(int i=0;i<20;i++)
			g.drawLine(0, 10*i, 15*i, 199);
		*/
		
		
	
	}
}
