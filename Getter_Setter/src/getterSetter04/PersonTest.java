package getterSetter04;

public class PersonTest {

	public static void main(String[] args) {
		// name = "이순신", height = 175, weight = 75
		Person Kim = new Person("이순신", 175, 75);
		
		System.out.println("Kim의 이름 = " + Kim.name + ", 키 = " + Kim.height +
				           ", 몸무게는 = " + Kim.weight);
	}
}
