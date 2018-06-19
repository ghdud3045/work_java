package cho1;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Korea");
		System.out.println("2. USA");
		System.out.println("3. Japan");
		System.out.println("4. China");
		System.out.print("number? ");
		int num = Integer.parseInt(scanner.nextLine());
		while(true) {
			
			if(num==1) {
				System.out.println("Seoul");
				break;
			}else if(num==2) {
				System.out.println("Washinggton");
				break;
			}else if(num==3) {
				System.out.println("Tokyo");
				break;
			}else if(num==4) {
				System.out.println("Beijing");
				break;
			}else if(num >4) {
				System.out.println("none");
				break;
			}
			
		}
	}
}
