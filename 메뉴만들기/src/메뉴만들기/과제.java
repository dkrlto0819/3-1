package 메뉴만들기;
import java.awt.*;
public class 과제 extends Frame {

      과제(){
         super("메뉴 예");
         
         MenuBar 메뉴_막대=new MenuBar();
         
         Menu 파일=new Menu("파일");
         	Menu 입력=new Menu("입력");
         		입력.add("직접 입력");
         	파일.add(입력);
         메뉴_막대.add(파일);
         
         setMenuBar(메뉴_막대);
         	
      }
      
      public static void main(String[] args) {
         과제 md = new 과제();
         md.setSize(300,200);
         md.setVisible(true);
      }

}