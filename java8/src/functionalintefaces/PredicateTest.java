package functionalintefaces;

import java.util.function.Predicate;               //Predicate is always about condition i.e., it will always state true or false condition
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Andhra Pradesh", 
				"TamilNadu", 
				"Telengana",
				"Kerala",
				"Karnataka");
		
		Predicate<String> p = (String str) -> {
			
			return str.length() > 10;
		};
		
		System.out.println(p.test("Hollaa!"));               //for reference
		
		/*
		 * for(String str: strings) { System.out.println(p.test(str)); }
		 */
		desiredLength(strings,p);
	} //main ends
	
	public static void desiredLength(List<String> strings, Predicate<String> p) {
		
		for(String str: strings) {
			System.out.println(p.test(str));
		}
	}

}
