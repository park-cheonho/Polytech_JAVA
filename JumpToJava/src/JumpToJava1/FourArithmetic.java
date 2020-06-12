package JumpToJava1;

import java.util.ArrayList;
import java.util.HashMap;

public class FourArithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a*b);
		//System.out.println(a/b);
		//System.out.println(a%b);
		
		int i = 0;
		int j = 10;
		//i++;
		//j--;
		
		//System.out.println(i);
		//System.out.println(j);
		
		//System.out.println(i++);
		//System.out.println(i);
	
	//	i++ : 값이 참조된 후에 증가
	//	++i : 값이 참조되기 전에 증가
	
		System.out.println(++i);
		System.out.println(i);
	
		int base = 180;
		int height = 185;
		boolean isTall = height > base;
		
		if(isTall) {
			System.out.println("키가 큽니다.");
		}
		
		int ii = 3;
		boolean isOdd = ii % 2 == 1;
		
		String aa = "Happy Java";
		String bb = "a";
		String cc = "123";
		
		String aaa = new String("Happy Java");
		
		//char 'a' = new char 'acb';
		
		String a1 = "Hello";
		String b1 = "java";
		String c1 = "Hello";
		
		System.out.println(a1.equals(b1));
		System.out.println(a1.equals(c1));
		
		String a2 = "hello";
		String b2 = new String("hello");
		System.out.println(a2.equals(b2));
		System.out.println(a2==b2);
		String a3 = "Hello Java";
		System.out.println(a3.indexOf("Java"));
		System.out.println(a3.replaceAll("Java", "World"));
		System.out.println(a3.substring(0,4)); //시작위치 <= a < 끝위치
		System.out.println(a3.toUpperCase());
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		System.out.println(sb.toString());
		/*
		 * ※ String 자료형은 한번 값이 생성되면 그 값을 변경할 수가 없다. 
		 * 이렇게 값을 변경할 수 없는 것을 immutable 하다고 한다. trim, toUpperCase 등의 메소드를 
		 * 보면 문자열이 변경되는 것 처럼 생각 될 수도 있겠지만 해당 메소드 수행 시 
		 * 또 다른 String 객체를 생성하여 리턴할 뿐이다. StringBuffer 는
		 *  이와 반대로 값을 변경할 수 있다(mutable 하다). 즉 한번 생성된 값을
		 *   언제든지 수정할 수 있다.
		 *   문자열 추가나 변경등의 작업이 많을 경우에는 StringBuffer를, 
		 *   문자열 변경 작업이 거의 없는 경우에는 그냥 String을 사용하는 것이 유리하다.
		 */
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("jump to java");
		sb1.insert(0, "hello ");
		System.out.println(sb1.toString());
		System.out.println(sb1.substring(0,4));
		
		String[] weeks = {"월","화","수","목","금","토","일"};
		String[] weeks1 = new String[7];
		weeks1[0] = "월";
		weeks1[1] = "화";
		weeks1[2] = "수";
		weeks1[3] = "목";
		
		String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks2[3]);
		
		String[] weeks3 = {"월", "화", "수", "목", "금", "토", "일"};
		for(int k = 0; k < weeks3.length; k++) {
			System.out.println(weeks3[k]);
		}
		
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		pitches.add(0,"133");
		
		System.out.println(pitches.get(1));
		System.out.println(pitches.size());
		System.out.println(pitches.contains("142"));
		System.out.println(pitches.remove("129"));
		System.out.println(pitches.remove(0));
		
		ArrayList<String> aList = new ArrayList<String>();
		// <String> 이라는 제네릭스 표현식은 "ArrayList 
		// 안에 담을 수 있는 자료형은 String 타입 뿐이다" 라는 것을 의미한다.
		// ※ 여기서는 제네릭스의 타입으로 String 자료형만을 예로 들었지만 
		// <Integer>, <Animal>, <Dog> 등 어떤 자료형도 사용할 수 있다.
		aList.add("hello");
		aList.add("java");
		
		String hello = aList.get(0);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.get("people"));
		System.out.println(map.containsKey("people"));
		System.out.println(map.remove("people"));
		System.out.println(map.size());
		
		boolean money = true;
		if (money) {
		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		}
		
		int meney1 = 2000;
		boolean hasCard = true;
		
		if (!(meney1 >= 3000) || !hasCard) {
			System.out.println("택시");
		} else {
			System.out.println("걸어");
		}
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		if (pocket.contains("money")) {
		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		}
		
		int treeHit = 0;
		while (treeHit < 10) {
		    treeHit++;
		    System.out.println("나무를  " + treeHit + "번 찍었습니다.");
		    if (treeHit == 10) {
		        System.out.println("나무 넘어갑니다.");
		    }
		}
		int coffee = 10;
		int money3 = 300;

		while (money3 > 0) {
		    System.out.println("돈을 받았으니 커피를 줍니다.");
		    coffee--;
		    System.out.println("남은 커피의 양은 " + coffee + "입니다.");
		    if (coffee == 0) {
		        System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
		        break;
		    }
		}
		for(int p=2; p<10; p++) {
			for(int o = 1; o<10; o++) {
				System.out.println(p*o+" ");
			}
			System.out.println("");
		}
		
		String[] numbers = {"one", "two", "three"};
		for(String iiiiii: numbers) {
		    System.out.println(iiiiii);
		}
		
		
		
		
	}
}
