package 객체6차과제;

public class 예산 {
	int 예상수입, 예상지출;
	public void 예상수입_저장하기(int 수입) { 예상수입=수입; }
	public void 예상지출_저장하기(int 지출) { 예상지출=지출; }
	public int 예상수입_가져오기() { return 예상수입; }
	public int 예상지출_가져오기() { return 예상지출; }
}

