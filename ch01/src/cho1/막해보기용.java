package cho1;

import java.util.Scanner;

public class 막해보기용 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] Arrs = scanner.nextLine().split(" ");
		
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < Arrs.length; i++) {
			if(i%2==0) {
				odd+=Integer.parseInt(Arrs[i]);
			}
		}
		for(int i = 0; i < Arrs.length; i++) {
			if(i%2!=0) {
				even+=Integer.parseInt(Arrs[i]);
}
}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}