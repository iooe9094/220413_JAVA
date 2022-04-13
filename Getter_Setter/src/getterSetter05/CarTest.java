package getterSetter05;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory sonata = new CarFactory(1, "sonata");		
		CarFactory avante = new CarFactory(2, "avante");
		CarFactory santafe = new CarFactory(3, "santafe");
		
		// getter 출력
		System.out.println(sonata.getNum() + "은 " + sonata.getName());
		System.out.println(avante.getNum() + "은 " + avante.getName());
		System.out.println(santafe.getNum() + "은 " + santafe.getName());
		}

}
