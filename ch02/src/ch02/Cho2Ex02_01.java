package ch02;
import java.util.*;

public class Cho2Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		        System.out.print("���ڸ� ������ �ϳ� �Է��� �ּ���.>");
				String input =  scanner.nextLine();
				String input2 =  scanner.nextLine();
				String input3 =  scanner.nextLine();

				int num = Integer.parseInt(input);
				int num2 = Integer.parseInt(input2);
				int num3 = Integer.parseInt(input3);
				
				int sum = num + num2 + num3;
				int avg = (num + num2 + num3)/3;
				
				System.out.printf("%s ",  "kor");
				System.out.printf("%d %n", num);
				System.out.printf("%s ", "mat");
				System.out.printf("%d %n", num2);
				System.out.printf("%s ", "eng");
				System.out.printf("%d %n", num3);
				System.out.printf("%s ", "sum");
				System.out.printf("%d %n", num + num2 + num3);
				System.out.printf("%s ", "avg");
				System.out.printf("%d %n", (num + num2 + num3)/3);
				
	}
	
}
