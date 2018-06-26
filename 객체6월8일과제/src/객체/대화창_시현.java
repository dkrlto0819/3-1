package 객체;

import java.awt.*;

public class 대화창_시현 extends Frame{
	public 대화창_시현() {
		super("장부 프로그램");
		입력창 대화창=new 입력창(this, "장부 입력창");
		대화창.setSize(700,500);
		
		대화창.setVisible(true);
	}
	
	public static void main(String[] args) {
		대화창_시현 시현창=new 대화창_시현();
		시현창.setSize(0,0);
		시현창.setVisible(true);
	}
}
