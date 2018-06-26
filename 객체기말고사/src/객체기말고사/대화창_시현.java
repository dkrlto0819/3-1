package 객체기말고사;

import java.awt.*;

public class 대화창_시현 extends Frame{
	public 대화창_시현() {
		super("장부 프로그램");
		c차림표 차림표=new c차림표();
		c주문입력창 대화창=new c주문입력창(this, 차림표);
		대화창.setSize(250,400);
		
		대화창.setVisible(true);
	}
	
	public static void main(String[] args) {
		대화창_시현 시현창=new 대화창_시현();
		시현창.setSize(0,0);
		시현창.setVisible(true);
	}
}
