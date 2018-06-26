package 객체6월8일;

import java.awt.*;

public class 입력창 {
	public 입력창(Frame 부모, String 제목, String 전갈) {
		super(부모, 제목);
		
		Label 표지=new Label(전갈);
		Button 확인=new Button("확인");
		확인.setBackground(Color.blue);
		add(표지, "Center");
		add(확인, "South");
		pack();
	}
}
