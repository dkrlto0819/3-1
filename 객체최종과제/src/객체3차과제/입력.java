package 객체3차과제;

import java.util.Scanner;

public class 입력 {
	Scanner 입력_값;
	public 입력(){ 입력_값 = new Scanner(System.in); }
	public int 입력하기() { return 입력_값.nextInt(); } 
}
