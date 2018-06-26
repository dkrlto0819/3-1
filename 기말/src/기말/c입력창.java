package 기말;

import java.awt.*;
import java.awt.event.*;

// c제어자와 상호작용
public class c입력창 extends Dialog implements ActionListener {
   private final int   줄수 = 10;
   private Choice[] 월목록=new Choice[줄수];
   private Choice[] 일목록=new Choice[줄수];
   private Choice[] 범주=new Choice[줄수];
   private TextField[] 내역=new TextField[줄수];
   private TextField[] 수입= new TextField[줄수];
   private TextField[] 지출=new TextField[줄수];
   private TextField[] 잔액=new TextField[줄수];
   private TextField[] 비고=new TextField[줄수];
   private c제어자 제어자_객체;
   
   private String[] 임시범주;
   private String[] 임시내역;
   private int[] 임시수입;
   private int[] 임시지출;
   
   public c입력창(Frame 소유자) { this(소유자, true); }

   public c입력창(Frame 소유자, boolean 모달) {
      super(소유자, "성적자료 입력", 모달);
      
      제어자_객체 = new c제어자(줄수);
      
      int i, x, y;

      Label 월표지 = new Label("월", Label.CENTER);
      Label 일표지 = new Label("일", Label.CENTER);
      Label 수입표지 = new Label("범주", Label.CENTER);
      Label 내역표지 = new Label("내역", Label.CENTER);
      Label 범주표지 = new Label("수입", Label.CENTER);
      Label 지출표지 = new Label("지출", Label.CENTER);
      Label 잔액표지 = new Label("잔액", Label.CENTER);
      Label 비고표지 = new Label("비고", Label.CENTER);


      for (i = 0; i < 줄수; i++) {
         내역[i] = new TextField(5);  수입[i] = new TextField(5);
         지출[i] = new TextField(5);  잔액[i] = new TextField(5);
         비고[i] = new TextField(5);  
         
         내역[i].setText(임시내역[i]); 수입[i].setText(Integer.toString(임시수입[i]));
         지출[i].setText(Integer.toString(임시지출[i])); 잔액[i].setText(" ");
         비고[i].setText(" ");
      }


      Button 완료단추 = new Button("입력완료");
      완료단추.addActionListener(this);

      setLayout(null);
      월표지.setBounds( 10, 30, 50, 30);  일표지.setBounds( 70, 30, 50, 30);
      범주표지.setBounds(130, 30, 50, 30);  내역표지.setBounds(190, 30, 50, 30);
      수입표지.setBounds(250, 30, 50, 30);  지출표지.setBounds(310, 30, 50, 30);
      잔액표지.setBounds(250, 30, 50, 30);  비고표지.setBounds(310, 30, 50, 30);

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
      c출력창 임의창 = new c출력창(f, 제어자_객체);
      
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
      c입력창 임의창 = new c입력창(f);
      
      임의창.setSize     (400, 500);
      임의창.setLocation (400, 400);
      임의창.setResizable(false);
      임의창.setVisible  (true);
   }
}