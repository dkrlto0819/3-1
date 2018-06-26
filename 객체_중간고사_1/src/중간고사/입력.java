package 중간고사;

import java.util.Scanner;
import 중간고사.수입;
import 중간고사.지출;
import 중간고사.출력;


public class 입력 {
	private Scanner sc; // 참 잘했어요

	public 입력()
	{
		sc = new Scanner(System.in);
	} // 참 잘했어요

	public int 수입_지출_선택() // 명명 다시해보자
	{
		int 선택; 

		System.out.println("원하는 번호를 선택하세요! 1 (수입)  2 (지출)  0 (끝내기) :");
		선택 = sc.nextInt(); 
		
		return 선택;
	}

	private void 가계부_업데이트(){ // 입력 클래스에서 업데이트를...?
		// 이 메소드가 사실상 모든 일을 하는 애 같은데...
		// 그런 역할은 차라리 Controller클래스 (제어자 클래스) 를 만들어서 수행하는게 바람직 하다고 생각됨
	
		입력 수입_출력_고르기=new 입력(); // 입력 클래스에게 고르기란 명명은 조금 어색하지 않을까?
		// 입력클래스 입력 = new 입력클래스(); 쪽이 낫나...? 고민 해보기
		
		수입 수입_관리=new 수입();
		지출 지출_관리=new 지출();
		출력 가계부_출력=new 출력();
	
		String 항목; // (명명) 어떤 항목인지?
		int 가격;
		// 여긴 공간이 왜 띄어져 있는거죠?
		int 선택=1;
		
		while(선택!=0) {
			
			선택=수입_출력_고르기.수입_지출_선택();
			
			switch(선택)
			{
			case 1: // 입력 선택
				// case문 안의 입력, 지출 등의 기능은 또다른 기능임. -> 새로운 메소드를 만들자. (필요에 따라선 새로운 클래스도 만들 수 있음)
				// 메소드 = 기능. 즉, 하나의 메소드는 한 가지 기능만 하는 것이 바람직하다. (매우 중요)
				System.out.println("수입을 입력하세요: ");
				항목=sc.nextLine();
				가격= sc.nextInt();
			
				수입_관리.수입_관리(가격);
				break;

			case 2: // 지출 선택
				System.out.println("지출을 입력하세요: ");
				항목=sc.nextLine();
				가격=sc.nextInt();

				지출_관리.지출_관리(가격);
				break;
		
			case 0:
				break;
				
			default:
				System.out.println("선택한 번호를 다 한 번 확인해 주세요.");
				break;
			}
		}
			
		가계부_출력.최종_가계부_출력(수입_관리.최종_금액(), 지출_관리.최종_금액());
	}
	
	public static void main(String[] args) { // 메인클래스를 하나 만들고 거기서 메인메소드 돌립시다
		입력 시작 = new 입력();
		시작.가계부_업데이트();
	}

}
