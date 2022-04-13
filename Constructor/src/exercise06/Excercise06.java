package exercise06;

public class Excercise06 {

	public static void main(String[] args) {
		
		Student student1 = new Student(100,85,90);
		Student student2 = new Student(95,80,85);

		System.out.println("student1의 총점 = " + student1.sum());
		System.out.println("student2의 총점 = " + student2.sum());
	}

}
