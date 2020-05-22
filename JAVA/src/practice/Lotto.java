package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	private int randomNum;
	private boolean b;
	private int size = 0;
	
	Lotto(){}
	
	public void Lotto (int ipt) {
	}
	
	Random r = new Random();
	
	public void useList(int ipt) {
		System.out.println("List로 일확천금을!");
		for(int i = 1; i<=ipt; i++) {
			List<Integer> list = new ArrayList();
			
			while(size!=6) {
				randomNum=(r.nextInt(45)+1);
				b=list.contains(randomNum);
				if(b==false) {
					list.add(randomNum);
				}
				size = list.size();
			}
			System.out.printf("%d번째 게임 결과 : [",i);
			for (int a : list ) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			list.clear();
			size=0;
		}
		System.out.println("\n\n");
	}
	
	public void useTreeSet(int ipt) {
		System.out.println("TreeSet으로 인생역전을!");
		size = 0;
		for(int i = 1; i <= ipt; i++) {
			TreeSet<Integer> set = new TreeSet(); // set은 중복이 불가능함 집합의 개념으로 이해
			
			while(size!=6) {
				randomNum=(r.nextInt(45)+1);
				set.add(randomNum);
				size = set.size();
			}
			System.out.printf("%d번째 게임 결과 : [",i);
			for (int a : set ) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			set.clear();
			size=0;
		}
		System.out.println("\n\n");

	}
	public void useHashSet(int ipt) {
		System.out.println("HashSet을 배우면 인생이 바뀐다!");
		size = 0;
		for(int i = 1; i <= ipt; i++) {
			HashSet<Integer> set = new HashSet(); // set은 중복이 불가능함 집합의 개념으로 이해
			
			while(size!=6) {
				randomNum=(r.nextInt(45)+1);
				set.add(randomNum);
				size = set.size();
			}
			System.out.printf("%d번째 게임 결과 : [",i);
			for (int a : set ) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			set.clear();
			size=0;
		}
		System.out.println("\n\n");
	}
	public void useArr(int ipt) {
		System.out.println("마지막 Array로 1등 가즈아");
		size=0;
		for(int i =1 ; i<=ipt ;i++) {
			int[] intarr = new int[6];
			while(size!=6) {
				randomNum=(r.nextInt(45) +1);
				b=true;
				for (int y=0 ; y <size ; y++) { //중복제거 배열의 중복제거가 이해가 안되어서 다른분들꺼 참고 했습니다 .ㅠㅠ
					if(intarr[y]==randomNum) {        
						b=false;
					}
				}
				if (b==true) {
					intarr[size]=randomNum;
					size++;
				}
			}
			System.out.printf("%d번째 게임 결과 : [",i);
			for (int a : intarr) {
				System.out.printf(" %d ", a);
			}
			System.out.printf("]\n");
			size=0;
		}
		System.out.println("\n\n");
	}
}
	
	

