package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		
		System.out.printf("%b%n", num == num1);
		System.out.printf("%b", num != num1);
		
		
	}

}
