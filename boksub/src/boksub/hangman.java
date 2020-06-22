package boksub;

import java.util.Scanner;

public class hangman {

	public static void main(String[] args) {

		String[] dic = { "apple", "banana", "cycle", "dot", "easy" };
		double ran = (Math.floor(Math.random() * dic.length));
		// System.out.println(ran);
		String word = dic[(int) ran];
		// System.out.println(word);
		String[] process = new String[word.length()];
		for (int i = 0; i < process.length; i++) {
			process[i] = "*";
		}

		System.out.println(word);
		System.out.println("게임을 시작합니다");

		int cnt = 5;
		int check = 0;
		Scanner sc = new Scanner(System.in);

		while (cnt > 0) {
			check = 0;
			System.out.println("A - Z중 하나를 입력 하세요");
			String input = sc.nextLine();
			for (int i = 0; i < process.length; i++) {
				if (word.charAt(i) == input.charAt(0)) {
					process[i] = input;
					++check;
				}
			}
			if (check == 0) {
				System.out.println("입력한 문자가 단어에 없습니다.");
				--cnt;
			} else {
				for (int i = 0; i < process.length; i++) {
					System.out.print(process[i]);
				}
			}
			System.out.println("정답을 아시겠습니까? y/n");
			String q = sc.nextLine();
			if (q.charAt(0) == 'y') {
				System.out.println("유추하는 단어 입력");
				String answer = sc.nextLine();
				if (answer.equals(word)) {
					System.out.println("정답입니다. 축하합니다.");
					break;
				} else {
					System.out.println("오답입니다. 남은 기회는  " + cnt + " 입니다.");
				}
			} else if (q.charAt(0) == 'n') {
				System.out.println("남은 기회는  " + cnt + " 입니다.");
			} 
		}
	}
}

