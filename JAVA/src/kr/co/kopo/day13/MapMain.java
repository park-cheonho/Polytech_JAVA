package kr.co.kopo.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map : key, value 쌍으로 이루오진 집합 (순서 x, key 중복 x) 
 * HashMap
 * TreeMap 
 * 
 * 
 */
/*
public class MapMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// key : id , value : pwd
		Map<String, String> map = new HashMap<>();
		
		
		//List<Member> member = new ArrayList<>();
		
		map.put("aaa", "11111");
		map.put("bbb", "22222");
		map.put("ccc", "33333");
		map.put("ddd", "44444");
		
		System.out.println("pwd 변경");
		System.out.println("변경항 id 입력");
		String id = sc.nextLine();
		
		if(!map.containsKey(id) ) {
			System.out.println("check your " +  id );
			System.out.println("bye");
			System.exit(0);			
		}
		
		System.out.println("now pwd input : ");
		String password = sc.nextLine();
		
		// equals 
		//객체.equals(상수) 객체는 null이 있음
		//상수.equals(객체) 권장 에러방지 상수는 null이 아니니까
		if(map.get(id).equals(password)) {
			System.out.println("check your " + password);
			System.out.println("get out of here");
			System.exit(0);	
		}
		
		System.out.println("right your new pwd :");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("new pwd !");
		
		System.out.println("all user list");
		

		// set 형태로 바뀐거를 가지고 활용 
		//map.entrySet()
		// key를 기준으로 set을 만들어 
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("id : " + key + ", pwd : " + map.get(key));
		}
		
		Set<Entry<String,String>> entry = map.entrySet();
		
		Iterator<Entry<String,String>> ite = entry.iterator();
		while(ite.hasNext()) {
			Entry<String, String> e = ite.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println("id :" + key + ", pwd : " + value);
		}
		for(Entry e : entry) {
			System.out.println("id : " + e.getKey() + " , pwd : " + e.getValue());
		}
		
	}
}

*/