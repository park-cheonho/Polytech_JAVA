package kr.co.ch.day08.homework;

import java.util.Random;
import java.util.Scanner;

public class Area {
// 교수님께서 출제하신 의도가 이런 방식이 아니라 상속도 받고 맴버변수 private로 놓고 default생성자랑 this써서 생성자 만들고 메소드를 
// 출력하게 하는 방식일꺼 같다는 생각을 했는데... 아직 스스로 그런 코드를 만들지는 못하는것 같습니다.
// 우선 제출이라는 룰이 있으니 제출을 하고, 만약 교수님이 의도하신 방향이 위에 적은 방향이라면 조금 더 고민하겠습니다.
// 아직은 머리로는 뭔가 생각도 들고 그림도 그렸는데... 막상 손,코딩으로 표현이 안되네요 ㅠ 속상해요..ㅎㅎ
	public void question() {
		System.out.println("도형을 번호로 선택하세요. 1.직사각형 2.정사각형 3.삼각형 4.원");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		if (answer == 1) {
			rectangle();
		}
		if (answer == 2) {
			square();
		}if (answer == 3) {
			triangle();
		}if (answer == 4) {
			circle();
		}
	}
	
	public void rectangle() {	// 직사각형 넓이 메소드
		Random random = new Random();

		int n1 = random.nextInt(9) + 2; //주의 : 0~8+ 2 -> 2~10
		int n2 = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 두 수 : " + n1 + ", " + n2);
		System.out.print("가로 : " + n1 + ", 세로 : " + n2 + "의 직사각형 면적은 " + n1 * n2 + "입니다");
	}

	public void square() {	// 정사각형 넓이 메소드
		Random random = new Random();

		int n1 = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 수 : " + n1);
		System.out.print("가로 : " + n1 + "세로 : " + n1 + " 의 정사각형 면적은 " + n1 * n1 + "입니다");
	}

	public void triangle() {	// 삼각형 넓이 메소드
		Random random = new Random();

		int n1 = random.nextInt(9) + 2;
		int n2 = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 두 수 : " + n1 + ", " + n2);
		System.out.print("밑변 : " + n1 + ", 높이 : " + n2 + "의 삼각형 면적은 " + n1 * n2 / 2 + "입니다");
	}

	public void circle() {	// 원 넓이 메소드
		Random random = new Random();
		final double PI = 3.1415; 
		int n1 = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 두 수 : " + n1);
		System.out.print("반지름 : " + n1 + "의 원의 면적은 " + PI * n1 * n1 + "입니다");
	}
}
