package 과제_4월_4일;

import java.util.Scanner;

public class 중간값_구하기 {
	
	Scanner 입력;
	
	public 중간값_구하기(){ // 생성자
		입력 = new Scanner(System.in);
	}
	
	private int 값_입력하기() { 							
		return 입력.nextInt();
	}
	
	public void 중간값() {							//중간값 구하는 프로그램
		int 숫자_1, 숫자_2, 숫자_3;
		
		System.out.println("세 개의 양수를 입력하세요.");
		
		숫자_1=값_입력하기();
		숫자_2=값_입력하기();
		숫자_3=값_입력하기();
		
		if(숫자_1>숫자_2) {
			
			if(숫자_1>숫자_3) {
				
				if(숫자_2>숫자_3) {
					System.out.println("중간값은 " + 숫자_2 + "입니다.");
				}else {
					System.out.println("중간값은 " + 숫자_3 + "입니다.");
				}
			}
			else {
				System.out.println("중간값은 " + 숫자_1 + "입니다.");
			}
		}
		else {
			if(숫자_2>숫자_3) {	
				if(숫자_1>숫자_3) {
					System.out.println("중간값은 " + 숫자_1 + "입니다.");
				}else {
					System.out.println("중간값은 " + 숫자_3 + "입니다.");
				}
			}
			else {
				System.out.println("중간값은 " + 숫자_2 + "입니다.");
			}
		}
		
		
	}
	
}
