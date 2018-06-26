package 객체2차과제;

import java.util.Scanner;

public class 중간값구하기 {
	public void 중간값실행() {
		Scanner sc=new Scanner(System.in);
		
		int 숫자_1, 숫자_2, 숫자_3; 
		
		System.out.println("세 개의 양수를 입력하세요.");
		숫자_1=sc.nextInt(); 
		숫자_2=sc.nextInt(); 
		숫자_3=sc.nextInt();
		
		if(숫자_1>숫자_2) { 
			if(숫자_1>숫자_3) {
				if(숫자_2>숫자_3)
					System.out.println("중간값은 " + 숫자_2 + " 입니다.");
				else
					System.out.println("중간값은 " + 숫자_3 + " 입니다.");
			}else
				System.out.println("중간값은 " + 숫자_1 + " 입니다.");
		}else {
			if(숫자_2>숫자_3) {
				if(숫자_1>숫자_3)
					System.out.println("중간값은 " + 숫자_1 + " 입니다.");
				else
					System.out.println("중간값은 " + 숫자_3 + " 입니다.");
			}else
				System.out.println("중간값은 " + 숫자_2 + " 입니다.");
		}
			
	}
} 