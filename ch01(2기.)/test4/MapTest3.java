package test4;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest3 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> a = new ArrayList<HashMap<String,String>>();


		HashMap<String,String> a1 = new HashMap<String,String>();
		a1.put("동물이름", "강아지");
		a1.put("나이", "3살");
		a.add(a1);

		HashMap<String,String> a2 = new HashMap<String,String>();
		a2.put("동물이름", "판다");
		a2.put("나이", "5살");
		a.add(a2);

		HashMap<String,String> a3 = new HashMap<String,String>();
		a3.put("동물이름", "코끼리");
		a3.put("나이", "20살");
		a.add(a3);
		
		HashMap<String,String> a4 = new HashMap<String,String>();
		a4.put("동물이름", "오리너구리");
		a4.put("나이", "4살");
		a.add(a4);

		System.out.println(a);



	}
}