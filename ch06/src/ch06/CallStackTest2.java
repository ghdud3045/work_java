package ch06;

public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");
	}
	
	static void firstMethod() {
		System.out.println("forstMethod()이 시작되었음.");
		seconMethod();
		System.out.println("firseMethod()이 끝났음.");
		
	}
	static void seconMethod() {
		System.out.println("seconMethod()이 시작 되었음.");
		System.out.println("seconMethod()이 끝났음.");
	}
}
