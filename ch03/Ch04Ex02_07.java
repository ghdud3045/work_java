package cho1;

import java.util.Scanner;

public class Ch04Ex02_07 {
	public static void main(String[] args) {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		
		while(i < num) {
			i++;
			System.out.print(i);
			System.out.printf("%1c", ' ');
		}
	}
}
