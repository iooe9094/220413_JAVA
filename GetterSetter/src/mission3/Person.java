package mission3;

public class Person {
	String name;
	int height, weight;
	
	Person(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
//	getter과 setter 만드는 법은 직접 코딩해도 되지만
//	쉽게 할려면 마우스 오른쪽 -> source -> Generate getter,setter ㄱㄱ

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
////	getter이든 setter이든 무조건 하나당 한 개씩만 할 수 있다
//	
////	맴버 변수의 정보를 얻는게 getter
////	그냥 get쓰고 뒤에 정보를 얻을 맴버 변수를 적어주면 됨 get다음 첫 글자는 대문자로
////	맴버 변수의 name에 대한 getter 메소드
//	String getName() {
//		return this.name;
//	}
//	
//	int getHeight() {
//		return this.height;
//	}
//	
//	int getWeight() {
//		return this.weight;
//	}
//	
////	세터(setter)는 리턴값이 없는 대신에 매개변수에 있는 값을
////	맴버 변수에 저장할 수 있음
////	setter 메소드 : 맴버 변수의 값을 저장하는 메소드
//	void setName(String name) {
//		this.name = name;
//	}
//	
//	void setHeight(int height) {
//		this.height = height;
//	}
//	
//	void setWeight(int weight) {
//		this.weight = weight;
//	}
}
