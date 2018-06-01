package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		
		double a = (double)num;
		double b = a / num1;
		System.out.printf("%d %.2f", num / num1, b);

}
}







