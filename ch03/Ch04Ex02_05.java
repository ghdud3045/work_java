package cho1;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int num = Integer.parseInt(scanner.nextLine());
		
			if(num%3==0) {
				System.out.println(num / 3);
			}else if(num == -1) {
				System.out.println("");
				break;
			}
		}
	}
}
