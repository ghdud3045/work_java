package cho1;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		double num = Double.parseDouble(numbers[0]);
		double num1 = Double.parseDouble(numbers[1]);
		

			if (num > 4.0 && num1 >4.0) {
				System.out.println("A");
			}else if(num >3.0 && num1 >3.0) {
				System.out.println("B");
			}else if(num >2.0 && num1>2.0) {
				System.out.println("C");
			}
	}
}

			

	


