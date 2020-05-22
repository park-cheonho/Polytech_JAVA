package kr.co.kopo.day13.homework;
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




class Member3 {
      private String id;
      private String pwd;
      
      public Member3(String id, String pwd) {
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


public class ListMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        List<Member3> member = new ArrayList<>();
             
        member.add(new Member3("aaa", "1111"));
        member.add(new Member3("bbb", "2222"));
        member.add(new Member3("ccc", "3333"));
        member.add(new Member3("ddd", "4444"));
        
        //System.out.println(member.get(1));
        System.out.println("Change your PWD");
        System.out.println("Insert your ID");
        String id = sc.nextLine();
        
        int idx=0;
		//while(i<member.size()) {
        for(int i = 0; i < member.size(); i++) {
        	
        	Member3 m = member.get(i);
        	String tempID = m.getId();
        	if(tempID.equals(id)) {
        		
        	}
        	if(member.get(i).getId().equals(id)) { 
        		
        		//.equals(id) = String class의 equals();
/*
 * 1. member.get()메소드를 통해서 Member클래스 반환
 * 2. 반환된 Member 클래스에서 getId() 메소드를 통해 String형 ID변수 반환
 * 3. 반환된 String형 변수의 equals()함수를 통해 문자열과 값 비교     		 
 -> 이렇게 이해하는게 맞을까요?
 */ 
 // for문으로 하고 싶었는데... for문은...왜 bbb에서 안될까요 ㅠㅠ 
        		
        		idx = i;
        		
        		System.out.println("Please enter your current PWD : ");
            	String pwd = sc.nextLine();
        		if((member.get(i).getPwd().equals(pwd))) {
        			System.out.println("Insert your new PWD :");
            		String newPwd = sc.nextLine();
            		member.get(i).setPwd(newPwd);
            		//set(new Member(id, newPwd));
            		System.out.println("New pwd Saved !");
            		break;
        		}else {
        			System.out.println("Check your " + pwd);
        			System.out.println("Sorry plz check your current PWD");
        			System.exit(0); 
        		}
        	}
        	//i++;
		}
		if(!(member.get(idx).getId().equals(id))) {
				System.out.println("Check your " +  id );
    			System.out.println("Bye!");
    			System.exit(0); 
		}
        
        System.out.println("Top confidential all user list");
        
        for(Member3 a : member) {
        	System.out.println(a.getId( )+ "," + a.getPwd());
        }        
	}

}
