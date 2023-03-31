package javarecords;

public class TestStudentRecord {

	public static void main(String[] args) {
		
		Person John = new Person("John",30);
		Person Sarah = new Person("Sarah",25);
		
		System.out.println(John.name());    // prints name
		System.out.println(Sarah.age());       // prints age
	}

}
