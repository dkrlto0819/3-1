package 객체1차과제;

import java.util.Scanner;

public class 시간차구하기 {
	public void 시작() {
		int 시간_1, 분_1; //첫번째 시간 입력을 받을 변수 
		int 시간_2, 분_2; //두번쨰 시간을 입력 받을 변수 
		
		int 시간_절대값; //만약 첫번째 시간보다 두번째 시간이 크면 교환을 해줄 때 쓸 변수 
		
		int 시간, 분; //시간과 분 차이가 저장될 변수
		
		Scanner 시각=new Scanner(System.in);
		
		System.out.printf("첫번째 시간을 입력하세요.");
		시간_1=시각.nextInt();
		System.out.printf("첫번째 분을 입력하세요.");
		분_1=시각.nextInt();
		
		System.out.printf("두번째 시간을 입력세요.");
		시간_2=시각.nextInt();
		System.out.printf("두번째 분을 입력하세요.");
		분_2=시각.nextInt();
		
		if(시간_1<시간_2) {
			시간_절대값=시간_1;
			시간_1=시간_2;
			시간_2=시간_절대값;
			
			시간_절대값=분_1;
			분_1=분_2;
			분_2=시간_절대값;
		}// 시간과 분은 시각 하나이기 떄문에 반드시 한꺼번에 바꿔주어야 한다.
		
		시간=시간_1-시간_2;
		
		if(분_1<분_2) {
			if(시간!=0) {
				시간=시간-1;
				분_1=분_1+60;
			}else {
				시간_절대값=분_1;
				분_1=분_2;
				분_2=시간_절대값;
			}// ex) 시간1이 1:00 이고 시간 2가 1:20 분일떄를 위해 
		} //시간_1>시간_2 이지만 분_1<분_2 일 떄 분+60을 해서 계산 해줘야 한다.
		분=분_1-분_2;
		
		System.out.println("입력하신 두 시간의 차이는 \"" +  + 시간 + ":" +  분 + "\" 입니다!");
	}
}
