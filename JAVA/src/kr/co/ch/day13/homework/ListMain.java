package kr.co.ch.day13.homework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

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
 */




class Member {
      private String id;
      private String pwd;
      
      public Member(String id, String pwd) {
         this.id = id;
         this.pwd = pwd;
         
      }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
      
}


public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        List<Member> member = new ArrayList<>();
             
        member.add(new Member("aaa", "1111"));
        member.add(new Member("bbb", "2222"));
        member.add(new Member("ccc", "3333"));
        member.add(new Member("ddd", "4444"));
        
        System.out.println("Change your PWD");
        System.out.println("Insert your ID");
        String id = sc.nextLine();
        
        for(int i = 0; i < member.size(); i++) {
        	if(!(member.get(i).getId().equals(id))) { // 교수님....여기서 if(!(member.get(i).getId().equals(id)))가 잘 이해가 안가네요 ㅠㅠ
        		System.out.println("Check your " +  id );
        		System.out.println("Bye!");
        		System.exit(0);         
        	}else {     	
        	System.out.println("Please enter your current PWD : ");
        	String pwd = sc.nextLine();
        	// equals 
        	//객체.equals(상수) 객체는 null이 있음
        	//상수.equals(객체) 권장 에러방지 상수는 null이 아니니까
        	for(int j = 0; j < member.size(); j++) {
        		if (!member.get(j).getPwd().equals(pwd)) { // 교수님....여기서 if (!member.get(j).getPwd().equals(pwd)가 잘 이해가 안가네요 ㅠㅠ
        			System.out.println("Check your " + pwd);
        			System.out.println("Sorry plz check your current PWD");
        			System.exit(0); 
        		}else
        			System.out.println("Insert your new PWD :");
        		String newPwd = sc.nextLine();
        		member.get(j).setPwd(newPwd);
        		//set(new Member(id, newPwd));
        		System.out.println("New pwd !");
        		break;
        	}
        	break;
        	}
        }    
        System.out.println("Top confidential all user list");
        
        for(Member a : member) {
        	System.out.println(a.getId( )+ "," + a.getPwd());
        }
	
        
	}

}
