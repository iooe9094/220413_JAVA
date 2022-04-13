package getterSetter04;

public class Person {
	
	// 인스턴스변수
	String name;
	int height;
	int weight;
	
	// 생성자, 멤버변수 초기화
	Person(String name, int height, int weight) {
		// this.name의 this는 위의 인스턴스변수에 추가한 String name을 의미함
		// person(int x, int y, int z)에서 xyz보다는 인스턴스변수에 추가한 이름이 가독성이 좋음
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 오른쪽마우스 - source - generate getters and setters
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
	
	// 멤버변수 name에 대한 getter 메소드 (3개이므로 3개)
//	String getName() {
//		return this.name;
//	}
//	int getHeight() {
//		return this.height;
//	}
//	int weight() {
//		return this.weight;
//	}
	
	// setter 메소드 : 멤버 변수의 값을 저장하는 메소드 (3개이므로 3개)
//	void setName(String name) {
//		this.name = name;
//	}
//	void setHeight(int height) {
//		this.height = height;
//	}
//	void setWeight(int weight) {
//		this.weight = weight;
//	}
}

