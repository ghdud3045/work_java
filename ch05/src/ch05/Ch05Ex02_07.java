package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		// 999가 나타나기 전까지 입력이 무한하므로 우선 크기 2인 배열 생성
		int[] stream = new int[2];
		
		
		int i = 0;


		while(true) {
		
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			
			if(i == stream.length) {
				int[] tmp = new int[stream.length* 2];
				System.arraycopy(stream ,  0 ,  tmp ,  0,	stream.length);
				stream = tmp;
		}
			
			
			stream[i] = num;
			
			
			if(stream[i] == 999) {
				break;
			}
			
			// stream 배열의 인덱스 번호 1 증가
			i++;
	}
		
		// 최소값과 최대값의 초기값은 입력받은 stream 배열의 첫번쨰 값으로 한다
		int min = stream[0];
		int max = stream[0];
		
		
		// stream 배열의 현재 인덱스 번호를 0으로 초기화
		i = 0;
		
		//stram 배열에서 꺼낸 정수가 999가 아닐 동안 계속 반
		while(stream[i] != 999) {
			min = min < stream[i] ? min : stream[i];
			max = max > stream[i] ? max : stream[i];
			i++;
		}
		
		//결과 출력
		System.out.println("max : " + max);
		System.out.println("min : " + min);
}
}