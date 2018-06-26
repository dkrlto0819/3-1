package 과제_4월_4일;

import java.util.Scanner;

public class 구구단_합 {
	Scanner 입력;
	
	public 구구단_합(){ // 생성자
		입력 = new Scanner(System.in);
	}
	private int 값_입력하기() { 							
		return 입력.nextInt();
	}
	
	public void 구구단_합_판단() { 							//구구단인지 합 프로그램인지 판
		int 값=0;
		
		System.out.println("2 이상의 정수를 입력하시오.");
		값=값_입력하기();
		
		if((값 >= 2) && (값 <= 9)) 구구단(값); 
		else if(값>9) 합(값);
		else System.out.println("잘못 입력하셨습니다.");
	}
	
	public void 구구단(int 값) { 							// 구구단
		for(int i=1;i<=9;i++) // 얘도 { } 넣
			System.out.println( 값 + "*" + i + "=" + 값 * i);	
	}
	
	public void 합(int 값) { 								//1부터 입력받은 수까지의 합을 구하는 프로그램
		int 합=0;
		
		for(int i=1;i<=값;i++) 
			합=합+i;
		
		System.out.println("1부터 " + 값 + "의 합은 " + 합 + " 입니다!");
	}
	
}
