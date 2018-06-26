package 중간고사;

import java.util.Scanner;

public class 입력 {
	private Scanner sc; 

	public 입력() {	sc = new Scanner(System.in);	}

	public int 선택하기() 
	{	return sc.nextInt();	 }
	
	public int 금액_입력하기() {  return sc.nextInt();	}

	public String 항목_입력하기() {	 return sc.next(); }
}
