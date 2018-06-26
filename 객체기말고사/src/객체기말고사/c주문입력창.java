
package 객체기말고사;

import java.awt.*;
import java.awt.event.*;

public class c주문입력창 extends Dialog implements ActionListener {
   private String[] 음식코드들;
   private int[] 주문수량들;
   private int 음식수;
   private Label[] lb음식코드들;
   private TextField[] tx수량들;
   
   private c제어자 제어자_객체;
      
   c주문입력창(Frame 부모, c차림표 차림표) {
      super(부모, "주문 입력창", true);
      
      setSize(100,300);
      
      String[] 음식명들;
      음식코드들 = 차림표.음식코드들_얻기();
      음식명들  = 차림표.음식이름들_얻기();
      음식수   = 차림표.음식수_얻기();

      Label[] lb음식명들;
      lb음식코드들 = new Label[음식수+1];
      lb음식명들  = new Label[음식수+1];
      tx수량들   = new TextField[음식수+1];

      for (int i = 1; i <=음식수; i++) {
         lb음식코드들[i] = new Label(음식코드들[i]);
         lb음식명들[i] = new Label(음식명들[i]);
         tx수량들[i] = new TextField(""+1);
      }
      
      Button bt확인, bt취소;
      bt확인 = new Button("확 인");
      bt취소 = new Button("취 소");

      setSize(250, 400);
      setLayout(null);
      
      int y위치 = 50, y증가 = 30;
      for (int i = 1; i <= 음식수; i++) {
         lb음식코드들[i].setBounds( 40, y위치, 30, 20);
         lb음식명들[i].setBounds  ( 80, y위치, 50, 20);
         tx수량들[i].setBounds   (150, y위치, 40, 20);
         y위치 = y위치 + y증가;
      }      
      bt확인.setBounds( 50, y위치, 60, 30);
      bt취소.setBounds(150, y위치, 60, 30);
      
      for (int i = 1; i <=음식수; i++) {
         add(lb음식코드들[i]); add(lb음식명들[i]); add(tx수량들[i]); 
      }      
      add(bt확인);  add(bt취소);
      
      bt확인.addActionListener(this);
      bt취소.addActionListener(this);

      addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
				System.exit(0);
			}
		});
   }

   public void actionPerformed(ActionEvent ae) {
	   
	   switch(ae.getActionCommand())
	   {
		   case "확 인" :
		   
			   입력자료저장(음식수); 
		   
		      Frame f = new Frame();
		      c주문결산창 임의창 = new c주문결산창(f, 음식수);
		      
		      임의창.setSize     (500, 500); 
		      임의창.setLocation (400, 400);
		      임의창.setResizable(false);
		      임의창.setVisible  (true);
		      break;
		   
		   default:
			   break;
	   }
	   
   }

   private void 입력자료저장(int 음식수)
   {
		int[] 음식주문량 = {0, };
		
		// 입력자료 저장을 위한 작업
		for (int i = 0; i <= 음식수; i++) 음식주문량[i]=Integer.parseInt(tx수량들[i].getText());

		// 입력자료 저장 및 계산
		//제어자_객체.음식주문량_저장하기(음식주문량);
		제어자_객체.음식가격계산(음식주문량);
   }

public String[] 음식코드들_얻기() { return 음식코드들; }
   public int[] 수량들_얻기() { return 주문수량들; }
}


