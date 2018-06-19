package cho1;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		int input = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("정수를 입력하세요.(0:종료)> ");
			input = scanner.nextInt();
			
			if(input > 0) {
				System.out.println("positive integer");
			}else if(input <0) {
				System.out.println("negative number");
			}
			}while(input!=0);
		}
	
}
		

