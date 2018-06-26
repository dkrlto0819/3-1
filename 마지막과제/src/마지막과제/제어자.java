package 마지막과제;

public class 제어자 {
	String[] 입력년, 입력월, 입력일, 입력범주, 입력내역, 입력비고;
	int[] 입력수입, 입력지출, 잔액;
	int 총수입, 총지출, 총잔액;
	
	잔액계산 잔액계산;
	
	제어자(){
		입력년=new String[10];
		입력월=new String[10];
		입력일=new String[10];
		입력범주=new String[10];
		입력내역=new String[10];
		입력비고=new String[10];
		입력수입=new int[10];
		입력지출=new int[10];
		잔액=new int[10];
	}
	
	public void 입력항목들_저장하기(String[] 년, String[] 월, String[] 일, String[] 범주, String[] 내역, int[] 수입, int[] 지출, String[] 비고) {
		입력년=년;
		입력월=월;
		입력일=일;
		입력내역=내역;
		입력비고=비고;
		입력수입=수입;
		입력지출=지출;
	}
	
	public void 잔액계산() {
		잔액계산=new 잔액계산(입력수입, 입력지출);
		잔액=잔액계산.잔액_가져오기();
		총수입=잔액계산.총수입_가져오기();
		총지출=잔액계산.총지출_가져오기();
		총잔액=잔액계산.총잔액_가져오기();
	}
	
	public int[] 잔액가져오기() { return 잔액; }
	public int 총수입_가져오기() { return 총수입; }
	public int 총지출_가져오기() { return 총지출; }
	public int 총잔액_가져오기() { return 총잔액; }

}
