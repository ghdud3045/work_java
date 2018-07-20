package ch06;

public class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(coconcarenate("", "100", "200","300"));
		System.out.println(coconcarenate("-", strArr));
		System.out.println(coconcarenate(",", new String[] {"1", "2", "3"}));
		System.out.println("[" + coconcarenate(",", new String[0] + "]"));
		System.out.println("[" + coconcarenate(",", "]"));
		
		System.out.printf("%2d %s", 100, "Hello");
		}
	
	static String coconcarenate(String deLim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + deLim;
		}
		return result;
	}
}
