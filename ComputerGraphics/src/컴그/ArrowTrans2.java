package 컴그;

import java.awt.*;
import java.awt.geom.*;
import java.applet.*;
import javax.swing.*;


public class ArrowTrans2 extends JApplet {

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
		
		g.translate(300, 200);
		drawCartesian(g);
		
		
		//이 자리에 기본 도형 객체를 생성합니다.
		xPoints[0]=100; yPoints[0]=rY(150);
		xPoints[1]=50; yPoints[1]=rY(100);
		xPoints[2]=70; yPoints[2]=rY(100);
		xPoints[3]=70; yPoints[3]=rY(50);
		xPoints[4]=130; yPoints[4]=rY(50);
		xPoints[5]=130; yPoints[5]=rY(100);
		xPoints[6]=150; yPoints[6]=rY(100);
		xPoints[7]=100; yPoints[7]=rY(150);

		
		polygon= new Polygon(xPoints, yPoints, vertexCount);
	
		//기준좌표를 화면 중앙으로 이동하고
		//좌표 시스템을 그립니다.
		
		//이 자리에 기본 도형 객체를 생성하고,
		//변환한 다음 결과도형 객체를 다시 출력합니다.
		
		
		Graphics2D g2=(Graphics2D) g;
		g2.setColor(Color.red);
		g2.setStroke(new BasicStroke(2));
		g2.drawPolygon(polygon);
		
		scaling(xPoints, yPoints, vertexCount, 0.9, 1.0);
		rotate(xPoints, yPoints, vertexCount, 20.0*(Math.PI/180));
		Polygon poly=new Polygon(xPoints, yPoints, vertexCount);
		g2.drawPolygon(poly);
		
		scaling(xPoints, yPoints, vertexCount, 0.9, 1.0);
		rotate(xPoints, yPoints, vertexCount, 25.0*(Math.PI/180));
		poly=new Polygon(xPoints, yPoints, vertexCount);
		g2.drawPolygon(poly);
		
		scaling(xPoints, yPoints, vertexCount, 0.8, 1.0);
		rotate(xPoints, yPoints, vertexCount, 30.0 * (Math.PI/180));
		translation(xPoints, yPoints, vertexCount, 0, 30);
		poly=new Polygon(xPoints, yPoints, vertexCount);
		g2.drawPolygon(poly);
		
		scaling(xPoints, yPoints, vertexCount, 1.3, 0.9);
		rotate(xPoints, yPoints, vertexCount, 10.0*(Math.PI/180));
		scaling(xPoints, yPoints, vertexCount, 1.0, 0.7);
		translation(xPoints, yPoints, vertexCount, -30, 60);
		poly=new Polygon(xPoints, yPoints, vertexCount);
		g2.drawPolygon(poly);
		
		scaling(xPoints, yPoints, vertexCount, 1.3, 0.9);
		rotate(xPoints, yPoints, vertexCount, 5.0*(Math.PI/180));
		scaling(xPoints, yPoints, vertexCount, 1.0, 0.7);
		translation(xPoints, yPoints, vertexCount, -30, 60);
		poly=new Polygon(xPoints, yPoints, vertexCount);
		g2.fillPolygon(poly);
		
	}
	
	private void scaling(int[] xP, int[] yP, int n, double sx, double sy) {
		for(int i=0;i<xP.length;i++) {
			xP[i]=(int)(xP[i]*sx);
		}
		for(int i=0;i<xP.length;i++) {
			yP[i]=(int)(yP[i]*sy);
		}
	}
	
	private void translation(int[] xP, int[] yP, int n, int tx, int ty) {
		for(int i=0;i<xP.length;i++) {
			xP[i]+=tx;
		}
		
		for(int i=0;i<yP.length;i++) {
			yP[i]+=ty;
		}
	}
	
	private void shearing(int[] xP, int[] yP, int n, double shX) {
		double x;
		
		for(int i=0;i<n;i++) {
			x=xP[i]+shX*(-yP[i]);
			
			xP[i]=(int)x;
		}
	}
	
	private void reflect(int[] xP, int[] yP, int n, int axis) {
		switch(axis) {
		case 0:
			for(int i=0;i<n;i++) {
				yP[i]=-yP[i];
			}
			break;
		case 1:
			for(int i=0;i<n;i++) {
				xP[i]=-xP[i];
			}
			break;
		default:
				break;
		}
	}
	
	private void rotate(int[] xP, int[] yP, int n, double theta) {
		double x, y;
		for(int i=0;i<n;i++) {
			x=(xP[i])*Math.cos(theta)-((-yP[i])*Math.sin(theta));
			y=(xP[i])*Math.sin(theta)+((-yP[i])*Math.cos(theta));
			
			xP[i]=(int)x;
			yP[i]=rY((int)y);
		}
	}

	
	////////좌표 그리기에 관련된 메소드/////////////
	private void drawCartesian(Graphics g) {
		Color oldColor = g.getColor();
		g.setColor(Color.white);
		g.fillRect(-305, -205, 610, 410);
		g.setColor(oldColor);
		
		g.setColor(Color.gray);

		
		drawGrid(g);
		drawAxis(g);
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
