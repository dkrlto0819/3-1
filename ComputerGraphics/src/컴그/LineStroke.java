package 컴그;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LineStroke extends JApplet{
	Line2D line1;
	Line2D line2;
	Line2D line3;
	Stroke stroke;

	public void paint(Graphics g) {
		Graphics2D g2=(Graphics2D) g;
		 line1=new Line2D.Double(50, 50, 400, 50);
		 line2=new Line2D.Double(50, 130, 400, 130);
		 line3=new Line2D.Double(50, 210, 400, 210);
		 
		 stroke=new BasicStroke(20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] {30, 25, 60, 25}, 0);
		 g2.setStroke(stroke);
		 g2.draw(line2);
		 
		 stroke=new BasicStroke(20);
		 g2.setStroke(stroke);
		 g2.draw(line3);
		
	}
}
