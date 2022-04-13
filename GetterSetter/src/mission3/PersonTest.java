package mission3;

public class PersonTest {

	public static void main(String[] args) {
//		문제 : Person 클래스 작성하기
//		name = "이순신", height = 175, weight = 75
		Person Kim = new Person("이순신", 175, 75);
		
		System.out.println("Kim 이름 = " + Kim.name);
		System.out.println("Kim 키 = " + Kim.height);
		System.out.println("Kim 몸무게 = " + Kim.weight);
	}

}
