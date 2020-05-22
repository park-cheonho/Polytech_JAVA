package kr.co.ch.day06.homework;

import java.util.Scanner;

/*
 * 어제 과 제 아 이 스 크 림 구 하 는 코 드 에 메 소 드 를 추 가 해서 작 성 해 보 세요
 * 과제를 정확하게 이해했는지 걱정입니다..ㅠ 빨리 코로나가 끝나고 대면수업을 하고 싶네요 ㅠㅠ 
 * 조금 막막하네요 ㅠ
 */
public class Icecream {
	
	String productName; // 상품 이름
	String productPrice; // 상품 가격

	/**
	 * 아이스크림 구매 정보 반환 메소드
	 * @param EA
	 */
	// 지난 아아스크림 과제는 메소드를 만드는 것이 아니라 IcecreamMain에서 값을 입력 받을때 Icecream의 멤버변수를 참조하여 저장?
	// 지금 과제는 Icecream에 info라는 메소드를 만들어서 IcecreamMain라는 클래스 외부에서 메소드 호출하기
	// 이렇게 하면 어떤 부분이 좋아지는지는 아직 감이 안옵니다.
	void info(int EA) {
		Scanner sc = new Scanner(System.in);
		
		Icecream[] str = new Icecream[EA]; //str배열을 만들기 입력받은 EA개 크기로
		for(int i = 0; i < EA; i++) {
			str[i] = new Icecream();  //HomeworkIcecream 클래스 불러옴
		
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매 정보 ***");
			System.out.print("아이스크림 명 : "); 
			str[i].productName = sc.nextLine(); //아이스크림명 저장

			System.out.print("아이스크림 가격 : ");
			str[i].productPrice = sc.nextLine(); //아이스크림 가격 저장
			System.out.println();
		}
		System.out.println("< 총 " + EA + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t 아이스크림명\t 아이스크림가격\t");
		for(int i = 0; i < str.length; i++) {
			System.out.printf("%2d\t %5s\t\t %7s\t\n", (i+1), str[i].productName, str[i].productPrice);
		
		
	}
}
}

