package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		
		int width = num+5;
		int length = num1*2;
		int area = width * length;
		System.out.printf(" width = %d%n length = %d%n area = %d", width, length, area);

	}
}
