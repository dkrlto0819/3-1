package 기말고사_객체;

public class 계산서 {
	
	private int[] 최종가격들;
	private int 합계;

	public void 내역계산하기(int[] 음식가격표, int[] 음식주문량, int 음식수) {
		최종가격들=new int[음식수+1];
		for(int i=1;i<=10;i++) {
			최종가격들[i]=음식주문량[i]*음식가격표[i];
			합계+=최종가격들[i];
		}
	}
	
	public int[] 최종계산서_가져오기() { return 최종가격들; }
	public int 합계_가져오기() { return 합계; }
}
