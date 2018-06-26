package IT.Year2017.Local;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class MainPage extends JFrame{
	TBL_sql use_sql = new TBL_sql();
	private String member;
	JPanel panel;
	private JLabel title_lbl, fill_lbl;
	private JButton[] jbtn = new JButton[5];
	
	public MainPage(String member){
		//기본 설정 -> 제목, 크기, 위치(화면 가운데)
		setTitle("고속버스예매 프로그램");
		setLayout(null);
		setSize(Main.size);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.member = member;
		init();
		
		setResizable(false);
		setVisible(true);
	}
	
	//버튼에 따라 폼이 구성되므로 누를 떄 마다 초기화
	void init(){
		String[] jbtn_name = {"배차차량조회", "예약신청", "차량좌석조회", "승차권발매", "예약조회"};
		
		//제목 생성
		title_lbl = new JLabel("고속버스 예매 프로그램");
		title_lbl.setFont(new Font("Dialog", Font.BOLD, 25));
		
		//줄을 Label 형태로 사용
		fill_lbl = new JLabel();
		fill_lbl.setOpaque(true);
		fill_lbl.setBackground(Color.blue);
		
		//버튼 생성
		for (int i = 0; i < jbtn.length; i++){
			jbtn[i] = new JButton(jbtn_name[i]);
			jbtn[i].addActionListener(listener);
		}
		
		//위치 및 크기 지정
		title_lbl.setBounds(270, 5, 300, 30);
		fill_lbl.setBounds(0, 75, Main.size.width, 10);
		jbtn[0].setBounds(120, 45, 120, 25);
		jbtn[1].setBounds(260, 45, 90, 25);
		jbtn[2].setBounds(370, 45, 120, 25);
		jbtn[3].setBounds(510, 45, 110, 25);
		jbtn[4].setBounds(640, 45, 90, 25);
		
		add(title_lbl);
		add(fill_lbl);
		for (int i = 0; i < jbtn.length; i++){
			add(jbtn[i]);
		}
	}
	
	void frame_update(){
		invalidate();
		repaint();
	}
	
	void panel_delete(){
		remove(panel);
		frame_update();
		panel = null;
	}
	
	void panel_insert(JPanel jpanel, int x, int y){
		panel = jpanel;
		panel.setLocation(x, y);
		add(panel);
	}
	
	ActionListener listener = new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			Object obj = e.getSource();
			JPanel pane = null;
			
			if (panel != null){
				panel_delete();
			}
			
			if (obj == jbtn[0]){
				panel_insert(new Dispatch(), 0, 110);
				for (int i = 0; i < 5; i++) jbtn[i].setEnabled(true);
				jbtn[0].setEnabled(false);
			} else if (obj == jbtn[1]){
				panel_insert(new reservation(member), 0, 90);
				for (int i = 0; i < 5; i++) jbtn[i].setEnabled(true);
				jbtn[1].setEnabled(false);
			} else if (obj == jbtn[2]){
				panel_insert(new Seat(member, "", "", ""), 0, 90);
				for (int i = 0; i < 5; i++) jbtn[i].setEnabled(true);
				jbtn[2].setEnabled(false);
			} else if (obj == jbtn[3]){
				panel_insert(new Release(member), 0, 90);
				for (int i = 0; i < 5; i++) jbtn[i].setEnabled(true);
				jbtn[3].setEnabled(false);
			} else if (obj == jbtn[4]){
				panel_insert(new Reservation_View(), 0, 90);
				for (int i = 0; i < 5; i++) jbtn[i].setEnabled(true);
				jbtn[4].setEnabled(false);
			}
			frame_update();
		}
	};
	
	//예약신청
	class reservation extends JPanel{
		private String member;
		private JLabel title_lbl, car_lbl;
		private JComboBox num_txt, car_txt, year_txt, month_txt, day_txt;
		private JButton view_btn, main_btn;
		private Object[][] temp;
		private String[] temp_str;
		private Calendar now = Calendar.getInstance(); //현재 날짜
		private int year = now.get(Calendar.YEAR), month = now.get(Calendar.MONTH), last_day;
		
		public reservation(String id){
			member = id; //로그인 정보 받아오기
			
			//크기 설정
			setSize(Main.size.width, Main.size.height - 180);
			
			//제목 생성
			title_lbl = new JLabel("배차차량조회 및 예약하기");
			title_lbl.setFont(new Font("Dialog", Font.BOLD, 23));
			
			//JLabel 생성
			car_lbl = new JLabel("차량정보 :");
			
			//JCheckBox 생성
			temp = use_sql.select_data("select bNumber from TBL_Bus");
			temp_str = new String[temp.length];
			for (int i = 0; i < temp_str.length; i++){
				temp_str[i] = temp[i][0].toString();
			}
			num_txt = new JComboBox<String>(temp_str);
			temp_str = new String[2];
			temp_str[0] = "1호차";
			temp_str[1] = "2호차";
			car_txt = new JComboBox<String>(temp_str);
			temp_str = new String[1];
			temp_str[0] = year + "년";
			year_txt = new JComboBox<String>(temp_str);
			if (month == 10){
				temp_str = new String[3];
			} else if (month == 11){
				temp_str = new String[2];
			} else{
				temp_str = new String[4];
			}
			temp_str[0] = "==월 선택==";
			for (int i = 1; i < temp_str.length; i++){
				if (month + i > 12){
					continue;
				} else if (month + i < 10){
					temp_str[i] = "0" + (month + i) + "월";
				} else{
					temp_str[i] = (month + i) + "월";
				}
			}
			month_txt = new JComboBox<String>(temp_str);
			temp_str = new String[1];
			temp_str[0] = "==일 선택==";
			day_txt = new JComboBox<String>(temp_str);
			
			//JButton 생성
			view_btn = new JButton("좌석조회");
			main_btn = new JButton("메인으로");
			
			//월이 바뀔 때마다 일 선택 숫자가 틀려야함
			month_txt.addActionListener(listener);
			
			//기능 구현
			view_btn.addActionListener(listener);
			main_btn.addActionListener(listener);
			
			//위치 및 크기 지정
			title_lbl.setBounds(5, 0, 300, 30);
			car_lbl.setBounds(15, 50, 60, 20);
			num_txt.setBounds(85, 45, 60, 28);
			car_txt.setBounds(155, 45, 60, 28);
			year_txt.setBounds(225, 45, 70, 28);
			month_txt.setBounds(305, 45, 100, 28);
			day_txt.setBounds(415, 45, 100, 28);
			view_btn.setBounds(525, 45, 100, 28);
			main_btn.setBounds(635, 45, 100, 28);
			
			//JPanel에 요소 추가
			add(title_lbl);
			add(car_lbl);
			add(num_txt);
			add(car_txt);
			add(year_txt);
			add(month_txt);
			add(day_txt);
			add(view_btn);
			add(main_btn);
		}
		
		ActionListener listener = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Object obj = e.getSource();
				
				if (obj == month_txt){
					if (month_txt.getSelectedItem().toString() != "==월 선택=="){
						String change = month_txt.getSelectedItem().toString().replace("월", "");
						now.set(Calendar.MONTH, Integer.parseInt(change) - 1);
						last_day = now.getActualMaximum(Calendar.DAY_OF_MONTH);
						temp_str = new String[last_day + 1];
						temp_str[0] = "==일 선택==";
						for (int i = 1; i < temp_str.length; i++){
							if (i < 10){
								temp_str[i] = "0" + i + "일";
							} else{
								temp_str[i] = i + "일";
							}
						}
					} else{
						temp_str = new String[1];
						temp_str[0] = "==일 선택==";
					}
					remove(day_txt);
					repaint();
					day_txt = new JComboBox<String>(temp_str);
					day_txt.setBounds(415, 45, 100, 28);
					add(day_txt);
				} else if (obj == view_btn){
					if (month_txt.getSelectedItem().toString() == "==월 선택==" || day_txt.getSelectedItem().toString() == "==일 선택=="){
						JOptionPane.showMessageDialog(null, "월 또는 일을 선택하여 주십시오.", "메시지", JOptionPane.INFORMATION_MESSAGE);
					} else{
						String temp_month = month_txt.getSelectedItem().toString().replace("월", "");
						String temp_day = day_txt.getSelectedItem().toString().replace("일", "");
						JOptionPane.showMessageDialog(null, "예약이 시작됩니다.", "웹 페이지 메시지", JOptionPane.WARNING_MESSAGE);
						panel_delete();
						panel_insert(new Seat(member, num_txt.getSelectedItem().toString(),
								Integer.toString(year) + "-" + temp_month + "-" + temp_day,
								car_txt.getSelectedItem().toString()), 0, 90);
						for (int i = 0; i < 5; i++){
							jbtn[i].setEnabled(true);
						}
						jbtn[2].setEnabled(false);
					}
				} else if (obj == main_btn){
					panel_delete();
				}
			}
		};
	}
}
