package ch03;

public class Exercise3_9 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (ch != 'a' && ch != 'A' || ch == '1' && ch =='2');
		System.out.println(b);
}
}