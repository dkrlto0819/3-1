package 컴그;

import java.awt.*;
import javax.swing.*;

public class SineAni extends JApplet{
	private Graphics offScreenBuffer=null;
	private Image offScreenImage=null;
	
	private int width;
	private int height;
	
	private int baseY=400;
	private int currentX=0;
	private int currentY=baseY;
	
	public void init() {
		setSize(400, 400);
		
		Dimension d=getSize();
		width=d.width;
		height=d.height;
		offScreenImage=this.createImage(width, height);
		offScreenBuffer=offScreenImage.getGraphics();
	}
	public void update(Graphics gc) {
		paint(gc);
	}
	
	public void paint(Graphics gc) {
		offScreenBuffer.setColor(Color.LIGHT_GRAY);
		offScreenBuffer.fillRect(0, 0, width, height);
		
		offScreenBuffer.setColor(Color.red);
		drawSine(offScreenBuffer, gc);
	}
	
	public void drawSine(Graphics gc, Graphics gcMain) {
		for(int angle=0; angle<width; angle+=5) {
			currentX=angle;
			currentY=-(int)(Math.sin(angle*Math.PI/180)*100);
			drawCircle(gc, currentX, currentY+baseY);

			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}

			gcMain.drawImage(offScreenImage, 0, 0, this);
		}
	}
	
	public void drawCircle(Graphics gc, int xCoord, int yCoord) {
		gc.setColor(Color.WHITE);
		gc.fillRect(0, 0, width, height);
		gc.setColor(Color.red);
		gc.fillOval(xCoord, yCoord, 5, 5);
	}
}
