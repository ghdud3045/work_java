package ch02;
import java.util.*;
public class Ch02Ex02_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
       
		String input = scanner .nextLine();
        String input2 = scanner .nextLine();
        
        int num = Integer.parseInt(input);
        int num2 = Integer.parseInt(input2);
        
        System.out.printf("%d",  num);
        System.out.printf("%s%e", num2);
}
}