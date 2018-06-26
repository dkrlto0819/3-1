package 주사위;

//import 주사위.c주사위;
//import 주사위.c경기자;

public class c주사위_시합 {

	c경기자 p1, p2;
	c주사위 d1, d2;
	
	c주사위_시합(){
		p1=new c경기자();
		p2=new c경기자();
		d1=new c주사위();
		d2=new c주사위();
	}
	
	 public void 경기_시작() {
		 
		 int p1점수, p2점수;
		 String p1이름, p2이름;
		 
		 p1.이름_설정("홍길동");
		 p2.이름_설정("임꺽정");
		 
		 p1.주사위_던지기(d1, d2);
		 p1이름=p1.이름_얻기();
		 p1점수=d1.표면값_얻기() + d2.표면값_얻기();
		 System.out.println(p1이름+"의 점수: "+p1점수+"(" + d1.표면값_얻기() + "+" +d2.표면값_얻기()+ ")");
		 
		 p2.주사위_던지기(d1, d2);
		 p2이름=p2.이름_얻기();
		 p2점수=d1.표면값_얻기() + d2.표면값_얻기();
		 System.out.println(p1이름+"의 점수: "+p1점수+"(" + d1.표면값_얻기() + "+" +d2.표면값_얻기()+ ")");
		 
		 if(p1점수>p2점수)
			 System.out.println(p1이름 + "이 승리했습니다!");
		 else if(p1점수==p2점수)
			 System.out.println(p1이름 + "무승부입니다.");
		 else
			 System.out.println(p2이름 + "이 승리했습니다!");
	 }
	 public static void main(String[] args) {
		 c주사위_시합 심판=new c주사위_시합();
		 심판.경기_시작();
	 }
	 
}
