package ch03;

public class Exercise3_10 {
	public static void main(String[] args) {
		char ch = 'B';
		char lowerCase = (ch < 97) ? (char)(ch+32) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
}
}