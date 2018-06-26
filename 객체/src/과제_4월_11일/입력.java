package 과제_4월_11일;

import java.util.Scanner;;

public class 입력 {
	
	Scanner 입력_값;
	
	public 입력(){	
		입력_값 = new Scanner(System.in);
	}
	
	public int 입력하기() {
		return 입력_값.nextInt();
	}
}
