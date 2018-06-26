package 컴그7장;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;
import 컴그7장.MyCanvasApplet;

public class DrawElipse2DArt extends JApplet implements ActionListener{
	Container c;
	MyCanvasApplet mc;
	Panel p;
	Button doit;
	
	public void init() {
		c=getContentPane();
		mc = new MyCanvasApplet(400, 300);
		p=new Panel();
		doit=new Button("Do it");
		doit.addActionListener(this);
		p.add(doit);
		
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.NORTH,p);
		c.add(BorderLayout.CENTER, mc);
	}
	
	public void actionPerformed(ActionEvent e) {
		mc.repaint();
	}
}

