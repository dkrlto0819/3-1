package 객체_과제_5월_23일;

public class 장부 {
	장부[] 장부_내역=new 장부[20];
	public static int 장부_배열_위치;
	public int 총_수입, 총_지출;
	
	private int index;
	
	장부(){
		index=0;
	}
	
	public void 장부_내용(String 수지, String 내역, int 돈){
		String 수지구분=수지;
		String 장부_항목=내역;
		int 금액=돈;
	}
	
	public void 수입장부_작성하기(String 내역, int 돈) {
		장부_내역[index].장부_내용("수입", 내역, 돈);
		총_수입+=돈;
		index++;
	}
	
	public void 지출장부_작성하기(String 내역, int 돈) {
		장부_내역[index].장부_내용("지출", 내역, 돈);
		총_지출+=돈;
		index++;
	}
	
	public int 총수입_얻기() { return 총_수입; }
	public int 총지출_얻기() { return 총_지출; }
	public int 총잔액_얻기() { return 총_수입-총_지출; }
}


