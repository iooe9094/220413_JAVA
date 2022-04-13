package getterSetter05;

public class CarFactory {
	int num;
	String name;
	
	CarFactory(int num, String name) {
		this.num = num;
		this.name = name;
	}
	CarFactory() {}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
