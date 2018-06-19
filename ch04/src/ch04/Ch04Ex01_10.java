package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int num = Integer.parseInt(numbers[0]);
		int num1 = Integer.parseInt(numbers[1]);
		
		if (num<num1) {
			System.out.println(num1 - num);	
		}else if(num1<num) {
			System.out.println(num - num1);
		}
	}
}
