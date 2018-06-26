package 컴그;

import java.awt.*;
import java.awt.geom.*;
import java.applet.*;
import javax.swing.*;


public class 과제1 extends JApplet {

	private int vertexCount=8;
	private int[] xPoints=new int[vertexCount];
	private int[] yPoints=new int[vertexCount];
	private Polygon polygon=null;
	
	//정적 메소드:y좌표 교정용
	private static int rY(int y) {
		return -y;
	}
	
	public void init() {
		setSize(610, 410);
	}

	public void paint(Graphics g) {
		//이 자리에 기본 도형 객체를 생성합니다.
		
		
		
		//기준좌표를 화면 중앙으로 이동하고
		//좌표 시스템을 그립니다.
		g.translate(300, 200);
		drawCartesian(g);
		
		//이 자리에 기본 도형 객체를 생성하고,
		//변환한 다음 결과도형 객체를 다시 출력합니다.
	}
	
	////////좌표 그리기에 관련된 메소드/////////////
	private void drawCartesian(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(Color.white);
		g.fillRect(-305, -205, 610, 410);
		g.setColor(oldColor);
		
		g.setColor(Color.gray);
	
		drawName(g);	
		
		drawGrid(g);
		drawAxis(g);
	}
	
	private void drawName(Graphics g) {
		
		g.setColor(Color.gray);
		
		g.fillRect(-305, -205, 100, 50);
		g.fillRect(-205, -205, 50, 100);
		
		g.fillRect(-125, -205, 50, 100);
		g.fillRect(-75, -175, 50, 30);
		
		g.fillOval(-275, -100, 220, 100);
		g.setColor(Color.white);
		g.fillOval(-225, -75, 120, 50);  		/////강
		
		
		g.setColor(Color.gray);
		
		g.fillRect(30, -205, 150, 50);
		g.fillRect(80, -205, 50, 100);
		
		int[] coordX1 = {105, 30, 180};
		int[] coordY1 = {-190, 0, 0};
		
		g.fillPolygon(coordX1, coordY1, 3);
		
		int[] coordX2= {105, 80, 130};
		int[] coordY2= {-80, 0, 0};
		
		g.setColor(Color.white);
		
		g.fillPolygon(coordX2, coordY2, 3);
		
		g.setColor(Color.gray);
		
		g.fillRect(200, -205, 40, 205);
		g.fillRect(250, -205, 40, 205);
		
		g.fillRect(230, -130, 20, 50); ///재
		
		g.fillRect(-260, 00, 100, 30);
		g.fillRect(-300, 40, 200, 30); 
		
		g.fillOval(-280, 80, 140, 70);
		
		g.setColor(Color.WHITE);
		
		g.fillOval(-250, 95, 80, 40);
		
		g.setColor(Color.gray);
		
		g.fillRect(-300, 160, 200, 30); 
		g.fillRect(-90, 0, 40, 200);  ///희
		
	}
	
	
	////그리드 출력하기
	
	public void drawGrid(Graphics g) {
		g.setColor(Color.lightGray);
		
		for(int t=0;t<300;t+=10) {
			g.drawLine(t, rY(200), t, rY(-200));
			g.drawLine(-t, rY(200), -t, rY(-200));
		}
		
		for(int t=0;t<200;t+=10) {
			g.drawLine(-300, rY(t), 300, rY(t));
			g.drawLine(-300, rY(-t), 300, rY(-t));
		}
	}
	
	
	//////좌표축 그리기
	public void drawAxis(Graphics g) {
		g.setColor(Color.black);
		g.drawRect(-300, rY(200), 600, 400);
		g.drawLine(0, 0, 300, 0);
		g.drawLine(0, 0, 0, rY(200));
		g.drawLine(0, 0, -300, 0);
		g.drawLine(0, 0, 0, rY(-200));
		
		for(int t=0;t<300;t+=30) {
			g.drawLine(t, 0, t, rY(4));
			g.drawLine(-t, 0, -t, rY(4));
			drawCoordLabel(g, String.valueOf(t), t, 0, 0);
			drawCoordLabel(g, String.valueOf(-t), -t, 0, 0);
		}
		
		for(int t=30;t<200;t+=30) {
			g.drawLine(0, rY(t), 4, rY(t));
			g.drawLine(0, rY(-t), 4, rY(-t));
			drawCoordLabel(g, String.valueOf(t), -10, rY(t), 1);
			drawCoordLabel(g, String.valueOf(-t), -10, rY(-t), 1);
		}
	}
	
	//좌표 눈금 표시하기
	public void drawCoordLabel(Graphics g, String label, int x, int y, int direction) {
		Graphics2D g2=(Graphics2D) g;
		
		FontMetrics metrics = g2.getFontMetrics();
		Rectangle2D.Float box=(Rectangle2D.Float)metrics.getStringBounds(label, g2);
		
		if(direction==0)
			g2.drawString(label, x-box.width/2, y+box.height);
		else
			g2.drawString(label, x-box.width, y+box.height/2);
	}
}
