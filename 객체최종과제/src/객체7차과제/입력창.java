package 객체7차과제;

import java.awt.*;
import java.awt.event.*;

public class 입력창 extends Dialog implements ActionListener {
	Choice[] 연목록=new Choice[10];
	Choice[] 월목록=new Choice[10];
	Choice[] 일목록=new Choice[10];
	Choice[] 범주목록=new Choice[10];
	TextField[] 내역목록=new TextField[10];
	TextField[] 수입목록= new TextField[10];
	TextField[] 지출목록=new TextField[10];
	TextField[] 잔액목록=new TextField[10];
	TextField[] 비고목록=new TextField[10];
	Button 입력버튼=new Button("입력");
	
	String[] 연, 월, 일, 범주, 내역, 비고;
	int[] 수입, 지출, 잔액;
	int 총수입, 총지출, 총잔액;
	
	String[] 예시범주, 예시내역, 예시비고;
	int[] 예시년, 예시월, 예시일, 예시수입, 예시지출;
	
	
	제어자 제어자_객체=new 제어자();
	예시목록 예시목록=new 예시목록();
	
	public 입력창(Frame 부모) { this(부모, true); }
	
	public 입력창(Frame 부모, boolean modal) {
		super(부모, "장부 입력창");
		
		setSize(900, 500);
		setResizable(false);
		setLayout(null);
		
		Label 연표지=new Label("연");
		Label 월표지=new Label("월");
		Label 일표지=new Label("일");
		Label 내역표지=new Label("내역");
		Label 범주표지=new Label("범주");
		Label 수입표지=new Label("수입");
		Label 지출표지=new Label("지출");
		Label 잔액표지=new Label("잔액");
		Label 비고표지=new Label("비고");
		
		예시목록_가져오기();
		
		for(int i=0;i<10;i++) {
			연목록[i]=new Choice();
			for(int j=2018;j<=2020;j++) 연목록[i].add(Integer.toString(j));
			연목록[i].select(Integer.toString(예시년[i]));
			월목록[i]=new Choice();
			for(int j=1;j<=12;j++) 월목록[i].add(Integer.toString(j));
			월목록[i].select(Integer.toString(예시월[i]));
			일목록[i]=new Choice();
			for(int j=1;j<=31;j++) 일목록[i].add(Integer.toString(j));
			일목록[i].select(Integer.toString(예시일[i]));
			
			Choice c범주목록=new Choice();
			범주목록[i]=c범주목록;
				c범주목록.add("용돈");
				c범주목록.add("알바비");
				c범주목록.add("식비");
				c범주목록.add("의류비");
				c범주목록.add("주거비");
				c범주목록.add("문화비");
				c범주목록.add("통신비");
				c범주목록.select(예시범주[i]);
			
			내역목록[i]=new TextField(예시내역[i]);
			수입목록[i]=new TextField(Integer.toString(예시수입[i]));
			지출목록[i]=new TextField(Integer.toString(예시지출[i]));
			잔액목록[i]=new TextField("");
			비고목록[i]=new TextField("");
		}
		
		연표지.setBounds(30, 50, 70, 20);
		월표지.setBounds(110, 50, 70, 20);
		일표지.setBounds(190, 50, 70, 20);
		범주표지.setBounds(270, 50, 70, 20);
		내역표지.setBounds(350, 50, 70, 20);
		수입표지.setBounds(430, 50, 70, 20);
		지출표지.setBounds(510, 50, 70, 20);
		잔액표지.setBounds(590, 50, 70, 20);
		비고표지.setBounds(670, 50, 70, 20);
		
		int y위치=75;
		for(int i=0;i<10;i++) {
			연목록[i].setBounds(30, y위치, 80, 20);
			월목록[i].setBounds(110, y위치, 70, 20);
			일목록[i].setBounds(190, y위치, 70, 20);
			범주목록[i].setBounds(270, y위치, 70, 20);
			내역목록[i].setBounds(350, y위치, 70, 20);
			수입목록[i].setBounds(430, y위치, 70, 20);
			지출목록[i].setBounds(510, y위치, 70, 20);
			잔액목록[i].setBounds(590, y위치, 70, 20);
			비고목록[i].setBounds(670, y위치, 70, 20);
			y위치+=25;
		}
		입력버튼.setBounds(250, 350, 40, 20);
		
		add(연표지);
		add(월표지);
		add(일표지);
		add(범주표지);
		add(내역표지);
		add(수입표지);
		add(지출표지);
		add(잔액표지);
		add(비고표지);
		
		for(int i=0;i<10;i++) {
			add(연목록[i]);
			add(월목록[i]);
			add(일목록[i]);
			add(범주목록[i]);
			add(내역목록[i]);
			add(수입목록[i]);
			add(지출목록[i]);
			add(잔액목록[i]);
			add(비고목록[i]);
		}
		
		add(입력버튼);
		입력버튼.addActionListener(this);
		 addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent we) {
	            dispose();
	         }
	      });
	}
	private void 예시목록_가져오기() {
		예시년=new int[10];
		예시월=new int[10];
		예시일=new int[10];
		예시범주=new String[10];
		예시내역=new String[10];
		예시수입=new int[10];
		예시지출=new int[10];
		예시비고=new String[10];
		
		예시년=예시목록.연_얻기();
		예시월=예시목록.월_얻기();
		예시일=예시목록.일_얻기();
		예시범주=예시목록.범주_얻기();
		예시내역=예시목록.내역_얻기();
		예시수입=예시목록.수입_얻기();
		예시지출=예시목록.지출_얻기();
		예시비고=예시목록.비고_얻기();
		
	}

	public void actionPerformed(ActionEvent e) {
		   switch(e.getActionCommand())
		   {
		   case "입력" :
			   입력자료저장();
			   Frame f=new Frame();
			   출력창 출력창=new 출력창(f, 10);
			   출력창.자료설정(연, 월, 일, 범주, 내역, 수입, 지출, 잔액, 비고, 총수입, 총지출, 총잔액);
			   출력창.화면_출력();
				  
			   출력창.setSize     (700, 450); 
			   출력창.setLocation (400, 400);
			   출력창.setResizable(false);
			   출력창.setVisible  (true);
			   break;
		   
		   default:
			   break;
		   }
	}
	
	public void 입력자료저장() {
		연=new String[10];
		월=new String[10];
		일=new String[10];
		범주=new String[10];
		내역=new String[10];
		수입=new int[10];
		지출=new int[10];
		잔액=new int[10];
		비고=new String[10];

		// 입력자료 저장을 위한 작업
		for (int i = 0; i < 10; i++)
		{
			연[i]=연목록[i].getSelectedItem();
			월[i] = 월목록[i].getSelectedItem();
			일[i] = 일목록[i].getSelectedItem();
			범주[i]=범주목록[i].getSelectedItem();
			내역[i]=내역목록[i].getText();
			수입[i] = Integer.parseInt(수입목록[i].getText());
			지출[i] = Integer.parseInt(지출목록[i].getText());
			비고[i]=비고목록[i].getText();
		}

		제어자_객체.입력항목들_저장하기(연, 월, 일, 범주, 내역, 수입, 지출, 비고);
		제어자_객체.잔액계산();
		잔액=제어자_객체.잔액가져오기();
		총수입=제어자_객체.총수입_가져오기();
		총지출=제어자_객체.총지출_가져오기();
		총잔액=제어자_객체.총잔액_가져오기();
	}
	
	public void 입력창_설정() {
		Frame f = new Frame();
	      입력창 임의창 = new 입력창(f);
	      
	      임의창.setSize     (900, 400);
	      임의창.setResizable(false);
	      임의창.setVisible  (true);
	}
	
	public void main(String[] args) {
		입력창_설정();
	}
}
