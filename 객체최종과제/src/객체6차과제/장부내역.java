package 객체6차과제;

public class 장부내역 {
	public String 수지=null, 내용 = null;
	public int 금액=0;

	public 장부내역(String 수지_구분, String 작성_내용, int 작성_금액) {
		수지=수지_구분;
		내용=작성_내용;
		금액=작성_금액;
	}
}
