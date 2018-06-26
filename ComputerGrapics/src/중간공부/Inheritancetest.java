package 중간공부;


class A{
	private int i=2;
	int j=4;
	
	public void method() {
		System.out.println("i + j =" + (i+j));
	}
}

class B extends A{
	int k=6;
	
	public void myMethod() {
		System.out.println("k + j = "+(k+j));
	}
}

public class Inheritancetest {
	public static void main(String[] args) {
		B obj=new B();
		
		obj.j=10;
		obj.method();
		obj.myMethod();
		
	}
}

