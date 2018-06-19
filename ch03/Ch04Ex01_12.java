package cho1;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		if (num % 4 == 0 && num % 100 != 0) {
			System.out.println("leap year");
			if(num % 400 == 0)
				System.out.println("leap year");
			}else {
				System.out.println("common year");
			}
		}
	}

