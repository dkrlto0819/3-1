package 객체3차과제;

public class 중간값 {
	public int 중간값_구하기(int 숫자_1,int 숫자_2,int 숫자_3) {
		int 중간_값;
		
		if(숫자_1>숫자_2) {
			if(숫자_1>숫자_3) {
				if(숫자_2>숫자_3) {
					중간_값=숫자_2;
				}else {
					중간_값=숫자_3;
				}
			}else {
				중간_값=숫자_1;
			}
		}else {
			if(숫자_2>숫자_3) {
				if(숫자_1>숫자_3) {
					중간_값=숫자_1;
				}else {
					중간_값=숫자_3;
				}
			}else {
				중간_값=숫자_2;
			}
		}
		return 중간_값;
	}
}
