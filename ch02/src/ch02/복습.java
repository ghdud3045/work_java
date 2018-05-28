package ch02;

import java.util.Scanner;

public class 복습{

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
    	String input = scanner.nextLine();
    	int num = Integer.parseInt(input);
    	
    	System.out.println("�Է³��� : "+ input);
    	
    	System.out.printf("num=%d%n", num);
    	System.out.printf("num=%o%n", num);
    	System.out.printf("num=%x%n", num);
    	
    }
	
}
