package 성적처리;
import java.awt.*;
import java.awt.event.*;

// c제어자와 상호작용
public class 출력창 extends Dialog implements ActionListener {
   private final int   줄수     = 15;
   private Label[] htxt, itxt, mtxt, ftxt, atxt, rtxt, ttxt, gtxt;
   private 제어자 제어자_객체;
   
   public 출력창(Frame 소유자, 제어자 제어자_객체) { this(소유자, true, 제어자_객체); }

   public 출력창(Frame 소유자, boolean 모달, 제어자 제어자_객체) {
      super(소유자, "성적자료 출력", 모달);
      this.제어자_객체 = 제어자_객체;
      
    String[] 학번배열, 이름배열, 학점배열;
      int[] 중간배열, 기말배열, 출석배열, 과제배열, 총계배열;
      
      int i, x, y;
      
      학번배열 = 제어자_객체.get학번배열();
      이름배열 = 제어자_객체.get이름배열();
      학점배열 = 제어자_객체.get학점배열();
      중간배열 = 제어자_객체.get중간배열();
      기말배열 = 제어자_객체.get기말배열();
      출석배열 = 제어자_객체.get출석배열();
      과제배열 = 제어자_객체.get과제배열();
      총계배열 = 제어자_객체.get총계배열();
      
      Label hlbl = new Label("학   번", Label.CENTER);
      Label ilbl = new Label("이   름", Label.CENTER);
      Label mlbl = new Label("중   간", Label.CENTER);
      Label flbl = new Label("기   말", Label.CENTER);
      Label albl = new Label("출   석", Label.CENTER);
      Label rlbl = new Label("과   제", Label.CENTER);     
      Label tlbl = new Label("총   계", Label.CENTER);
      Label glbl = new Label("학   점", Label.CENTER);

      htxt = new Label[줄수];  itxt = new Label[줄수];
      mtxt = new Label[줄수];  ftxt = new Label[줄수];
      atxt = new Label[줄수];  rtxt = new Label[줄수];
      ttxt = new Label[줄수];  gtxt = new Label[줄수];      

      for (i = 0; i < 줄수; i++) {
         htxt[i] = new Label(학번배열[i]);  itxt[i] = new Label(이름배열[i]);
         mtxt[i] = new Label(String.valueOf(중간배열[i]));  ftxt[i] = new Label(String.valueOf(기말배열[i]));
         atxt[i] = new Label(String.valueOf(출석배열[i]));  rtxt[i] = new Label(String.valueOf(과제배열[i]));
         ttxt[i] = new Label(String.valueOf(총계배열[i]));  gtxt[i] = new Label(String.valueOf(학점배열[i]));
      }


      Button 완료단추 = new Button("확인완료");
      완료단추.addActionListener(this);

      setLayout(null);
      hlbl.setBounds( 10, 30, 50, 30);  ilbl.setBounds( 70, 30, 50, 30);
      mlbl.setBounds(130, 30, 50, 30);  flbl.setBounds(190, 30, 50, 30);
      albl.setBounds(250, 30, 50, 30);  rlbl.setBounds(310, 30, 50, 30);
      tlbl.setBounds(370, 30, 50, 30);glbl.setBounds(430, 30, 50, 30);

      x = 10;  y = 70;
      for (i = 0; i < 줄수; i++) {
         htxt[i].setBounds(x, y, 50, 20);       itxt[i].setBounds(x+60, y, 50, 20);
         mtxt[i].setBounds(x+120, y, 30, 20); ftxt[i].setBounds(x+190, y, 30, 20);
         atxt[i].setBounds(x+250, y, 30, 20);  rtxt[i].setBounds(x+310, y, 30, 20);
         ttxt[i].setBounds(x+370, y, 30, 20);gtxt[i].setBounds(x+430, y, 50, 20);
         y = y + 25;
      }
      완료단추.setBounds(220, 450, 60, 25);

      add(hlbl);  add(ilbl);
      add(mlbl);  add(flbl);  add(albl);  add(rlbl);
      add(tlbl); add(glbl);
      for (i = 0; i < 줄수; i++) {
         add(htxt[i]);  add(itxt[i]);  add(mtxt[i]);
         add(ftxt[i]);  add(atxt[i]);  add(rtxt[i]);
         add(ttxt[i]);add(gtxt[i]);
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
   case "확인완료" :
      dispose();
   break;
   
   default:
   break;
   }
   }
}