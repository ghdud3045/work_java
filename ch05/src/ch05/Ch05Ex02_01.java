package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] Arrs = scanner.nextLine().split(" ");

		
		// 입력받은 문자열들을 뱅ㄹ 뒤에서부터 출력
		for (int i = Arrs.length- 1; i >= 0; i--) {
			System.out.print(Arrs[i] + " ");
		}
	}
}