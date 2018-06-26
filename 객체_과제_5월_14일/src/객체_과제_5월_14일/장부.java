package 객체_과제_5월_14일;

public class 장부 {
	public static String[] 장부_내역;
	
	public static int 장부_배열_위치;
	
	private int 예상_지출_잔액, 예상_수입_잔액, 수입_퍼센트, 지출_퍼센트;
	private int 예상_총수입, 예상_총지출;
	
	public int 총_수입, 총_지출, 총_잔액;
	
	장부(){
		장부_배열_위치=0;
		장부_내역=new String[20];
	}

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
				총_잔액 += 금액;		
				break;
			case "지출":
				예상_지출_잔액 -= 금액;
				총_잔액 -= 금액;
				break;
			default:
				System.out.println("수입, 지출 중에 다시 선택해주세요.");
				break;
		}
		수입_퍼센트=(int)((double)예상_수입_잔액/(double)예상_총수입*100);
		지출_퍼센트=(int)((double)예상_지출_잔액/(double)예상_총지출*100);
	}
	
	public String[] 장부_작성하기(String 내역, int 금액) {
		장부_내역[장부_배열_위치]=문자열_정렬(내역)+" "+문자열_정렬(String.valueOf(금액))+" "+문자열_정렬(String.valueOf(총_잔액));
		장부_내역[장부_배열_위치]=장부_내역[장부_배열_위치]+" "+문자열_정렬(String.valueOf(예상_수입_잔액))+"("+String.valueOf(수입_퍼센트)+"%"+")";
		장부_내역[장부_배열_위치]=장부_내역[장부_배열_위치]+" "+문자열_정렬(String.valueOf(예상_지출_잔액))+"("+String.valueOf(지출_퍼센트)+"%"+")";
		
		장부_배열_위치++;
		
		return 장부_내역;
	}
	
	public String 문자열_정렬(String 문자열) {
		return String.format("%-7s", 문자열);
	}
	
}
