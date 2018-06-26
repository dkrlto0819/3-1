package 성적처리;

import java.awt.*;
import java.awt.event.*;

// c제어자와 상호작용
public class 입력창 extends Dialog implements ActionListener {
   private final int   줄수     = 15;
   private TextField[] htxt, itxt, mtxt, ftxt, atxt, rtxt;
   private 제어자 제어자_객체;
   
  // public 입력창(Frame 소유자) { this(소유자, true); }

   public 입력창(Frame 소유자) {
      super(소유자, "성적자료 입력");
      
      제어자_객체 = new 제어자(줄수);
      
      int i, x, y;

      Label hlbl = new Label("학   번", Label.CENTER);
      Label ilbl = new Label("이   름", Label.CENTER);
      Label mlbl = new Label("중   간", Label.CENTER);
      Label flbl = new Label("기   말", Label.CENTER);
      Label albl = new Label("출   석", Label.CENTER);
      Label rlbl = new Label("과   제", Label.CENTER);

      htxt = new TextField[줄수];  itxt = new TextField[줄수];
      mtxt = new TextField[줄수];  ftxt = new TextField[줄수];
      atxt = new TextField[줄수];  rtxt = new TextField[줄수];

      for (i = 0; i < 줄수; i++) {
         htxt[i] = new TextField(3);  itxt[i] = new TextField(4);
         mtxt[i] = new TextField(2);  ftxt[i] = new TextField(2);
         atxt[i] = new TextField(2);  rtxt[i] = new TextField(2);
         
         htxt[i].setText(" ");itxt[i].setText(" ");
         mtxt[i].setText("0");ftxt[i].setText("0");
         atxt[i].setText("0");rtxt[i].setText("0");
      }


      Button 완료단추 = new Button("입력완료");
      완료단추.addActionListener(this);

      setLayout(null);
      hlbl.setBounds( 10, 30, 50, 30);  ilbl.setBounds( 70, 30, 50, 30);
      mlbl.setBounds(130, 30, 50, 30);  flbl.setBounds(190, 30, 50, 30);
      albl.setBounds(250, 30, 50, 30);  rlbl.setBounds(310, 30, 50, 30);

      x = 10;  y = 70;
      for (i = 0; i < 줄수; i++) {
         htxt[i].setBounds(x, y, 50, 20);       itxt[i].setBounds(x+60, y, 50, 20);
         mtxt[i].setBounds(x+120, y, 30, 20); ftxt[i].setBounds(x+190, y, 30, 20);
         atxt[i].setBounds(x+250, y, 30, 20);  rtxt[i].setBounds(x+310, y, 30, 20);
         y = y + 25;
      }
      완료단추.setBounds(220, 450, 60, 25);

      add(hlbl);  add(ilbl);
      add(mlbl);  add(flbl);  add(albl);  add(rlbl);
      for (i = 0; i < 줄수; i++) {
         add(htxt[i]);  add(itxt[i]);  add(mtxt[i]);
         add(ftxt[i]);  add(atxt[i]);  add(rtxt[i]);
      }
      add(완료단추);

      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
            dispose();
         }
      });
   }

   public void actionPerformed(ActionEvent e) {
	   switch(e.getActionCommand())
	   {
		   case "입력완료" :
		   
		   입력자료저장();
		   
		   // 출력창 띄우기
		      Frame f = new Frame();
		      출력창 임의창 = new 출력창(f, 제어자_객체);
		      
		      임의창.setSize     (500, 500); 
		      임의창.setLocation (400, 400);
		      임의창.setResizable(false);
		      임의창.setVisible  (true);
		      break;
		   
		   default:
			   break;
	   }
   }
   
   private void 입력자료저장()
   {
		String[] 학번, 이름;
		int[] 중간, 기말, 출석, 과제;
		
		학번 = new String[htxt.length];
		이름 = new String[itxt.length];
		중간 = new int[mtxt.length];
		기말 = new int[ftxt.length];
		출석 = new int[atxt.length];
		과제 = new int[rtxt.length];
		
		// 입력자료 저장을 위한 작업
		for (int i = 0; i < 줄수; i++)
		{
			학번[i] = htxt[i].getText();
			이름[i] = itxt[i].getText();
			중간[i] = Integer.parseInt(mtxt[i].getText());
			기말[i] = Integer.parseInt(ftxt[i].getText());
			출석[i] = Integer.parseInt(atxt[i].getText());
			과제[i] = Integer.parseInt(rtxt[i].getText());
		}

		// 입력자료 저장 및 계산
		제어자_객체.학생성적자료_저장하기(학번, 이름, 중간, 기말, 출석, 과제);
		제어자_객체.학생성적계산();
   }

   public static void main(String[] args) {
      Frame f = new Frame();
      입력창 임의창 = new 입력창(f);
      
      임의창.setSize     (400, 500);
      임의창.setLocation (400, 400);
      임의창.setResizable(false);
      임의창.setVisible  (true);
   }
}
