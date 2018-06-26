package 마지막과제;

public class 잔액계산 {
	
	int[] 수입, 지출, 잔액;
	int 총수입, 총지출, 총잔액;

	잔액계산(int[] 입력수입, int[] 입력지출) {
		수입=new int[10];
		지출=new int[10];
		잔액=new int[10];
		
		수입=입력수입;
		지출=입력지출;
		계산하기();
	}
	public void 계산하기() {
		
		for(int i=0;i<10;i++)  {
			총수입+=수입[i];
			총지출+=지출[i];
			잔액[i]=총수입-총지출;
		}
		총잔액=총수입-총지출;
	}
	
	public int[] 잔액_가져오기() {
		return 잔액;
	}
	
	public int 총수입_가져오기() { return 총수입; }
	public int 총지출_가져오기() { return 총지출; }
	public int 총잔액_가져오기() { return 총잔액; }

}
