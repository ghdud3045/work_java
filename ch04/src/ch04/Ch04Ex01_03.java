package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
		// 1. 정수 1개 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");

		int num = Integer.parseInt(numbers[0]);

		if (num>20) {
			System.out.println("adult");


		}else {
			int b = 20-num;
			System.out.print(b);
			System.out.println(" years later");
		}

	}
}
