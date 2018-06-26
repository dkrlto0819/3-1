package method;

import java.util.Scanner;

public class PlusMul {

	public static void PM(){
		
		Scanner sc=new Scanner(System.in);
		
		int 값;
		
		System.out.println("2 이상의 정수를 입력하시오.");
		값=sc.nextInt();
		
		int i;
		
		int 합=0;
		
		if(값<10) {
			
			if(값>1) {
			
				for(i=1;i<=9;i++)
				System.out.println( 값 + "*" + i + "=" + 값 * i);
			
			}else
				System.out.println("범위 내의 정수가 아닙니다.");
			
		}else {
			
			for(i=1;i<=값;i++)
				합=합+i;
			
			System.out.println("1부터 " + 값 + "의 합은 " + 합 + " 입니다!");
			
		}
		
	}
	
	public static void Middle() {
		
		Scanner sc;
		
		sc=new Scanner(System.in);
		
		int 숫자_1, 숫자_2, 숫자_3;
		
		System.out.println("세 개의 양수를 입력하세요.");
		
		숫자_1=sc.nextInt();
		숫자_2=sc.nextInt();
		숫자_3=sc.nextInt();
		
		if(숫자_1>숫자_2) {
			
			if(숫자_1>숫자_3) {
				
				if(숫자_2>숫자_3)
					System.out.println("중간값은 " + 숫자_2 + "입니다.");
				else
					System.out.println("중간값은 " + 숫자_3 + "입니다.");
				
			}
			else
				System.out.println("중간값은 " + 숫자_1 + "입니다.");
			
		}
		else {
			
			if(숫자_2>숫자_3) {
				
				if(숫자_1>숫자_3)
					System.out.println("중간값은 " + 숫자_1 + "입니다.");
				else
					System.out.println("중간값은 " + 숫자_3 + "입니다.");
				
			}
			else
				System.out.println("중간값은 " + 숫자_2 + "입니다.");
			
		}
	}
	
	public static void main(String[] args) {
		
		int select;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1과 2 중 선택하시오.");
		select=sc.nextInt();
		
		if(select==1)
			PM();
		else if(select==2)
			Middle();
		else
			System.out.println("잘못 입력하셨습니다.");
		
	}
	
}
