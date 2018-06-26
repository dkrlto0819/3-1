import java.awt.*;

public class 메뉴연습 extends Frame{
	메뉴연습(){
		MenuBar 메뉴_막대 = new MenuBar();
	     Menu 파일 = new Menu("파일");
	        Menu 신상정보 = new Menu("신상정보");
	        파일.add("사진보기");   파일.add("-");
	        파일.add("연락처보기");   파일.add("-");
	     
	     메뉴_막대.add(파일);
	     setMenuBar(메뉴_막대);
	}
	
	public static void main(String[] args) {
		메뉴연습 md=new 메뉴연습();
		md.setSize(300, 200);
		md.setVisible(true);
	}
}
