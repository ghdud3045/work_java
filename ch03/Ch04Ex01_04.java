package cho1;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		double num = Double.parseDouble(numbers[0]);
		
		if (num<50.80) {
			System.out.println("Flyweight");
		}else {
			if (num<61.23) {
				System.out.println("Lightweight");
			}else {
				if (num<72.57) {
					System.out.println("Middleweight");
				}else {
					if (num<88.45) {
						System.out.println("Cruiserweight");
					}else {
						if (num < 89.0) {
							System.out.println("Heavyweight");
						}
					}
				}
			}
		}
}
}