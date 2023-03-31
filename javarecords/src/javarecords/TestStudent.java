package javarecords;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		List<Integer> thomasGrade = new ArrayList<>();
		thomasGrade.add(80);
		thomasGrade.add(90);
		thomasGrade.add(70);
		Student john = new Student("Thomas", 123, thomasGrade);

		List<Integer> sarahGrades = new ArrayList<>();
		sarahGrades.add(50);
		sarahGrades.add(55);
		sarahGrades.add(62);
		Student sarah = new Student("Sarah", 456, sarahGrades);
		
		
		System.out.println(john.getAverageGrade()); // prints "80.0"
		System.out.println(sarah.hasPassingGrade()); // prints "true"


	}

}
