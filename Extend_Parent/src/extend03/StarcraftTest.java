package extend03;

public class StarcraftTest {

	public static void main(String[] args) {
		
	    // 모든 기능을 출력해주세요.
		Marine marine = new Marine();
		Firebat firebat = new Firebat();
		Tank tank = new Tank();
		
		// Units 공통 기능
		marine.walk();
		firebat.walk();
		tank.walk();
		
		// Units 개별 기능
		marine.shot();
		marine.stimpack();
		firebat.fireshot();
		firebat.stimpack();
		tank.siegeMode();
		
	}

}
