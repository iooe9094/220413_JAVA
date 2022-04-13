package getterSetter00;

public class Employee {
	
	String number;
	String name;
	int payment;
	
	Employee(String number, String name, int payment) {
		this.number = number;
		this.name = name;
		this.payment = payment;
	}
	Employee() {}
	
	public void ups(int x) {
		 this.payment += x;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	
	
}
