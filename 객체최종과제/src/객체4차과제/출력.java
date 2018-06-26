package 객체4차과제;

public class 출력 {
	public void 가계부_제목_출력() {		System.out.println("			나의 가계부		");}
	
	public void 수입_최종_내역(String[] 수입_항목, int[] 수입_가격, int 수입_배열_위치) {
		System.out.println("\n수입 내역\n");
		
		for(int i=0;i<수입_배열_위치;i++) 
			System.out.println(수입_항목[i] + " " + 수입_가격[i]+"원");
	}
	
	public void 지출_최종_내역(String[] 지출_항목, int[] 지출_가격, int 지출_배열_위치) {
		System.out.println("\n지출 내역\n");
		for(int i=0;i<지출_배열_위치;i++)	
			System.out.println(지출_항목[i] + " " + 지출_가격[i] + "원");
	}
	
	public void 최종_가계부_출력(int 최종_수입, int 최종_지출, int 최종_잔액) {
		System.out.print("\n");
		System.out.println("총수입 : " + 최종_수입 + "원");
		System.out.println("총지출 : " + 최종_지출 + "원");
		System.out.println("잔액 : " + 최종_잔액 + "원");
	}

}
