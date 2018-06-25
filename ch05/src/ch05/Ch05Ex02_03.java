package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] Arrs = scanner.nextLine().split(" ");
		
		// 홀수번째 합과 짝수번째 합을 저장할 변수 선언 및 초기화
		int odd = 0;
		int even = 0;
		
		// Arrs 배열에서 값을 하나씩 꺼낸다
		for(int i = 0; i < Arrs.length; i++) {
			//만약 홀수번쨰 값이면
			if(i % 2 == 0) {
				//홀수번쨰 합을 저장하는 변수에 더하기
			odd += Integer.parseInt(Arrs[i]);
			}
		}
			for(int i = 0; i < Arrs.length; i++) {
				//만약짝수번쨰값이면
				if(i % 2 != 0) {
					//짝수번쨰 합을 저장하는 변수에 더하기
				even += Integer.parseInt(Arrs[i]);
				}
				
		}
			
			// 홀수번째와 짝수번째 각각의 합을 출력하기
				System.out.println("odd :" + odd);
				System.out.println("even : " + even);
			}
		}
	
	
	

