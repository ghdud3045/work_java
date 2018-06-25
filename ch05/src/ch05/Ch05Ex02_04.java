package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		int[] numbers = new int[100];


		for (int i = 0; i < numbers.length; i++) {
			Scanner scanner = new Scanner(System.in);
			String Arrs = scanner.nextLine();

			numbers[i] = Integer.parseInt(Arrs);
		
				
			
			if (Integer.parseInt(Arrs)==-1) {
				System.out.print(numbers[i-3] + " ");
				System.out.print(numbers[i-2] + " ");
				System.out.println(numbers[i-1] + " ");
				break;
			}
		}
	}
}


