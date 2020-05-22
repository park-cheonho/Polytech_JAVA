package kr.co.kopo.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Member {
	   private String id;
	   private String pwd;
	   
	   public Member(String id, String pwd) {
	      this.id = id;
	      this.pwd = pwd;
	   }
/*
 * List
 * 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리하다.
 * ArrayList, LinkedList
 * List 자료형 = 인터페이스
 * add add 라는 메소드를 이용하여
 * get ArrayList의 get 메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.
 * size size 메소드는 ArrayList의 갯수를 리턴한다.
 * remove 메소드에는 2개의 방식이 있다. (이름은 같지만 입력파라미터가 다르다) remove(객체), remove(인덱스)
 * contains 메소드는 리스트 안에 항목값이 있는지를 판별하여 그 결과를 boolean으로 리턴한다.
 * 
 * 
 * 
 * 
 */

public class ListMember {

	public void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			List<Member> member = new ArrayList<>();
			
			member.add(new Member("aaa", "1111"));
			member.add(new Member("bbb", "2222"));
			member.add(new Member("ccc", "3333"));
			member.add(new Member("ddd", "4444"));
			
			System.out.println("pwd 변경");
			System.out.println("변경항 id 입력");
			String id = sc.nextLine();
			
			if(!member.contains(id) ) {
				System.out.println("check your " +  id );
				System.out.println("bye!");
				System.exit(0);			
			}
			
			System.out.println("Please enter your current password : ");
			String pwd = sc.nextLine();
			
			// equals 
			//객체.equals(상수) 객체는 null이 있음
			//상수.equals(객체) 권장 에러방지 상수는 null이 아니니까
			if(member.get(0).equals(pwd)) {
				System.out.println("check your " + pwd);
				System.out.println("get out of here");
				System.exit(0);	
			}
			
			System.out.println("right your new pwd :");
			String newPwd = sc.nextLine();
			member.add(new Member(id, newPwd));
			System.out.println("new pwd !");
			
			System.out.println("top confidential all user list");
			
			
			
}
}
}