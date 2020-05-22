package kr.ac.kopo.day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List : 순서(O), 중복허용(O)
 *   - ArrayList
 *   - LinkedList
 */

public class ListMain {

	public static void main(String[] args) {
		
//		List list = new ArrayList();		// 기존방식(row type)
//		List<String> list = new ArrayList<String>();	// 1.5
		List<String> list = new ArrayList<>();			// 1.7
				
		System.out.println("입력 전 list 원소의 총 개수 : " + list.size() + "개" );
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("one");
		
		/*
		 * List의 전체데이터 출력 방식
		 * 1. index를 이용
		 * 2. 1.5버전의 for문 이용 
		 */
		
		System.out.println("입력 후 list 원소의 총 개수 : " + list.size() + "개" );
		
		System.out.println("< get(index)를 이용한 전체 출력 >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("< 1.5버전의 for문을 이용한 전체 출력 >");
		for(String str : list ) {
			System.out.println(str);
		}
		
		System.out.println("2번지에 위치한 데이터 : " + list.get(2));
		System.out.println("삭제된 데이터 :" + list.remove(2));
		System.out.println("삭제 후 2번지에 위치한 데이터 : " + list.get(2));
		
		System.out.println("\"one\" 데이터 삭제 : " + list.remove("one"));
		System.out.println("\"one\" 데이터 삭제 : " + list.remove("one"));
		System.out.println("\"one\" 데이터 삭제 : " + list.remove("one"));
		
		System.out.println("\"one\" 데이터 존재여부 : " + list.contains("one"));
		System.out.println("\"two\" 데이터 존재여부 : " + list.contains("two"));
		
		List<String> sub = new LinkedList<String>();
		sub.add("1");
		sub.add("2");
		sub.add("3");
		
		// list의 2번지에 "zero" 문자열 삽입
		list.add(2, "zero");
		
		System.out.println("< list 전체 데이터 출력 >");
		for(String str : list) {
			System.out.println(str);
		}
				
		System.out.println("< sub 전체 데이터 출력 >");
		for(String str : sub) {
			System.out.println(str);
		}
		
		list.addAll(sub);
		
		System.out.println("addAll() 후 list 전체 데이터 개수 : " + list.size() + "개");

		if(list.isEmpty()) {
			System.out.println("list가 비어있습니다");
		} else {
			System.out.println("list에 데이터가 하나이상 존재합니다");
		}
		
		list.clear();
		System.out.println("clear()...");
		
		if(list.isEmpty()) {
			System.out.println("list가 비어있습니다");
		} else {
			System.out.println("list에 데이터가 하나이상 존재합니다");
		}
	}
}




















