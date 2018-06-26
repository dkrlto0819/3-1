package 객체과제5월23일;

public class 계산 {
	private float 수입비율, 지출비율;
	
	public void 비율_계산하기(int 예상수입, int 예상지출, int 총수입, int 총지출){
		수입비율=(float)(예상수입-총수입)/예상수입;
		지출비율=(float)(예상지출-총지출)/예상지출;
	}
	
	public float 수입비율_가져오기() {
		return 수입비율*100;
	}
	
	public float 지출비율_가져오기() {
		return 지출비율*100;
	}
}
