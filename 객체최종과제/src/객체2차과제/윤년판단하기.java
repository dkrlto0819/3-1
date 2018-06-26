package 객체2차과제;

import java.util.Scanner;

public class 윤년판단하기 {
	public void 윤년판단() {
		Scanner sc = new Scanner(System.in);
		
		int 년;
		
		System.out.println("연도를 입력하시오.");
		년=sc.nextInt();
		
		if(년%400==0){
			System.out.println("윤년입니다.");
		}else if(년 % 100 != 0) {
			if(년 % 4 == 0)
				System.out.println("윤년입니다.");
			else
				System.out.println("윤년이 아닙니다.");
		}
	}
}

