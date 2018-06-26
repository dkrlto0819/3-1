package 객체4차과제;

public class 장부 {
	public static String[] 수입_항목;
	public static String[] 지출_항목;
	
	public static int[] 수입_가격;
	public static int[] 지출_가격;
	
	public static int 수입_배열_위치, 지출_배열_위치;
	
	public int 총_수입, 총_지출;
	
	장부(){
		수입_배열_위치=0;
		지출_배열_위치=0;
		
		수입_항목=new String[20];
		지출_항목=new String[20];
		
		수입_가격=new int[20];
		지출_가격=new int[20];
	}

	public void 수입_관리(String 항목, int 가격) {
		수입_항목[수입_배열_위치]=항목;
		수입_가격[수입_배열_위치]=가격;
		총_수입 += 가격;	
		
		수입_배열_위치 += 1;
	}

	public void 지출_관리(String 항목, int 가격) {	
		지출_항목[지출_배열_위치]=항목;
		지출_가격[지출_배열_위치]=가격;
		총_지출 += 가격; 	
		
		지출_배열_위치 += 1;
	}
	
	public int 총_잔액() {	   return 총_수입-총_지출;		}
	

}
