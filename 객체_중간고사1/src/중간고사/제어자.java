package 중간고사;

public class 제어자 {
	private int 선택;
	
	제어자(){
		선택=1;
	}
	
	public void 선택하기() {
			
		입력 입력하기=new 입력(); 
		수입 수입_관리=new 수입();
		지출 지출_관리=new 지출();
		출력 출력=new 출력();
			
		String 수입_지출_내용; 
		int 가격;
				
		while(선택!=0) {
			출력.선택하기_출력();
			선택=입력하기.선택하기();
					
			switch(선택)
			{
				case 1: 										//수입 선택 
					출력.수입_출력();
					수입_지출_내용=입력하기.항목_입력하기();
					가격=입력하기.금액_입력하기();
					
					수입_관리.수입_관리(가격);
					break;

				case 2: 										// 지출 선택
					출력.지출_출력();
					수입_지출_내용=입력하기.항목_입력하기();
					가격=입력하기.금액_입력하기();

					지출_관리.지출_관리(가격);
					break;
				
				case 0:										// 끝내기 선택				
					break;
						
				default:
					출력.잘못_입력_출력();
					break;
				}
			}
		
			int 최종_수입, 최종_지출, 최종_잔액;
			
			최종_수입=수입_관리.최종_금액();
			최종_지출=지출_관리.최종_금액();
			최종_잔액=최종_수입-최종_지출;
			
			출력.최종_가계부_출력(최종_수입, 최종_지출, 최종_잔액);
	}
	
	public static void main(String[] args) { 
		제어자 시작 = new 제어자();
		시작.선택하기();
	}
}
