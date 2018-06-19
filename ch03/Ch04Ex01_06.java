package cho1;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		String gender = numbers[0];
		int num = Integer.parseInt(numbers[1]);

		if (gender.equals("M") && num >= 18) {
			System.out.println("MAN");
		}else if(gender.equals("F") && num >= 18) {
			System.out.println("WOMAN");
		}else if(gender.equals("M") && num <= 18) {
			System.out.println("BOY");
		}else if(gender.equals("F") && num <= 18) {
			System.out.println("GIRL");
		}
	}
}
