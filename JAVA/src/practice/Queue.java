package practice;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	
	// arraylist로 queue 만들기
	private List<String> arrayList = new ArrayList<>();
	
	// queue에서 데이터를 넣는것 = enqueue / arraylist의 add / 
	public void enqueue (String data) {
		arrayList.add(data);
	}
	
	// queue에서 데이터를 뺴는것 = dequeue / arraylist의 remove / 먼저 넣은것부터 삭제 
	public String dequeue () {
		String str = null;
		if(!arrayList.isEmpty())
			str = arrayList.remove(0);
		return str;
	}
	
	public void print() {
		
		System.out.println("QUEUE\n");
		
		for(int i = arrayList.size()-1; i >=0; i--) {
			System.out.printf("  %3s  \n",arrayList.get(i));
			System.out.println("\n");
		}
	}

}
