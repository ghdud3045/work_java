package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	 String input = scanner.nextLine();
	 String input1 = scanner.nextLine();
	 
	 double num = Double.parseDouble(input);
	 double num1 = Double.parseDouble(input1);
	 
	 double a = num * num1;
	 int b = (int)a;
	 int c = (int)num * (int)num1;
	 
	 System.out.printf("%d %d", b, c);
	}

}
