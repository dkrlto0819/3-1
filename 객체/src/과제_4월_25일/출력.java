package 과제_4월_25일;

public class 출력 {	
	
	public void 최종_가계부_출력(String[] 최종_장부_내역, int 최종_수입, int 최종_지출, int 최종_잔액) {
		
		System.out.println("	   나의 가계부		");
		System.out.println("=======================================");
		
		for(int i=0;i<최종_장부_내역.length;i++) System.out.println(최종_장부_내역[i]);
		
		System.out.println("=======================================");
		
		System.out.print("\n");
		System.out.println("총수입 : " + 최종_수입 + "원");
		System.out.println("총지출 : " + 최종_지출 + "원");
		System.out.println("잔액 : " + 최종_잔액 + "원");
	}
}