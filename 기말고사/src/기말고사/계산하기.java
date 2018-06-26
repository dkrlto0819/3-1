package 기말고사;

public class 계산하기 {

	private int[] 계산서;
	private int 총금액;
	
	public void 가격계산하기(int[] 주문수량들, int[] 가격표, int 음식수) {
		계산서=new int[음식수+1];
		
		for(int i=1;i<=음식수;i++) {
			계산서[i]=주문수량들[i]*가격표[i];
			총금액+=계산서[i];
		}
	}
	
	public int[] 계산서_가져오기() { return 계산서; }
	public int 총금액_가져오기() { return 총금액; }

}
