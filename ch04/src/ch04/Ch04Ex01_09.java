package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int num = Integer.parseInt(numbers[0]);
		int num1 = Integer.parseInt(numbers[1]);
		int num2= Integer.parseInt(numbers[2]);
		 int small = num;
		 
		 if(num1<small)
			 small=num1;
		 if(num2<small)
			 small=num2;
		 System.out.println(small);
	}

}
