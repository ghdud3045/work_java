package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {
		// 1. 정수 한개 입력받기
		Scanner scanner = new Scanner(System.in);
		int num  =Integer.parseInt(scanner.nextLine());
		
		// 2. 틀 만들기
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 3.틀 만들기(감소하는 부분)
		for (int i = 1; i <= num - 1; i++) {
			for (int j =num - 1; j >= i; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}
