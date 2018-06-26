package 주사위;

//import 주사위.c주사위;

public class c경기자 {
	private String 이름;
	
	public void 주사위_던지기(c주사위 d1, c주사위 d2){
		d1.던지기();
		d2.던지기();
	}
	
	public void 이름_설정(String s) { 이름 = s; }
	public String 이름_얻기() { return 이름; }
}
