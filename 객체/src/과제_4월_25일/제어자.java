package 과제_4월_25일;

public class 제어자 {
	private int 선택;
	
	private String 항목;
	private int 가격;
	
	입력 입력하기=new 입력(); 
	장부 장부_관리=new 장부();
	출력 출력=new 출력();
	
	private 제어자(){
		선택=1;	
	}
	
	public void 선택하기() {		
		while(선택!=0) {
			System.out.println("원하는 번호를 선택하세요! 1 (수입)  2 (지출)  0 (끝내기) :");
			선택=입력하기.숫자_입력하기();
					
			switch(선택)
			{
				case 1: 										
					수입_입력();
					break;

				case 2: 										
					지출_입력();
					break;
				
				case 0:												
					break;
		
				default:
					System.out.println("선택한 번호를 다 한 번 확인해 주세요.");
					break;
			}
		}
		최종_출력();
	}
	
	private void 수입_입력() {
		System.out.println("수입을 입력하세요: ");
		항목=입력하기.항목_입력하기();
		가격=입력하기.숫자_입력하기();
		
		장부_관리.장부_관리("수입", 항목, 가격);
	}
	
	private void 지출_입력() {
		System.out.println("지출을 입력하세요: ");
		항목=입력하기.항목_입력하기();
		가격=입력하기.숫자_입력하기();

		장부_관리.장부_관리("지출", 항목, 가격);
	}
	
	private void 최종_출력() {
		int 최종_수입, 최종_지출, 최종_잔액, 장부_위치;
		
		String[] 최종_장부;
		
		최종_장부=장부_관리.최종_장부_내역();
		
		최종_수입=장부_관리.총_수입;
		최종_지출=장부_관리.총_지출;
		최종_잔액=장부_관리.총_잔액();
		
		장부_위치=장부_관리.장부_배열_위치;
		
		최종_장부=new String[장부_위치];
		
		최종_장부=장부_관리.최종_장부_내역();
		
		출력.최종_가계부_출력(최종_장부, 최종_수입, 최종_지출, 최종_잔액);
	}
	
	public static void main(String[] args) { 
		제어자 시작 = new 제어자();
		시작.선택하기();
	}
}
