package 객체과제5월23일;

public class 출력{
	public void 장부_출력하기(String 구분, String 내역, int 금액, int 총_잔액, int 수입예산잔액, float 수입비율, int 지출예산잔액, float 지출비율) {
		System.out.println("내역        금액     차액     수입잔액       지출잔액 ");
		System.out.println("====================================================");
		System.out.printf("%-7s %-7s %d %d %d(%f) %d(%f)", 구분, 내역, 금액, 총_잔액, 수입예산잔액, 수입비율, 지출예산잔액, 지출비율);
	}
}