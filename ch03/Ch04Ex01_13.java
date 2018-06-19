package cho1;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		System.out.print("번호를 입력하세요.> ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		
		if(num==1) {
			System.out.println("dog");
		}else if(num==2) {
			System.out.println("cat");
		}else if(num==3) {
			 System.out.println("chick");
		}else {
			System.out.println("I don't know");
		}
			
	}
}
