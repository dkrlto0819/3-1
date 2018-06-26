package 주사위;

public class c주사위 {
	private int 표면값;
	
	public void 던지기() {
		표면값=(int)(Math.random() * 6 + 1);
	}
	
	public int 표면값_얻기(){ return 표면값; }
}
