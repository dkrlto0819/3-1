package 객체6차과제;

public class 계산 {
	private float 수입비율, 지출비율;
	
	public void 비율_계산하기(int 예상수입, int 예상지출, int 예상수입잔액, int 예상지출잔액){
		수입비율=(float)예상수입잔액/예상수입;
		지출비율=(float)예상지출잔액/예상지출;
	}
	
	public float 수입비율_가져오기() { return 수입비율*100; }
	public float 지출비율_가져오기() { return 지출비율*100; }
}
