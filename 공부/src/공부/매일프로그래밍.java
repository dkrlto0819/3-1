package 공부;

import java.util.Scanner;

public class 매일프로그래밍 {
	private Scanner sc;

	public void start() {
		가짓수_구하기 해결=new 가짓수_구하기();
		int n=sc.nextInt();
		해결.solve(n);
	}
	
	public static void main(String args[]) {
		매일프로그래밍 시작=new 매일프로그래밍();
		시작.start();
	}
	
}
