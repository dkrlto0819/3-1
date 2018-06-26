package 객체5차과제;

public class 출력 {		
	private int 출력_배열_위치;

	public void 장부_출력하기(String[] 장부) {
		System.out.println("내역        금액     차액     수입잔액       지출잔액 ");
		System.out.println("====================================================");
		System.out.println(장부[출력_배열_위치]);
		출력_배열_위치++;
	}
}
