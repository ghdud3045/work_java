package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명(객체 3개) 만들기
		Person a; Person b; Person c;
		a = new Person(); b = new Person(); c = new Person();
		//2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		//(자기 자신 포함해서 옆사람 정보 작성하기)
		a.number = 11; 				  b.number = 21;                 c.number = 31;
		a.name = "초콜릿";				  b.name = "과자";                 c.name = "음료";
		a.address =	"인천";					b.address = "부천";			c.address = "강남";
		// 3. Person 클래스에 만든 매서드를 각 사람(객체)마다 호출하세요.
		//for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		
		a.aboutme();
		b.aboutme();
		c.aboutme();
	}
}
