package practice;

public class practice01 {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		int z=(++x)+(y--);
		System.out.println(z);
		
		int score= 85;
		String result = (!(score>90))? "가":"나";
	System.out.println(result);

	}
}
/*
2020.04.28 과제

1. 로또게임
게임수를 입력하세요 : 3
게임1 : [2,6,13,25,20,7]
게임2 : [2,9,3,7,38,13]
게임3 : [40,10,38,39,42,18]

알고리즘 4개이상.... 같은 메소드 안에 계속 바뀌게?
중복되지 않는 숫자가 나오지 않는 방법

LottoMain

LottoView


2. 자료구조 이해
STACK, QUEUE 공부
List<String>을 이용하여 STACK, QUEUE 방식으로 동작하는 클래스,프로그램 각각 작성
하나로도 만들수 있는데
<STACK>
데이터입력
데이터삭제
전체데이터 출력 [0] ~ [size()-1]
종료

<QUEUE>
데이터입력
데이터삭제
전체데이터 출력
종료
-------------------
혹은 합쳐서
STACK데이터입력
STACK데이터삭제
QUEUE데이터입력
QUEUE데이터삭제


3. 게시판 관리 프로그램 (배열로 작성) 콜랙션 안쓰고 객체지향적으론
1.전체게시물조회
2.글번호조회
3.글등록
4.글수정
5.글삭제
0.종료
메뉴 중 처리할 항목을 선택하세요 : 3
등록할 제목을 입력 : 하하하...
등록할 글쓴이를 입력 : 닌자
게시글이 등록 되었습니다.
1.전체게시물조회
2.글번호조회
3.글등록
4.글수정
5.글삭제
0.종료
메뉴 중 처리할 항목을 선택하세요 : 1
<전체 게시글 조회 >
번호 제목 글쓴이 등록일
1 하하하 닌자  2020-04-28
메뉴 중 처리할 항목을 선택하세요 : 0

교수님 그럼 혹시 tree구조가 어느정도 입력순의 index는 아니지만 자신 나름대로 체계가 있는건데 

*/
