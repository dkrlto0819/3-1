package _3장;

import java.awt.*;
import javax.swing.*;

public class DrawString1 extends JApplet{

	Font gulim;
	Font timesroman;
	
	public void init() {
		
		gulim=new Font("굴림", Font.BOLD, 30);
		timesroman=new Font("Timesroman", Font.ITALIC, 40);
		
		
	}
	
	public void paint(Graphics g) {
		
		g.setFont(gulim);
		g.setColor(Color.red);
		g.drawString("HelloWrold!", 10, 30);
		
	}

	
}
