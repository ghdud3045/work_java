package cho1;

import java.util.Scanner;

public class 막해보기용 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");

		for(int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);

			if(!(1 <= num && num < 10000)) {
				return;
			}
		}
		int min = 100;
		int max = 100;

		for(int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			if(num < 100) {
				if(max ==100) {
					max = num;
				}else {
					max = max > num ? max : num;
			}
		}
		else {
			if(min ==100) {
				min = num;
			}
			min = min < num ? min : num;
		}
	}
		System.out.print(max+ " " + min);
}
}