package ch02;
import java.util.*;
public class Ch02Ex02_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
        String input = scanner .nextLine();
        String input2 = scanner .nextLine();
        
        int num = Integer.parseInt(input);
        int num2 = Integer.parseInt(input2);
        
        System.out.printf("%s%n", num);
        System.out.printf("%s", num2);
        
        //2.2번 문제 응용
        
        //1. Scanner 객체 생성(System.in은 키보드)
        //Scanner scanner = new Scanner (System.in);
        
        //2. 정수 2개를 문자열로 입력받기(nextLine() 두번 호출)
        //String strNum1 = scanner .nextLine();
        //String steNum2 = scanner .nextLine();
        
        //3. 입력받은 문자열 2개를 정수(int)형으로 변경
        //int strNum1 = Integer.parseInt(strNum1);
        //int steNum2 = Integer.parseInt(steNum2);
        
        // 4. 변수 num1과 num2를 각각 한줄씩 출력
        		//System.out.printf("%d%n", num1);
        		//System.out.printf("%d%n", num2);
        
        
}
}