package 메뉴만들기;

import java.awt.*;

public class 메뉴제작 extends Frame{
	메뉴제작(){
		super("과제 메뉴");
		
		MenuBar 메뉴_막대=new MenuBar();
		
		Menu 파일=new Menu("파일");
			Menu 입력=new Menu("입력");
				입력.add("직접입력");
				입력.add("-");
				입력.add("파일읽기");
			파일.add(입력);
			파일.add("-");
			파일.add("결과저장");
			파일.add("-");
			파일.add("결과인쇄");
			파일.add("-");
			파일.add(new CheckboxMenuItem("검색"));
			파일.add("-");
			파일.add("종료");
		Menu 편집=new Menu("편집");
			편집.add("자르기");
			편집.add("복사");
			편집.add("붙이기");
		Menu 기타=new Menu("...");
		Menu 도움말=new Menu("도움말");
		
		메뉴_막대.add(파일);
		메뉴_막대.add(편집);
		메뉴_막대.add(기타);
		메뉴_막대.add(도움말);
		
		setMenuBar(메뉴_막대);
	}
	
	public static void main(String[] args) {
		메뉴제작 md= new 메뉴제작();
		md.setSize(300,200);
		md.setVisible(true);
	}
}
