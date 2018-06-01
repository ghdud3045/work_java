package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String input = scanner.nextLine();
	String input1 = scanner.nextLine();
	String input2 = scanner.nextLine();
	
	double num = Double.parseDouble(input);
	double num1 = Double.parseDouble(input1);
	double num2 = Double.parseDouble(input2);
	
	int a = (int)num;
	int b = (int)num1;
	int c = (int)num2;
	int d = (int)((num + num1 +num2) /3);
	
	System.out.printf("sum %d%n", a + b + c);
	System.out.printf("avg %d", d);
	
	
}
}
