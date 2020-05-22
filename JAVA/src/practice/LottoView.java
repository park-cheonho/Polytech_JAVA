package practice;

import java.util.Scanner;

public class LottoView {

		
		private int ipt;
		
		LottoView(){}
		
	
		public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임수를 입력하세요 : ");
		ipt = sc.nextInt();
		sc.nextLine();
		
		Lotto jackpot = new Lotto();
		
		jackpot.useList(ipt);
		jackpot.useTreeSet(ipt);
		jackpot.useHashSet(ipt);
		jackpot.useArr(ipt);
		
	}
}
/*
 * 1. 로또게임
게임수를 입력하세요 : 3
게임1 : [2,6,13,25,20,7]
게임2 : [2,9,3,7,38,13]
게임3 : [40,10,38,39,42,18]

알고리즘 4개이상.... 같은 메소드 안에 계속 바뀌게?
중복되지 않는 숫자가 나오지 않는 방법

LottoMain

LottoView
 */