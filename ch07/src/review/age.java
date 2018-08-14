package review;

import java.util.Arrays;

public class age {

	String[] str(int a, int b) {
		String[] bigFirst = new String[2];
		if(a < b) {
			bigFirst[0] = b + "";
			bigFirst[1] = a +"";

		}else if(a > b) {
			bigFirst[0] = a + "";
			bigFirst[1] = b + "";
		}
		return bigFirst;
	}


	public static void main(String[] args) {
		age a = new age();
		System.out.println(Arrays.toString(a.str(1000, 10000)));
	}
}

