package review;

public class File {

	String name(String name) {
		return name;
	}
	
	public static void main(String[] args) {
		File f1 = new File();
		
		String name = f1.name("호영");
		
		System.out.println(name);
		
		
	}
}
