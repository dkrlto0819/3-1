package 컴그7장;

import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.geom.*;

public class CurvePanel2 extends JPanel{
	Point2D start, end, control;
	QuadCurve2D curve;
	
	Rectangle bcArea;
	
	public CurvePanel2() {
		start=new Point2D.Double();
		end=new Point2D.Double();
		control=new Point2D.Double();
		curve=new QuadCurve2D.Double();
	}
	
	public void paint(Graphics g) {
		Graphics2D g2=(Graphics2D)g;
		
		Dimension dim=getSize();
		bcArea=new Rectangle(dim);
		
		g2.setPaint(Color.yellow);
		g2.fill(bcArea);
		
		double w=dim.width;
		double h =dim.height;
		double interval=w/(2*15);
		double cX = w*0.3;
		double cY= h*0.3;
		double x=0;
		
		for(int n=0;n<15;n++) {
			x += interval;
			start.setLocation(x, h-1);
			end.setLocation(w-x, h-1);
			control.setLocation(cX, cY-x*2);
			g2.setPaint(Color.red);
			g2.setStroke(new BasicStroke(3.0F));
			curve.setCurve(start, control, end);
			g2.draw(curve);
		}
	}
}
