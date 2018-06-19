package cho1;
import java.util.*;
public class Ch04Ex01_02 {
	public static void main(String[] args) {
		// 1. 키와 몸무게를 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int height = Integer.parseInt(numbers[0]);
		int weight = Integer.parseInt(numbers[1]);
		
		// 2. 비만수치 공식을 이용해서 계산
		int Obesity = weight + 100 - height;
		
		// 3. 비만수치 출력
		System.out.println(Obesity);

		// 4. 비만이면(비만수치가 0보다 크면) "Obesity"
		if (Obesity > 0) {
			System.out.println("Obesity");
		}
		}



	}



