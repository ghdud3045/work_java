package review;

import java.util.ArrayList;

public class ArrayListEx {

	
	ArrayList<String> splitName(String name){
		ArrayList<String> splitName=new ArrayList<String>();//[]
		for(int i =0; i<name.length(); i++) {
			char s = name.charAt(i);
			splitName.add(Character.toString(s));

		}
		return splitName;
	}
	public static void main(String[] args) {

		ArrayListEx age = new ArrayListEx();
		System.out.println(age.splitName("google"));


	}


}

