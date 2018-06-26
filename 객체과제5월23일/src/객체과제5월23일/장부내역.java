package 객체과제5월23일;

public class 장부내역 {
	String 수지=null, 내용 = null;
	int 금액=0;

	public 장부내역(String 수지_구분, String 작성_내용, int 작성_금액) {
		수지=수지_구분;
		내용=작성_내용;
		금액=작성_금액;
	}
}
