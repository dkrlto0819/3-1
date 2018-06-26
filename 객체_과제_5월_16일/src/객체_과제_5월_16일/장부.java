package 객체_과제_5월_16일;

public class 장부 {
	public static String[] 장부_내역;
	
	public static int 장부_배열_위치;
	
	public int 총_수입, 총_지출, 총_잔액;
	
	장부(){
		장부_배열_위치=0;
		장부_내역=new String[20];
	}
	
	public String[] 장부_작성하기(String 내역, int 금액, int 총_잔액, String 예상_수입_잔액, String 예상_지출_잔액) {
		장부_내역[장부_배열_위치]=문자열_정렬(내역)+" "+문자열_정렬(String.valueOf(금액))+" "+문자열_정렬(String.valueOf(총_잔액));
		장부_내역[장부_배열_위치]=장부_내역[장부_배열_위치]+" "+예상_수입_잔액;
		장부_내역[장부_배열_위치]=장부_내역[장부_배열_위치]+" "+예상_지출_잔액;
		
		장부_배열_위치++;
		
		return 장부_내역;
	}
	
	public String 문자열_정렬(String 문자열) {
		return String.format("%-7s", 문자열);
	}
	
}
