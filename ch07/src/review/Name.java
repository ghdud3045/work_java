package review;

public class Name {
	
	
	int getBiggest(int a,int b,int c) {
		if(a<c) {
			return c;
		}else if(a>c) {
			return a;
		}else if(b<a) {
			return a;
		}else
			return b;
		}
		
		
	public static void main(String[] args) {
		Name a = new Name();
		
		System.out.println(a.getBiggest(1, 2,2));
	}
}
	



