package 기말고사_객체;

import java.awt.*;
import java.awt.event.*;

public class c주문결산창 extends Dialog implements ActionListener {
	   private int 음식수;
	   private Label[] lb음식명들, lb수량들, lb단가들, lb금액들;
	   private Label lb총액;

	   private String 음식명들[];
	   private int[] 수량들, 단가들, 금액들;
	   private int 합계;
	   
	   c주문결산창(Frame 부모, int 개수) {
	      super(부모, "주문 결산창", true);

	      addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent we) {
	            dispose();
	         }
	      });
	   }
	   
	   public void 자료_설정(String[] 음식내역, int[] 주문수량들, int[] 단가금액들, int[] 계산금액, int 총액) {
		   	  음식수 = 10;
		   	  음식명들=음식내역;
		   	  수량들=주문수량들;
		   	  단가들=단가금액들;
		   	  금액들=계산금액;
		   	  합계=총액;
	   }
	   
	   public void 화면_출력() {
		   lb음식명들 = new Label[음식수+1];
		      lb수량들 = new Label[음식수+1];
		      lb단가들 = new Label[음식수+1];
		      lb금액들 = new Label[음식수+1];

		      for (int i = 1; i <=음식수; i++) {
		         lb음식명들[i] = new Label(음식명들[i]);
		         lb수량들[i] = new Label(Integer.toString(수량들[i]));
		         lb단가들[i] = new Label(Integer.toString(단가들[i]));
		         lb금액들[i] = new Label(Integer.toString(금액들[i]));
		      }
		      Label lb총계 = new Label("총 계");
		      lb총액 = new Label(Integer.toString(합계));

		      Button bt확인 = new Button("확 인");

		      setSize(350, 450);
		      setLayout(null);
		      
		      int y위치 = 50, y증가 = 30;
		      for (int i = 1; i <=음식수; i++) {
		         lb음식명들[i].setBounds( 40, y위치, 60, 20);
		         lb수량들[i].setBounds (120, y위치, 30, 20);
		         lb단가들[i].setBounds (170, y위치, 40, 20);
		         lb금액들[i].setBounds (230, y위치, 40, 20);
		         y위치 = y위치 + y증가;
		      }
		      lb총계.setBounds ( 60, y위치, 40, 20);
		      lb총액.setBounds (230, y위치, 40, 20);
		      y위치 = y위치 + y증가+20;

		      bt확인.setBounds(150, y위치, 60, 30);

		      for (int i = 1; i <=음식수; i++) {
		         add(lb음식명들[i]); add(lb수량들[i]); add(lb단가들[i]);
		         add(lb금액들[i]); 
		      }
		      add(lb총계);  add(lb총액);  add(bt확인);

		      bt확인.addActionListener(this);
	   }
	   

	   public void actionPerformed(ActionEvent ae) {
		   switch(ae.getActionCommand()){
		   case "확 인":
			   System.exit(0);
			   break;
		   }
	   }
	}

