package practic;

import java.util.Scanner;

public class 연습 {
	
	private Scanner sc;
	
	private String s1;
	private int x;
	
	public void 시작() {
		s1="H";
		x=1;
		
		System.out.printf("%-15s%03d\n", s1, x);
	}
		
	public static void main(String[] args) {
		연습 시작하기=new 연습();
		시작하기.시작();
	}
}

