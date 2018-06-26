package basic_sort;

import java.util.Random;

public class SelectSort {
	public int[] array;
	
	public SelectSort() {
		array=new int [500];
		Random random = new Random();
		
		for(int i=0;i<500;i++) array[i]=random.nextInt(300); //0부터 299까지 500개의 값을 랜덤 입력
	}
	
	private void Random_value(){ 
		Random random = new Random();

		for(int i=0;i<500;i++) array[i]=random.nextInt(300); //0부터 299까지 500개의 값을 랜덤 입력
	}
	
	private void sort() {
		int temp;
		for(int i=0;i<500;i++) {
			
			int index=0;
			
			for(int j=0;j<500-i;j++) 
				if(array[index]<array[j]) index=j;
			
			temp=array[index];
			array[index]=array[500-i-1];
			array[500-i-1]=temp;
		}	
	}
	
	private void print_array() {
		for(int i=0;i<500;i++) System.out.print(array[i] + "\n" );
	}
	
	public static void main(String[] args) {
		SelectSort 객체 = new SelectSort();
		
		객체.Random_value();
		객체.sort();
		객체.print_array();
	}
}
