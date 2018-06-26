package 객체기말고사;

import java.awt.*;
import java.awt.event.*;

public class c주문결산창 extends Dialog implements ActionListener {
	   private int 음식수;
	   private Label[] lb음식명들, lb수량들, lb단가들, lb금액들;
	   private Label lb총액;
	   
	   private String[] 음식코드들;
	   private String[] 음식이름들;
	   private int[] 음식주문량;
	   private int[] 음식가격;
	   private int[] 음식가격총량;

	   c주문결산창(Frame 부모, int 개수) {
	      super(부모, "주문 결산창", true);

	      음식수 = 개수;
	      lb음식명들 = new Label[음식수+1];
	      lb수량들 = new Label[음식수+1];
	      lb단가들 = new Label[음식수+1];
	      lb금액들 = new Label[음식수+1];

	      for (int i = 1; i <=음식수; i++) {
	         lb음식명들[i] = new Label("음식명");
	         lb수량들[i] = new Label("수량");
	         lb단가들[i] = new Label("단가들");
	         lb금액들[i] = new Label("금액들");
	      }
	      Label lb총계 = new Label("총 계");
	      lb총액 = new Label("총금액");

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

	      addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent we) {
	            dispose();
	         }
	      });
	   }
	   
	   public void 자료_설정(String[] 코드들, int[] 수량들, int[] 금액들, c차림표 차림표) {
		   음식코드들=코드들;
		   음식이름들=;
		   private int[] 음식주문량;
		   private int[] 음식가격;
		   private int[] 음식가격총량;
	   }

	   public void actionPerformed(ActionEvent ae) {

	   }
	}