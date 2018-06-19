package cho1;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String numbers = scanner.nextLine();
		String gender = numbers;
		
		if(gender.equals("A")) {
			System.out.println("Excellent");
		}else if(gender.equals("B")) {
			System.out.println("Good");
		}else if(gender.equals("C")) {
			System.out.println("Usually");
		}else if(gender.equals("D")) {
			System.out.println("Effort");
		}else if(gender.equals("F")) {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}
	}
}
