package plusmul;

import java.util.Scanner;

public class PM {

	public static void main(String[] args) {
		
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
	
}
