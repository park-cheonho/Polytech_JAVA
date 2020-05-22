package kr.co.kopo.day13;
/*
import java.util.HashMap;
import java.util.Map;

class Member1 {
	   private String name;
	   private String phone;
	   
	   public Member1(String name, String phone) {
	      this.name = name;
	      this.phone = phone;
	   }

	   @Override
	   public int hashCode() {
	      final int prime = 31;
	      int result = 1;
	      result = prime * result + ((name == null) ? 0 : name.hashCode());
	      result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	      return result;
	   }

	   @Override
	   public boolean equals(Object obj) {
	      
	      if (this == obj) return true;
	      
	      if (obj == null) return false;
	      
	      if (getClass() != obj.getClass())
	         return false;
	      
	      Member other = (Member) obj;
	      
	      if (name == null) {
	         if (other.name != null)
	            return false;
	      } 
	      else if (!name.equals(other.name))
	         return false;
	      
	      if (phone == null) {
	         if (other.phone != null)
	            return false;
	      } 
	      else if (!phone.equals(other.phone))
	         return false;
	      
	      return true;
	   }

	   @Override
	   public String toString() {
	      return "Member [name=" + name + ", phone=" + phone + "]";
	   }

	   
	   
	   /*
	   @Override
	   public boolean equals(Object obj) {
	      
	      Member m = (Member)obj;
	      return this.name.equals(m.name) && this.phone.equals(m.phone);
	   }

	   @Override
	   public int hashCode() {

	      return this.name.hashCode() + this.phone.hashCode();
	   }   
	   */
	   
	   
	/*

class Car {
	private String name;
	private String id;
	
	public Car(String name, String id) {
		this.name = name;
		this.id = id;
	}
}


public class MapAMin02 {

	public static void main(String[] args) {
		
		Map<Member, Car> list = new HashMap<>();
		/*
		list.put(new Member("홍길동", "010-1111-2222"), new Car("그랜져", "34거1456"));
		list.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "56나1446"));
		
		list.put(new Member("홍길동", "010-3333-4444"), new Car("제네시스", "97여7890"));
// 홍길동을 왜 중복으로 잡지 못하나 ?
		System.out.println("등록된차량 : " + list.size() + "개");
	
		*/
		/*
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		System.out.println("m == m2 : " + (m == m2)); 
		System.out.println("equals() : " + m.equals(m2));
		
		String str = "Hello world";
		String str2 = new String("Hello world");
		
		System.out.println("str = str2 : " + str ==str2);
		System.out.println("str = equals : " + str.contentEquals(str2));
		 System.out.println("str hashcode()" + str.hashCode());
	      System.out.println("str2 hashcode()" + str2.hashCode());
		
		
		//System.out.println("m == m2 : " + (m == m2)); - 주소의 값을 비교하는코드 하지만 원하지 않음 값을 비교하는 equals
		System.out.println("equals() : " + m.equals(m2)); //멤버에는 equals라는 메소드가 없음에도 불구하고 오브젝트에 equals가 있어서 사용가능
		// 이것도 주소값 연결 -< 멤버에서로 오버라이딩
		
		
		//System.out.println(m.name.equals(m2.name) && m.phone.equals(m2.phone));
	
	      
//      System.out.println(m.name.equals(m2.name) && 
//            m.phone.equals(m2.phone));

   }
}
*/

