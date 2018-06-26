package 객체과제5월23일;

public class 장부관리 {
	장부내역[] 장부내역=new 장부내역[20];
	장부내역 작성내역;
	int 총수입, 총지출, index=-1;
	
	public void 수입장부_작성하기(String 내용, int 금액) {
		index++;
		작성내역=new 장부내역("수입", 내용, 금액);
		장부내역[index]=작성내역;
		총수입 += 금액;
	}
	
	public void 지출장부_작성하기(String 내용, int 금액) {
		index++;
		작성내역=new 장부내역("수입", 내용, 금액);
		장부내역[index]=작성내역;
		총지출 += 금액;
	}
	
	public String 수지_가져오기() { return 장부내역[index].수지; }
	public String 내역_가져오기() { return 장부내역[index].내용; }
	public int 금액_가져오기() { return 장부내역[index].금액; }
	public int 총수입_가져오기() { return 총수입; }
	public int 총지출_가져오기() { return 총지출; }
	public int 총잔액_가져오기() { return 총수입-총지출; }
}
