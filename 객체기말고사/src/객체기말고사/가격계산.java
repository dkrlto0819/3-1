package 객체기말고사;

public class 가격계산 {
	private int[] 음식가격들;
	private int[] 총금액;
	
	가격계산(){
		음식가격들 = new int[] {0, 8000, 7000, 7000, 7000, 7000, 6000, 9000, 6000, 6000, 7000};
	}
	
	public void 금액_계산하기(int[] 음식주문수) {
		for(int i=1;i<=10;i++) 총금액[i]=음식가격들[i]*음식주문수[i];
	}
	
	public int[] 금액_가져오기() {
		return 총금액;
	}

}
