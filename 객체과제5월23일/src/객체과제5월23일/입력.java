package 객체과제5월23일;

import java.util.Scanner;

public class 입력 {
	private Scanner sc;
	private String 수입지출_선택, 내용;
	private int 예상수입, 예상지출, 금액;
	
	public 입력() { sc = new Scanner(System.in); }
	
	public int 기능_선택하기(){
		System.out.println("예상수입 입력/수정은 1, 예상지출 입력/수정은 2, 수입/지출 내역 입력은 3, 프로그램 종료는 0을 눌러주세요.");
		return sc.nextInt();
	}
	
	public void 예상_수입_입력하기() { 
		System.out.println("예상 수입을 입력해주세요.");
		예상수입=sc.nextInt();
	}
	
	public void 예상_지출_입력하기() {
		System.out.println("예상 지출을 입력해주세요.");
		예상지출=sc.nextInt();
	}
	
	public void 내역_입력하기() {
		System.out.println("수입이면 수입, 지출이면 지출을 입력하고 내역과 돈을 차례대로 입력해주세요.");
		수입지출_선택=sc.next();
		내용=sc.next();
		금액=sc.nextInt();
	}
	
	public int 예상수입_가져오기() { return 예상수입; }
	public int 예상지출_가져오기() { return 예상지출; }
	public String 수입지출_선택_결과() { return 수입지출_선택; }
	public String 내용_가져오기() { return 내용; }
	public int 금액_가져오기() { return 금액; }
}
