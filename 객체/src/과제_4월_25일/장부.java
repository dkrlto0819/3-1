package 과제_4월_25일;

public class 장부 {
	private static String[] 장부_내역;
	private static int[] 장부_금액;
	
	public int 장부_배열_위치;
	
	public int 총_수입, 총_지출;
	
	public static String[] 최종_장부;
	
	장부(){
		장부_배열_위치=0;
		
		장부_내역=new String[20];
		장부_금액=new int[20];
	}

	public void 장부_관리(String 수입_지출_구분, String 항목, int 금액) {
			장부_내역[장부_배열_위치] = 수입_지출_구분 + " " + 항목;
			장부_금액[장부_배열_위치] = 금액;
			
			장부_배열_위치 += 1;
			
			if(수입_지출_구분=="수입") 총_수입 += 금액;
			else 총_지출 += 금액;
	}
	
	public String[] 최종_장부_내역() {
		최종_장부=new String[장부_배열_위치];
		
		for(int i=0;i<장부_배열_위치;i++) 최종_장부[i] = 장부_내역[i] + " " + String.valueOf(장부_금액[i]) + "";
		
		return 최종_장부;
	}///출력에서 가공을 해주는 게 좋다 항상 특성을 맞춰주도록노력하는 것이 좋다//장부에서 금액은 수치!로!
	
	public int 총_잔액() {	   return 총_수입-총_지출;	}
	
}
