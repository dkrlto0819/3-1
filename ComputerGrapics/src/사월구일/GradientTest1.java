package 사월구일;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class GradientTest1 extends java.applet.Applet{

	private Graphics offScreenBuffer=null;
	private Image offScreenImage=null;
	
	private int width=160;
	private int height=70;
	
	private int basePointX=100;
	private int basePointY=50;
	private int currentX=basePointX;
	private int currentY=basePointY;
	
	private int rVal=0;
	private int gVal=0;
	private int bVal=255;
	
	public GradientTest1() { }
	
	public void init() {
		offScreenImage=this.createImage(300, 200);
		offScreenBuffer=offScreenImage.getGraphics();
		
		setSize(300, 200);
	}
	
	public void paint(Graphics gc) {
		
		offScreenBuffer.setColor(Color.black);
		offScreenBuffer.fillRect(0,  0,  300,  200);
		
		drawGradient(offScreenBuffer);
		
		gc.drawImage(offScreenImage, 0, 0, this);
		
		gc.setColor(Color.white);
		gc.drawString("2016108251 강재희", 90, 150);
	}
	
	public void drawGradient(Graphics gc) {
		
		currentY=basePointY+height;
		 
		for(int z=0;z<width;z++) {
			currentX=basePointX+z-40; //그라디언트를 늘리기위해 조절해주었습니
			
			rVal=z*255/width;
			gVal=z*255/width;
			bVal=255-z*255/width;
			
			gc.setColor(new Color(rVal, gVal, bVal));
			gc.drawLine(currentX, basePointY, currentX, currentY);
		}
	}
	
}
