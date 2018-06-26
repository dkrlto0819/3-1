package 객체;

import java.awt.Choice;
import java.awt.TextField;

public class 제어자{
	int[] 수입목록=new int[20];
	int[] 지출목록=new int[20];
	
	int 총수입=0, 총지출=0, 총잔액=0;
	public void 제어자(Choice[] 월목록, Choice[] 일목록, Choice[] 범주, TextField[] 내역, TextField[] 수입, TextField[] 지출, TextField[] 잔액, TextField[] 비고) {
		for(int i=0;i<5;i++) {
			if(Integer.parseInt(수입[i].getText())!=0) {
				System.out.println(수입[i].getText());
				수입목록[i]=Integer.valueOf(수입[i].getText());
				총수입+=수입목록[i];
				총잔액+=수입목록[i];
			}else if(Integer.parseInt(지출[i].getText())!=0) {
				System.out.println(2);
				지출목록[i]=Integer.parseInt(지출[i].getText());
				총지출+=지출목록[i];
				총잔액-=지출목록[i];
			}else {
				break;
			}
			잔액[i].setText(Integer.toString(총잔액));
		}
		
	}
	public void 주_제어자() {
		
	}
}
