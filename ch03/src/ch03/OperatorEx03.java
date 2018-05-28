package ch03;

public class OperatorEx03 {
    
	public static void main(String[] args) {
		int i = 5, j = 5;
		
		System.out.println(i++);// 변수 i먼저 사용하기 때문에 5출력
		System.out.println(++j); // 1증가하고 변수 j사용하기 떄문에 6출력
		System.out.println("i = " + i + ", j = " + j);
		
	}
}
