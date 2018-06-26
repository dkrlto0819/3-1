package 객체최종과제;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import 객체1차과제.시간차구하기;
import 객체2차과제.중간값구하기;
import 객체2차과제.윤년판단하기;
import 객체2차과제.구구단_합;
import 객체3차과제.제어자;
import 객체4차과제.제어자_4차;
import 객체5차과제.제어자_5차;
import 객체6차과제.제어자_6차;
import 객체7차과제.입력창;
import 객체질문과제.메인;

public class 객체최종과제 extends JFrame implements ActionListener{
	JMenuItem 일차, 삼차, 사차, 오차, 육차, 칠차, 오차질문;
	JMenuItem 중간값구하기, 윤년구하기, 구구단합;
		객체최종과제() {
			setTitle("Menu 만들기 예제");
			메뉴만들기(); // 메뉴 생성, 프레임에 삽입
			setSize(250,200);
			setVisible(true);
			
			 addWindowListener(new WindowAdapter() {
		         public void windowClosing(WindowEvent we) {
		            dispose();
		         }
		      });
		}

		public void 메뉴만들기() {
			JMenuBar 메뉴막대 = new JMenuBar(); 
			JMenu 내정보 = new JMenu("내정보");
				JMenu 신상정보=new JMenu("신상정보");
					신상정보.add("사진보기");
					신상정보.add("-");
					JMenu 연락처=new JMenu("연락처보기");
						연락처.add("010-4902-1604");
					신상정보.add(연락처);	
				내정보.add(신상정보);
				내정보.add("-");
				내정보.add(new JMenuItem("수강정보"));
				내정보.add("-");
				내정보.add(new JMenuItem("객체평가"));
				내정보.add("-");
				내정보.add(new JMenuItem("종료"));

			메뉴막대.add(내정보);
			JMenu 첫번째과제 = new JMenu("1-4차 과제");
				첫번째과제.add((일차=new JMenuItem("1차")));
				JMenu 이차과제 = new JMenu("2차");
					이차과제.add(중간값구하기=new JMenuItem("중간값구하기"));
					이차과제.add(윤년구하기=new JMenuItem("윤년판단하기"));
					이차과제.add(구구단합=new JMenuItem("구구단/합"));
				첫번째과제.add(이차과제);
				첫번째과제.add((삼차=new JMenuItem("3차")));
				첫번째과제.add((사차=new JMenuItem("4차")));
				일차.addActionListener(this);
				중간값구하기.addActionListener(this);
				윤년구하기.addActionListener(this);
				구구단합.addActionListener(this);
				삼차.addActionListener(this);
				사차.addActionListener(this);
			메뉴막대.add(첫번째과제);
			JMenu 두번째과제 = new JMenu("5-8차 과제");
				두번째과제.add((오차=new JMenuItem("5차")));
				두번째과제.add((육차=new JMenuItem("6차")));
				두번째과제.add((칠차=new JMenuItem("7차")));
				두번째과제.add((오차질문=new JMenuItem("5차 질문")));
				오차.addActionListener(this);
				육차.addActionListener(this);
				칠차.addActionListener(this);
				오차질문.addActionListener(this);
			메뉴막대.add(두번째과제);
			JMenu 도움말 = new JMenu("도움말");
			메뉴막대.add(도움말);
			setJMenuBar(메뉴막대);
			
			라벨출력();
		}
		
		public void 라벨출력() {
			
			Label 첫번째줄=new Label("강재희의 학기 프로젝트");
			Label 두번째줄=new Label("2018년 1학기");
			Label 세번째줄=new Label("객체지향 프로그래밍");
			Label 공백=new Label("	");
			
			첫번째줄.setBounds(55, 10, 200, 20);
			두번째줄.setBounds(70, 30, 100, 20);
			세번째줄.setBounds(60, 50, 200, 20);
			공백.setBounds(10, 70, 200, 20);
			
			add(첫번째줄);
			add(두번째줄);
			add(세번째줄);
			add(공백);
		}
		
		public void actionPerformed(ActionEvent ae) {
			switch(ae.getActionCommand()){
			   case "1차" :
				  시간차구하기 일차과제=new 시간차구하기(); 
				  일차과제.시작();
				  break;
			   case "중간값구하기":
				  중간값구하기 중간값=new 중간값구하기();
				  중간값.중간값실행();
				   break;
			   case "윤년판단하기":
				   윤년판단하기 윤년판단=new 윤년판단하기();
				   윤년판단.윤년판단();
				   break;
			   case "구구단/합":
				   구구단_합 구_합=new 구구단_합();
				   구_합.구구단_또는_합();
				   break;
			   case "3차" :
				   제어자 삼차시작=new 제어자();
				   삼차시작.주_처리하기();
				   break;
			   case "4차":
				   제어자_4차 사차시작=new 제어자_4차();
				   사차시작.선택하기();
				   break;
			   case "5차" :
				   제어자_5차 오차시작=new 제어자_5차();
				   오차시작.주_제어자();
				   break;
			   case "6차":
				   제어자_6차 육차시작=new 제어자_6차();
				   육차시작.주_제어자();
				   break;
			   case "7차" :
				   Frame f = new Frame();
				   입력창 칠차시작=new 입력창(f);
				   칠차시작.입력창_설정();
				   break;
			   case "5차 질문":
				   메인 질문출력=new 메인();
				   질문출력.질문_출력하기();
				   break;
			   default:
				   break;
		   }
		}
		public static void main(String [] args) {
			객체최종과제 시작=new 객체최종과제();
		}
}
