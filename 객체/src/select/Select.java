package select;

import java.util.Scanner;

public class Select {
	
	PM 첫번째;
	Middle 두번째;
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		PM 첫번째 = new PM();
		Middle 두번째 = new Middle();
		
		int select;
		
		System.out.println("1과 2 중 선택하시오.");
		select=sc.nextInt();
		
		switch(select) {
			case 1:첫번째.PM();
			case 2:두번째.Middle();
			default: System.out.println("잘못 입력하셨습니다.");
		}
	}
	
}
