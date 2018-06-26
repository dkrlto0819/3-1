package 객체_과제_5월_16일;

public class 계산 {
	private int 예상_지출_잔액, 예상_수입_잔액, 수입_퍼센트, 지출_퍼센트;
	private int 예상_총수입, 예상_총지출;
	
	public int 총_수입, 총_지출, 차액;
	
	public void 예산_넘겨주기(int 예상_수입, int 예상_지출) {
		예상_총수입=예상_수입;
		예상_총지출=예상_지출;
		
		예상_수입_잔액=예상_수입;
		예상_지출_잔액=예상_지출;
	}
	
	public void 잔액_계산하기(String 선택, String 내역, int 금액) {
		switch(선택) {
			case "수입":
				예상_수입_잔액 -= 금액;
				차액 += 금액;		
				break;
			case "지출":
				예상_지출_잔액 -= 금액;
				차액 -= 금액;
				break;
			default:
				System.out.println("수입, 지출 중에 다시 선택해주세요.");
				break;
		}
		수입_퍼센트=(int)((double)예상_수입_잔액/(double)예상_총수입*100);
		지출_퍼센트=(int)((double)예상_지출_잔액/(double)예상_총지출*100);
	}
	
	public int 차액_넘겨주기() { return 차액; }
	public String 수입예산잔액_넘겨주기() { return String.valueOf(예상_수입_잔액)+"("+String.valueOf(수입_퍼센트)+"%"+")"; }
	public String 지출예산잔액_넘겨주기() { return String.valueOf(예상_지출_잔액)+"("+String.valueOf(지출_퍼센트)+"%"+")"; }
}
