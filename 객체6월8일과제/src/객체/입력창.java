package 객체;

import java.awt.*;
import java.awt.event.*;

public class 입력창 extends Dialog implements ActionListener{
	Panel 패널=new Panel();
	Panel 패널1=new Panel();
	
	Choice[] 월목록=new Choice[10];
	Choice[] 일목록=new Choice[10];
	Choice[] 범주=new Choice[10];
	TextField[] 내역=new TextField[10];
	TextField[] 수입= new TextField[10];
	TextField[] 지출=new TextField[10];
	TextField[] 잔액=new TextField[10];
	TextField[] 비고=new TextField[10];
	Button 입력버튼=new Button("입력");
	
	public 입력창(Frame 부모, String 제목) {
		super(부모, 제목);
		Insets 공백=getInsets();
		
		//setLayout(new GridLayout(11, 1));
		표지_출력();
		for(int i=0;i<5;i++) 입력란_출력(i);
		입력버튼_출력();
		add(패널);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
				System.exit(0);
			}
		});
	}
	public void 입력버튼_출력() {
		패널.add(입력버튼);
		입력버튼.addActionListener(this);
	}
	
	public Insets getInsets() { return new Insets(30, 20, 0, 20); }
	
	public void 입력란_출력(int n) {
		Choice c월목록=new Choice();
			월목록[n]=c월목록;
			for(int i=1;i<=12;i++) 월목록[n].add(Integer.toString(i)+"월");
		Choice c일목록=new Choice();
			일목록[n]=c일목록;
			for(int i=1;i<=31;i++) 일목록[n].add(Integer.toString(i)+"일");
		패널.add(월목록[n]);
		패널.add(일목록[n]);
		
		TextField c내역=new TextField("", 12);
		내역[n]=c내역;
		패널.add(내역[n]);
		
		Choice c범주목록=new Choice();
		범주[n]=c범주목록;
			c범주목록.add("식비");
			c범주목록.add("의류비");
			c범주목록.add("주거비");
			c범주목록.add("문화비");
			c범주목록.add("통신비");
		패널.add(c범주목록);
		
		TextField c수입=new TextField("0", 12);
		수입[n]=c수입;
		패널.add(수입[n]);
		TextField c지출=new TextField("0", 12);
		지출[n]=c지출;
		패널.add(지출[n]);
		TextField c잔액=new TextField("0", 12);
		잔액[n]=c잔액;
		패널.add(잔액[n]);
		TextField c비고=new TextField("", 12);
		비고[n]=c비고;
		패널.add(비고[n]);
		
		add(패널);
	}
	
	public void 표지_출력() {
		패널.setLayout(new GridLayout(6,8));
		Label 날짜표지=new Label("			날짜");
		Label 공백=new Label("	");
		Label 내역표지=new Label("내역");
		Label 범주표지=new Label("범주");
		Label 수입표지=new Label("수입");
		Label 지출표지=new Label("지출");
		Label 잔액표지=new Label("잔액");
		Label 비고표지=new Label("비고");
		패널.add(날짜표지);
		패널.add(공백);
		패널.add(내역표지);
		패널.add(범주표지);
		패널.add(수입표지);
		패널.add(지출표지);
		패널.add(잔액표지);
		패널.add(비고표지);
		
		add(패널);
	}
	
	public void actionPerformed(ActionEvent ae) {
		제어자 제어=new 제어자();
		if("입력".equals(ae.getActionCommand())) {
			제어.제어자(월목록, 일목록, 범주, 내역, 수입, 지출, 잔액, 비고);
		}
		
	}	
}
