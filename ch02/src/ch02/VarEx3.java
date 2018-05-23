package ch02;

public class VarEx3 {

	final static int MAX_SPEED = 10; // MAX_SPEED는 상수, 10은 리터럴
	final static int WIDTH = 20;
	final static int HEIGHT = 10;
	
	/*
	 * final이붙으면 앞으로 MAX_SPEED는
	 * 프로그램이 종료될 때까지 10으로 고정
	 */
	
	public static void main(String[] args) {
	  //MAX_SPEED = 20;
		System.out.println(MAX_SPEED); //상수 MAX_SPEED 값을 출력
	    
		int triangleArea = 10 * 2 / 2;
        System.out.println(triangleArea);
	}
}	
        
        
        