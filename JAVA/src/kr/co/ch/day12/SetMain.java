package kr.co.ch.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set : 순서 (X), 중복허용(x) 탐색 속도 위해
 * -HashSet
 * -TreeSet
 * 
 */
public class SetMain {

	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>(); 트리구조니까 오름차순으로 정리 사전순 
		// 원래 트리구조 하나의 부모(노드)가 레프트(노드) 라이트(노드)가 있고 다시 그 두노드가 부모가 됨
		// 부모가 10이고 5, 25 들어오면 왼쪽에 5 오른쪽에 25
		// 3 14 들어오면 5 왼쪽에 3 25 왼쪽에 14
		// 4들어오면 3의 오른쪽 
		System.out.println("입력전 set의 데이터 갯수 : " + set.size());
		System.out.println("\"one\" 데이터 삽입 성공 여부 : " + set.add("one"));
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one");		
		System.out.println("\"one\" 데이터 삽입 성공 여부 : " + set.add("one"));
		System.out.println("입력후 set의 데이터 갯수 : " + set.size());
		
		/*
		 * set의 전체 데이더를 출력 방식
		 * 1. 1.5버전의 for문 출력
		 * 2. Iterator객체를 이용 순환자객채 
		 * 순환자 객체 2가지 방법-이니멀레이션-옛방식?이터레터 2호선처럼 데이터가 있으면 접급하면서 List도 있음 
		 * 3. toArray() 메소드
		 */

		System.out.println("<1.5버전의 for문을 이요한 출력>");
		for(String str : set) {
			System.out.println(str);
			//Hash값을 이용해서 출력 빠르게 하기위해 입력한 순서도 보장하지 않음
		}
		/*
		 * Wrapper Class 기본자료형을 참조 자료형으로
		 * List<Integer> list = new ArrayList<Integer>();
		 * list.add(1);
		 * 
		 */
		
		/*
		 * Iterator 주요 메소드
		 * hasNext() : 접근할 다음 데이터의 존재여부판단 (boolean) 그다음 데이터가 있니?
		 * next() :  다음데이터로 이동
 		 */
		
		System.out.println("<Iterator 객체를 이용한 출력 > ");
		Iterator<String> ite = set.iterator();
		
		while(ite.hasNext()) {
		System.out.println(ite.next());
		}
		
		System.out.println("<toArray()메소드를 이용한 출력>");
		Object[] objArr = set.toArray();
		for(int i = 0; i < objArr.length; i++) {
			String str = (String)objArr[i];
		}
	}
}
