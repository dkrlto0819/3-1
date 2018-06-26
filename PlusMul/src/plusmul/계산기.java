package plusmul;

public class 계산기 {

	public 계산기() { }
	
	public 계산기(String name) {
		System.out.println("나는 계싼기얌 ");
	} 
	
	public void add(int num1, int num2)
	{
		System.out.println(num1 + num2);
	}
}

class 메인클래스 {
	public static void main(String[] args)
	{
		계산기 red계산기 = new 계산기();
		
		red계산기.add(1, 2);
	}
}