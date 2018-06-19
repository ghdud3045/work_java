package cho1;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int i = 0;
		int sum = 0;
		
		
		
		while(i < num) {
			i++;
			sum += i;
		
		}
		System.out.println(sum);
}
}