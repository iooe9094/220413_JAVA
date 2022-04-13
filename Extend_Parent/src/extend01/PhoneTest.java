package extend01;

public class PhoneTest {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		Galaxy galaxy = new Galaxy();
		
		// IPhone
		iphone.call();
		iphone.sms();
		
		// Galaxy
		galaxy.dmb();
	}

}
