package cho1;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		double d = 0;
		int count = 0;
		
		while(true) {
			int num = Integer.parseInt(scanner.nextLine());
			count++;
			sum += num;
			d = 0;
			d +=(float)sum / count;
			
			if(num >= 100) {
				
				System.out.println(sum);
				System.out.printf("%.1f", d);
				
				break;
			}
			
			
		}
		
	
		
		

		
	
		
		

}
}
