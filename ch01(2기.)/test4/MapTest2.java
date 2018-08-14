package test4;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("이름","임호영");
		map.put("나이", "18");
		map.put("주소","부천");

		String name = map.get("이름");
		String age = map.get("나이");
		String address = map.get("주소");
		System.out.println(name + "," + age + "," + address);

		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}
}
