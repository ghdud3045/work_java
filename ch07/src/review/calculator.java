package review;

public class calculator {

	int subtract(int a, int b) {
		return a - b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		
		calculator a2 = new calculator();
		
		int q  = a2.subtract(100, 50);
		int w  = a2.multiply(10, 10);
		int e  = a2.division(50, 5);
		
		System.out.println(q +", " +  w + ", " +  e);
		
		
	}

}

