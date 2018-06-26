package 과제_4월_4일;

import java.util.Scanner;

public class 제어자 { 
	
	public 구구단_합 구구단_합;
	public 중간값_구하기 중간값_구하기; 
	
	Scanner 입력;
	
	public 제어자(){ // 생성자
		입력 = new Scanner(System.in);
	}
	
	private void 주_처리하기() {
		
		구구단_합 구구단_합 = new 구구단_합();
		중간값_구하기 중간값_구하기 = new 중간값_구하기();
		
		int 선택지;
		
		System.out.print("1과 2 중 하나를 선택하시오.");
		선택지=값_입력하기();
		
		switch(선택지) {  
			case 1 : 
				구구단_합.구구단_합_판단();
				break;
			case 2 : 
				중간값_구하기.중간값();
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
		}	
	}
	
	private int 값_입력하기() { 							
		return 입력.nextInt();
	}
	
	public static void main(String[] args) {

		제어자 객체 = new 제어자();	
		객체.주_처리하기();	
	}
	
}
