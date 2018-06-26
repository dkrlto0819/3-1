package 기말;

public class 처음예시 {
	private String[] 범주;
	private String[] 내역;
	private int[] 수입;
	private int[] 지출;
	private String[] 비고;
	private int 줄수=10;
	
	
	처음예시(){
		범주 =new String[] {"월급", "식비", "용돈", "식비", "의류비", "문화비", "식비", "생활비", "식비", "식비"}; 
		내역 =new String[] {"알바비", "치킨", "한달용돈", "점심", "바지", "뮤지컬", "초밥", "샴푸", "초콜릿", "커피"}; 
		수입 =new int[] {600000, 0, 300000, 0, 0, 0, 0, 0, 0, 0};
		지출 =new int[] {0, 20000, 0, 10000, 30000, 30000, 20000, 5000, 1000, 1500};
		비고 =new String[] {""};
	}

	public String[] 범주_얻기() { return 범주; }
	public String[] 내역_얻기() { return 내역; }
	public int[] 수입_얻기() { return 수입; }
	public int[] 지출_얻기() { return 지출; }

}
