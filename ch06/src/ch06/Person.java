package ch06;

public class Person {
	//속성(인스턴스 변수)
	// 1. 이름
	String name;
	// 2. 나이
	int number;
	// 3. 주소
	String address;
	
	// 행동(메서드)
	// 1. 자기소개
	// "저는 [나이]살 [주소]에 사는 [이름]입니다."
	
	void aboutme() {System.out.println("나이는 " + number + "이고" + "나이는 " + name + "이고" + "지역은 " + address + "입니다");
	
	}
}
