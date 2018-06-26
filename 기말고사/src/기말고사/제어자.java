package 기말고사;

import java.awt.*;

public class 제어자 {
	private int[] 가격표;
	private int[] 주문수량들;
	private int 음식수;
	private int[] 최종계산서;
	private int 총금액;
	
	c차림표 차림표;
	c주문입력창 주문서;
	계산하기 주문계산;
	c주문결산창 계산서;
	
	public void 주문서_받기(int[] 주문수량){
		c차림표 차림표=new c차림표();
		주문계산=new 계산하기();
		음식수=차림표.음식수_얻기();
		
		가격표=new int[음식수+1];
		주문수량들=new int[음식수+1];
		최종계산서=new int[음식수+1];
		
		가격표=차림표.음식가격들_얻기();
		주문수량들=주문수량;
		
		주문계산.가격계산하기(주문수량들, 가격표, 음식수);
		최종계산서=주문계산.계산서_가져오기();
		총금액=주문계산.총금액_가져오기();
		
	}
	
	public void 주문서_가져오기(){
		  Frame f = new Frame();
	      c주문결산창 주문서 = new c주문결산창(f, 음식수);
	      
	      주문서.setSize     (500, 500); 
	      주문서.setLocation (400, 400);
	      주문서.setResizable(false);
	      주문서.setVisible  (true);
	      주문서.자료_설정(주문수량들, 최종계산서, 총금액, 차림표);
	}
	
}
