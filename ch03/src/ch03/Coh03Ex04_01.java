package ch03;

public class Coh03Ex04_01 {

	public static void main(String[] args) {
		// 프로그램 실행 중에 1번 위치의 a값이 궁금할경우
		// 방법 1 : print 메소드를 이욯해 출력해본다
		// 방법 2: 디버깅 도구를 사용한다
		int a = 5;
		a += 10;
		a = a - 1; // 1번
		debugTest(a);
		System.err.printf("%d%n", a);
	}
	
	private static void debugTest(int b) {
		System.out.println(b + 10);
		/*
		 * break point : 중단점
		 * F5 : 메소드 내부 진입
		 * F6 : 현재 가리키고 있는 줄 실행
		 * F8 : 다음 break point로 이동
		 */
	}
}
