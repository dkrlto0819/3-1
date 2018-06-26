package 객체6월첫째주과제;

import java.awt.*;

public class 장부_화면 extends Frame{
	장부_화면(){
		super("장부 초기화면");
		Insets 공백=getInsets();
		
		Panel 패널1=new Panel();
			패널1.setLayout(new FlowLayout(FlowLayout.LEFT));
			Label 예상수입표지=new Label("예상수입");
			TextField 예상수입금액=new TextField(15);
			Label 예상지출표지=new Label("예상지출");
			TextField 예상지출금액=new TextField(15);
			패널1.add(예상수입표지);
			패널1.add(예상수입금액);
			패널1.add(예상지출표지);
			패널1.add(예상지출금액);
			Button 입력버튼=new Button("입력");
			패널1.add(입력버튼);
			
			Label 수지표지=new Label("수지");
			Choice 수지목록=new Choice();
				수지목록.add("수입");
				수지목록.add("지출");
			패널1.add(수지표지);
			패널1.add(수지목록);
		
			Label 범주표지=new Label("범주");
			Choice 범주목록=new Choice();
				범주목록.add("식비");
				범주목록.add("의류비");
				범주목록.add("주거비");
				범주목록.add("문화비");
				범주목록.add("통신비");
				패널1.add(범주표지);
				패널1.add(범주목록);
			
			Label 금액표지=new Label("금액");
			TextField 금액=new TextField(12);
			패널1.add(금액표지);
			패널1.add(금액);
			Button 작성버튼=new Button("작성");
			패널1.add(작성버튼);
		
			Label 내역목록=new Label("내역목록");
		
			TextArea 입력창=new TextArea(10, 50);
			입력창.setText("");
			패널1.add(내역목록);
			패널1.add(입력창);
		add(패널1);
	}

	public Insets getInsets() { return new Insets(40, 20, 0, 20); }
	
	public static void main(String[] args) {
		장부_화면 화면=new 장부_화면();
		화면.setSize(500,400);
		화면.setVisible(true);
	}
}
