package Controller;

import java.util.Scanner;

public class GameFlow {
	QuizChoice qc = new QuizChoice();
	public int mode;
	int roomHint;
	Scanner scan = new Scanner(System.in);

	public void getMode(int mode) {
		switch (mode) { // 모드 선택에 따른 출력
		case 1:
			easyMode();
			break;
		case 2:
			nomalMode();
			break;
		case 3:
			hardMode();
			break;

		}

	}// switch

	public void easyMode() {

		System.out.println("이지모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작
		System.out.println("여기선 두 개의 힌트를 찾을 수가 있다네");
		
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 0; cnt < 2;) {
			System.out.println("[1]가구1 [2]가구2 [3]가구");
			roomHint = scan.nextInt();
			qc.Quiz(roomHint);// 스토리에 따른 퀴즈 나오고 게임 진행 메소드
			cnt++;
		}

		System.out.println("멘트"); //

		System.out.println("두번째 방");
		
		System.out.println("이 곳 역시 두 개의 힘트가 있으니 꼭 찾아서 탈출해보게");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		for (int cnt = 0; cnt < 2;) {
			System.out.println("[1]가구1 [2]가구2 [3]가구3");
			roomHint = scan.nextInt();
			qc.Quiz(roomHint); // 스토리에 따른 퀴즈 나오고 게임 진행 메소드
			cnt++;
		}
	}

	public void nomalMode() {
		System.out.println("노말모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구");
		roomHint = scan.nextInt();
		qc.Quiz(roomHint);
		System.out.println("멘트"); //

		System.out.println("두번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3");
		roomHint = scan.nextInt();
		qc.Quiz(roomHint);

		System.out.println("멘트");

		System.out.println("세번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4");
		roomHint = scan.nextInt();
		qc.Quiz(roomHint);

	}

	public void hardMode() {
		System.out.println("하드모드의 방에 온 걸 환영한다");
		System.out.println("그럼 시작하지..");

		System.out.println("첫번째 방"); // 처음 입장하는 방 화면 또는 맵
		// 게임 시작
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
		qc.Quiz(roomHint);

		System.out.println("멘트"); //

		System.out.println("두번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
		qc.Quiz(roomHint);

		System.out.println("멘트");

		System.out.println("세번째 방");
		System.out.println("+++++방 안에 가구들을 주의깊게 확인해봐요+++++");
		System.out.println("[1]가구1 [2]가구2 [3]가구3 [4]가구4 [5]가구5");
		roomHint = scan.nextInt();
		qc.Quiz(roomHint);

	}

}
