package 마지막과제;

import java.awt.*;
import java.awt.event.*;

public class 출력창 extends Dialog implements ActionListener {
	String[] 입력년, 입력월, 입력일, 입력범주, 입력내역, 입력비고;
	int[] 입력수입, 입력지출, 잔액;
	int 최종수입, 최종지출, 총_잔액;
	
	private Label lb연, lb월, lb일, lb범주, lb내역, lb수입, lb지출, lb잔액, lb비고;
	private Label[] 연표지, 월표지, 일표지, 범주표지, 내역표지, 수입표지, 지출표지, 잔액표지, 비고표지;
	private Label lb총수입, lb총지출, lb총잔액;
	
	출력창(Frame 부모, int 입력수){
		super(부모, "장부 출력창");
		
		입력년=new String[입력수];
		입력월=new String[입력수];
		입력일=new String[입력수];
		입력범주=new String[입력수];
		입력내역=new String[입력수];
		입력비고=new String[입력수];
		입력수입=new int[입력수];
		입력지출=new int[입력수];
		잔액=new int[입력수];	
		
		addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent we) {
	            dispose();
	         }
	      });
	}
	
	public void 자료설정(String[] 연, String[] 월, String[] 일, String[] 범주, String[] 내역, int[] 수입, int[] 지출, int[] 최종잔액, String[] 비고, int 총수입, int 총지출, int 총잔액) {
		입력년=연;
		입력월=월;
		입력일=일;
		입력범주=범주;
		입력수입=수입;
		입력지출=지출;
		잔액=최종잔액;
		입력비고=비고;
		
		최종수입=총수입;
		최종지출=총지출;
		총_잔액=총잔액;
	}
	
	public void 화면_출력() {
		   연표지 = new Label[10];
		   월표지 = new Label[10];
		   일표지 = new Label[10];
		   범주표지 = new Label[10];
		   내역표지 = new Label[10];
		   수입표지 = new Label[10];
		   지출표지 = new Label[10];
		   잔액표지 = new Label[10];
		   비고표지 = new Label[10];
		   
		   lb연=new Label("년");
		   lb월=new Label("월");
		   lb일=new Label("일");
		   lb범주=new Label("범주");
		   lb내역=new Label("내역");
		   lb수입=new Label("수입");
		   lb지출=new Label("지출");
		   lb잔액=new Label("잔액");
		   lb비고=new Label("비고");
		   
		   lb총수입=new Label();
		   lb총지출=new Label();
		   lb총잔액=new Label();

		   for (int i = 0; i < 10 ; i++) {
			  연표지[i]=new Label(입력년[i]);
		    	  월표지[i]=new Label(입력월[i]);
		    	  일표지[i]=new Label(입력일[i]);
		    	  범주표지[i]=new Label(입력범주[i]);
		    	  내역표지[i]=new Label(입력내역[i]);
		    	  수입표지[i]=new Label(Integer.toString(입력수입[i]));
		    	  지출표지[i]=new Label(Integer.toString(입력지출[i]));
		    	  잔액표지[i]=new Label(Integer.toString(잔액[i]));
		    	  비고표지[i]=new Label(입력비고[i]);
		   }
		    lb총수입=new Label(Integer.toString(최종수입));
	    	  	lb총지출=new Label(Integer.toString(최종지출));
	    	  	lb총잔액=new Label(Integer.toString(총_잔액));

		      Button bt확인 = new Button("확 인");

		      setSize(350, 450);
		      setLayout(null);
		      
		      lb연.setBounds(30, 20, 60, 20);
		       lb월.setBounds(90, 20, 60, 20);
			   lb일.setBounds(150, 20, 60, 20);
			   lb범주.setBounds(210, 20, 60, 20);
			   lb내역.setBounds(270, 20, 60, 20);
			   lb수입.setBounds(330, 20, 60, 20);
			   lb지출.setBounds(390, 20, 60, 20);
			   lb잔액.setBounds(450, 20, 60, 20);
			   lb비고.setBounds(510, 20, 60, 20);
		      
		      int y위치 = 50, y증가 = 30;
		      for (int i = 0; i <10; i++) {
		    	  	연표지[i].setBounds(30, y위치, 60, 20);
		    	  	월표지[i].setBounds(90, y위치, 60, 20);
		  		일표지[i].setBounds(150, y위치, 60, 20);
		  		범주표지[i].setBounds(210, y위치, 60, 20);
		  		내역표지[i].setBounds(270, y위치, 60, 20);
		  		수입표지[i].setBounds(330, y위치, 60, 20);
		  		지출표지[i].setBounds(390, y위치, 60, 20);
		  		잔액표지[i].setBounds(450, y위치, 60, 20);
		  		비고표지[i].setBounds(510, y위치, 60, 20);
		    
		         y위치 = y위치 + y증가;
		      }
		      
		      lb총수입.setBounds(330, y위치, 60, 20);
		      lb총지출.setBounds(390, y위치, 60, 20);
		      lb총잔액.setBounds(450, y위치, 60, 20);

		      bt확인.setBounds(250, y위치+30, 60, 30);

		      add(lb연);
		      add(lb월);
		      add(lb일);
		      add(lb범주);
		      add(lb내역);
		      add(lb수입);
		      add(lb지출);
		      add(lb잔액);
		      add(lb비고);
		      
		      for (int i = 0; i <10; i++) {
		    	  	add(연표지[i]);
		         add(월표지[i]); add(일표지[i]); add(범주표지[i]);
		         add(내역표지[i]); add(수입표지[i]); add(지출표지[i]);
		         add(잔액표지[i]); add(비고표지[i]);
		      }
		      add(lb총수입);
		      add(lb총지출);
		      add(lb총잔액);
		      add(bt확인);

		      bt확인.addActionListener(this);
	   }
	   

	   public void actionPerformed(ActionEvent ae) {
		   switch(ae.getActionCommand()){
		   case "확 인":
			   System.exit(0);
			   break;
		   default:
			   break;
		   }
	   }
}
