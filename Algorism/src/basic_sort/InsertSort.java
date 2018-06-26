package basic_sort;

import java.util.Random;

public class InsertSort {
public int[] array;
	
	public InsertSort() {
		array=new int [500];
		Random random = new Random();
		
		for(int i=0;i<500;i++) array[i]=random.nextInt(300); //0부터 299까지 500개의 값을 랜덤 입력
	}
	
	private void Random_value(){ 
		Random random = new Random();

		for(int i=0;i<500;i++) array[i]=random.nextInt(300); //0부터 299까지 500개의 값을 랜덤 입력
	}
	
	private void sort() {
		for(int i=2;i<500;i++) {
			int temp=array[i];
			int index=i-1;
			while((index>=0) && array[index]>temp) {
				array[index+1]=array[index];
				index -= 1;		
			}
			array[index+1]=temp;
		}	
	}
	
	private void print_array() {
		for(int i=0;i<500;i++) System.out.print(array[i] + "\n" );
	}
	
	public static void main(String[] args) {
		InsertSort 객체 = new InsertSort();
		
		객체.Random_value();
		객체.sort();
		객체.print_array();
	}
}
