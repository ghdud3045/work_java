package cho1;

import java.util.Scanner;

public class 막해보기용 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		
		for(int i = tmp.length- 1; i >=0; i--) {
			System.out.println(tmp[i] + " ");
			
		}
	}
}