package practice;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	// arraylist로 stack 만들기
	private List<String> arrayList = new ArrayList<>();
	
	// stack에서 데이터를 넣는것 = push / arraylist의 add / 
	public void push(String data) {
		arrayList.add(data);
	}
	
	// stack에서 데이터를 빼는것 = pop / arraylist의 remove / 제일 나중에 넣은것부터
	public String pop() {
		String str = null;
		if(!arrayList.isEmpty()) 
			str = arrayList.remove(arrayList.size()-1);
		return str;
	}
	
	public void print() {
		
		System.out.println("STACK\n");
		
		for(int i = arrayList.size()-1; i >=0; i--) {
			System.out.printf("  %3s  \n",arrayList.get(i));
			System.out.println("\n");
		}
	}
	
}
