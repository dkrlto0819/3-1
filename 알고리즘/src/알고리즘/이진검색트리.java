package 알고리즘;

import java.util.Scanner;

public class 이진검색트리 {
	private int[] tree;
	static Scanner sc;

	이진검색트리(){
		sc=new Scanner(System.in);
		tree=new int[60];
	}
	
	public int treeInsert(int pointer, int key) {
		if(tree[pointer]==0) return pointer;
		else if(key<tree[pointer]) return treeInsert(pointer*2, key);
		else return treeInsert(pointer*2+1, key);
	}
	
	public int treeSearch(int pointer, int key, int count) {
		if(tree[pointer]==0) return 0;
		if(tree[pointer]==key) return count;
		else if(tree[pointer]>key) return treeSearch(pointer*2, key, count+1);
		else return treeSearch(pointer*2+1, key, count+1);
		
	}
	
	public void start() {
		int select=1;
		int point, count, key;
		
		while(select!=0) {
			System.out.print("삽입은 1번, 검색은 2번, 종료는 0번을 누르세요.");
			select=sc.nextInt();
			switch(select) {
				case 1:
					System.out.print("몇개의 값을 입력하고 싶은지 입력해주세요.");
					int num=sc.nextInt();
					System.out.print("넣고 싶은 값들을 입력하세요.");
					for(int i=0;i<num;i++) {
						key=sc.nextInt();
						point=treeInsert(1, key);
						tree[point]=key;
					}
					for(int i=1;i<60;i++) {
						if(tree[i]!=0) System.out.print(tree[i]+" ");
					}
					System.out.println("");
					break;
				case 2:
					System.out.print("찾고싶은 값을 입력하세요.");
					key=sc.nextInt();
					count=treeSearch(1, key, 1);
					if(count==0)
						System.out.println("찾는 자료값이 없습니다.");
					else
						System.out.printf("%d은 %d번만에 찾았습니다.\n", key, count);
					break;
				default:
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		이진검색트리 시작=new 이진검색트리();
		시작.start();
	}
}
