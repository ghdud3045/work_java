package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명(객체 3개) 만들기
		//Person a; Person b; Person c;
		//a = new Person(); b = new Person(); c = new Person();
		//2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		//(자기 자신 포함해서 옆사람 정보 작성하기)
		Person[] persons = new Person[3];

		//[2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
		//값을 초기화 한 부분ㄴ이다
		//아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.
		//a.number = 11; 				  b.number = 21;                 c.number = 31;
		//a.name = "초콜릿";				  b.name = "과자";                 c.name = "음료";
		//a.address =	"인천";					b.address = "부천";			c.address = "강남";
		persons[0] = new Person("철수", 40, "서울");
		persons[1] = new Person("철수1", 401, "서울1");
		persons[2] = new Person("철수2", 402, "서울2");
		// 3. Person 클래스에 만든 매서드를 각 사람(객체)마다 호출하세요.
		//for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.

		//a.aboutme();
		//b.aboutme();
		//c.aboutme();

		for (int i = 0; i < persons.length; i++) {
			persons[i].introduce();
		}
		//[2-4] 2-3에서 생성한 생성자를 이용하여 "흥민"이라는 이름으로 사람 객체 하나를 생성하세요.
		Person a = new Person("흥민");
		//[2-5] 2-4 객체를 이용하여 introduve() 메서드를 호출하세요
		a.introduce();
	}
	
}
