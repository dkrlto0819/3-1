package 기말고사_객체;

public class 제어자 {
	c차림표 차림표;
	계산서 계산서;
	
	private int[] 음식가격표;
	private int[] 음식주문량;
	private int[] 최종계산서;
	private int 음식수량;
	private int 합계;
	
	public void 주문량_저장하기(int[] 주문수량들) {
		차림표=new c차림표();
		음식수량=주문수량들.length;
		
		음식가격표=new int[음식수량+1];
		음식주문량=new int[음식수량+1];
		
		음식가격표=차림표.음식가격들_얻기();
		음식주문량=주문수량들;
	}

	public void 가격계산() { 
		계산서=new 계산서();
		계산서.내역계산하기(음식가격표, 음식주문량, 음식수량); 
		합계=계산서.합계_가져오기();
		최종계산서=계산서.최종계산서_가져오기();
	}
	
	public int 총액_가져오기() { return 합계; }
	public int[] 최종계산_가져오기() { return 최종계산서; }

}
