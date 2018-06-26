package basic_sort;

import java.util.Random;

public class BubbleSort {
	public int[] array;
	
	public BubbleSort() {
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
			for(int j=1;j<500-i;j++) {
				if(array[j-1]>array[j]) { 
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}	
	}
	
	private void print_array() {
		for(int i=0;i<500;i++) System.out.print(array[i] + "\n" );
		
	}
	
	public static void main(String[] args) {
		BubbleSort 객체 = new BubbleSort();
		
		객체.Random_value();
		객체.sort();
		객체.print_array();
	}
}
