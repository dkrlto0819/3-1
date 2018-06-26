package 중간고사;

public class 지출 {
	private int 총_지출;

	public void 지출_관리(int 가격) {	총_지출 += 가격; 	}
	
	public int 최종_금액() {	return 총_지출;	}
}
