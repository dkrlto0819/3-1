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
		//�⺻ ���� -> ����, ũ��, ��ġ(ȭ�� ���)
		setTitle("��ӹ������� ���α׷�");
		setLayout(null);
		setSize(Main.size);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.member = member;
		init();
		
		setResizable(false);
		setVisible(true);
	}
	
	//��ư�� ���� ���� �����ǹǷ� ���� �� ���� �ʱ�ȭ
	void init(){
		String[] jbtn_name = {"����������ȸ", "�����û", "�����¼���ȸ", "�����ǹ߸�", "������ȸ"};
		
		//���� ����
		title_lbl = new JLabel("��ӹ��� ���� ���α׷�");
		title_lbl.setFont(new Font("Dialog", Font.BOLD, 25));
		
		//���� Label ���·� ���
		fill_lbl = new JLabel();
		fill_lbl.setOpaque(true);
		fill_lbl.setBackground(Color.blue);
		
		//��ư ����
		for (int i = 0; i < jbtn.length; i++){
			jbtn[i] = new JButton(jbtn_name[i]);
			jbtn[i].addActionListener(listener);
		}
		
		//��ġ �� ũ�� ����
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
	
	//�����û
	class reservation extends JPanel{
		private String member;
		private JLabel title_lbl, car_lbl;
		private JComboBox num_txt, car_txt, year_txt, month_txt, day_txt;
		private JButton view_btn, main_btn;
		private Object[][] temp;
		private String[] temp_str;
		private Calendar now = Calendar.getInstance(); //���� ��¥
		private int year = now.get(Calendar.YEAR), month = now.get(Calendar.MONTH), last_day;
		
		public reservation(String id){
			member = id; //�α��� ���� �޾ƿ���
			
			//ũ�� ����
			setSize(Main.size.width, Main.size.height - 180);
			
			//���� ����
			title_lbl = new JLabel("����������ȸ �� �����ϱ�");
			title_lbl.setFont(new Font("Dialog", Font.BOLD, 23));
			
			//JLabel ����
			car_lbl = new JLabel("�������� :");
			
			//JCheckBox ����
			temp = use_sql.select_data("select bNumber from TBL_Bus");
			temp_str = new String[temp.length];
			for (int i = 0; i < temp_str.length; i++){
				temp_str[i] = temp[i][0].toString();
			}
			num_txt = new JComboBox<String>(temp_str);
			temp_str = new String[2];
			temp_str[0] = "1ȣ��";
			temp_str[1] = "2ȣ��";
			car_txt = new JComboBox<String>(temp_str);
			temp_str = new String[1];
			temp_str[0] = year + "��";
			year_txt = new JComboBox<String>(temp_str);
			if (month == 10){
				temp_str = new String[3];
			} else if (month == 11){
				temp_str = new String[2];
			} else{
				temp_str = new String[4];
			}
			temp_str[0] = "==�� ����==";
			for (int i = 1; i < temp_str.length; i++){
				if (month + i > 12){
					continue;
				} else if (month + i < 10){
					temp_str[i] = "0" + (month + i) + "��";
				} else{
					temp_str[i] = (month + i) + "��";
				}
			}
			month_txt = new JComboBox<String>(temp_str);
			temp_str = new String[1];
			temp_str[0] = "==�� ����==";
			day_txt = new JComboBox<String>(temp_str);
			
			//JButton ����
			view_btn = new JButton("�¼���ȸ");
			main_btn = new JButton("��������");
			
			//���� �ٲ� ������ �� ���� ���ڰ� Ʋ������
			month_txt.addActionListener(listener);
			
			//��� ����
			view_btn.addActionListener(listener);
			main_btn.addActionListener(listener);
			
			//��ġ �� ũ�� ����
			title_lbl.setBounds(5, 0, 300, 30);
			car_lbl.setBounds(15, 50, 60, 20);
			num_txt.setBounds(85, 45, 60, 28);
			car_txt.setBounds(155, 45, 60, 28);
			year_txt.setBounds(225, 45, 70, 28);
			month_txt.setBounds(305, 45, 100, 28);
			day_txt.setBounds(415, 45, 100, 28);
			view_btn.setBounds(525, 45, 100, 28);
			main_btn.setBounds(635, 45, 100, 28);
			
			//JPanel�� ��� �߰�
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
					if (month_txt.getSelectedItem().toString() != "==�� ����=="){
						String change = month_txt.getSelectedItem().toString().replace("��", "");
						now.set(Calendar.MONTH, Integer.parseInt(change) - 1);
						last_day = now.getActualMaximum(Calendar.DAY_OF_MONTH);
						temp_str = new String[last_day + 1];
						temp_str[0] = "==�� ����==";
						for (int i = 1; i < temp_str.length; i++){
							if (i < 10){
								temp_str[i] = "0" + i + "��";
							} else{
								temp_str[i] = i + "��";
							}
						}
					} else{
						temp_str = new String[1];
						temp_str[0] = "==�� ����==";
					}
					remove(day_txt);
					repaint();
					day_txt = new JComboBox<String>(temp_str);
					day_txt.setBounds(415, 45, 100, 28);
					add(day_txt);
				} else if (obj == view_btn){
					if (month_txt.getSelectedItem().toString() == "==�� ����==" || day_txt.getSelectedItem().toString() == "==�� ����=="){
						JOptionPane.showMessageDialog(null, "�� �Ǵ� ���� �����Ͽ� �ֽʽÿ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
					} else{
						String temp_month = month_txt.getSelectedItem().toString().replace("��", "");
						String temp_day = day_txt.getSelectedItem().toString().replace("��", "");
						JOptionPane.showMessageDialog(null, "������ ���۵˴ϴ�.", "�� ������ �޽���", JOptionPane.WARNING_MESSAGE);
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
