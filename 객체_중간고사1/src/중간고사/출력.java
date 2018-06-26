package 중간고사;

public class 출력 {
	public void 선택하기_출력() {	System.out.println("원하는 번호를 선택하세요! 1 (수입)  2 (지출)  0 (끝내기) :");	}
	
	public void 수입_출력() {	System.out.println("수입을 입력하세요: ");	}
	
	public void 지출_출력() {	System.out.println("지출을 입력하세요: ");	}
	
	public void 잘못_입력_출력() {		System.out.println("선택한 번호를 다 한 번 확인해 주세요.");	}
	
	public void 최종_가계부_출력(int 최종_수입, int 최종_지출, int 최종_잔액) {		
		System.out.println("			나의 가계부		");
		System.out.println("총수입 : " + 최종_수입 + "원");
		System.out.println("총지출 : " + 최종_지출 + "원");
		System.out.println("잔액 : " + 최종_잔액 + "원");
	}
}