package getterSetter01;

public class JBank {
	// 홍길동이 통장에 금액을 30000 다시 넣음
	String name;
	int price;
	
	// 생성자 매개변수 2개
	JBank(String name, int price) {
		this.name = name;
		this.price = price;
	}
	JBank() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
