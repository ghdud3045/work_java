package ch02;
import java.util.*;
public class Ch02Ex02_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
       
		String input = scanner .nextLine();
        String input2 = scanner .nextLine();
        String input3 = scanner .nextLine();
        String input4= scanner .nextLine();
        
        int num = Integer.parseInt(input);
        int num2 = Integer.parseInt(input2);
        int num3 = Integer.parseInt(input3);
        int num4 = Integer.parseInt(input4);
        
        System.out.printf("%d - %d = %d%n", num, num2, num - num2);
        System.out.printf("%d - %d = %d", num3, num4, num3 - num4);
        
        //2.3번 응용
        
        //1. Scanner 객체 생성 (System.in은 키보드)
        //Scanner scanner = new Scanner (System.in);
        
        //2. 정수 2개를 문자열로 입력받기
        //String strNum1 = scanner.nextLine();
        //String strNum2 = scanner.nextLine();
        
        //3. 입력받은 정수 2개를 정수(int)형으로 변경하기
        // int num1 = Integer.parseInt(strNum1);
        // int num2 = Integer.parseInt(strNum2);
       
        //4. 정수형으로 변경한 두변수 num1과 num2를 이용하여 계산
        //int result = num1 -num2;
        
        //5. num1, num2 result를 출력
        // System.out.printf("%d - %d = %d", num1, num2, result);
        
}
}