package 기말고사_객체;

public class c차림표 {
	private String[] 음식코드들;
	private String[] 음식이름들;
	private int[] 음식가격들;
	
	c차림표(){
		음식코드들 =new String[] {"00", "11", "22", "33", "44", "55", "66", "77", "88", "90", "95"}; 
		음식이름들 =new String[] {"", "갈비탕", "비빕밥", "설렁탕", "고기국밥", "순대국밥", "정식", "고기국수", "멸치국수", "비빔국수", "냉면", }; //[음식수]; 
		음식가격들 =new int[] {0, 8000, 7000, 7000, 7000, 7000, 6000, 9000, 6000, 6000, 7000};
	}

	public String[] 음식코드들_얻기() { return 음식코드들; }
	public String[] 음식이름들_얻기() { return 음식이름들; }
	public int 음식수_얻기() { return 음식이름들.length-1; }
	public int[] 음식가격들_얻기() { return 음식가격들; }
}
