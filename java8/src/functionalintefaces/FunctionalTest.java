package functionalintefaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		
List<String> strings = Arrays.asList("Andhra Pradesh", "TamilNadu", "Telengana", "Kerala", "Karnataka");
		
		Function <String,Integer> f = (str) -> {
			return str.length();
		};
		
//Function for uppercase
		Function<String,String> f2 = (str) -> {
			return str.toUpperCase();
		};
//Function for lowercase
		Function<String,String> f3 = (str) -> {
			return str.toLowerCase();
		};
//function for reverse
		Function<String,String> f4 = (str) -> {
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			return sb.toString();
		};
		
		printLength(strings, f);
		printToUpperCase(strings, f2);
		printToLowerCase(strings, f3);
		printReverse(strings, f4);

	} //Main ends here
	
	public static void printLength(List<String> strings, Function<String,Integer> fRef ) {
		
		for(String str: strings) {
			System.out.println(fRef.apply(str));
		}
	}
	
	public static void printToUpperCase(List<String> strings, Function<String,String> fRef ) {
		
		for(String str: strings) {
			System.out.println(fRef.apply(str));
		}
		
	}

	public static void printToLowerCase(List<String> strings, Function<String,String> fRef ) {
		
		for(String str: strings) {
			System.out.println(fRef.apply(str));
		}
		
	}
public static void printReverse(List<String> strings, Function<String,String> fRef ) {
		
		for(String str: strings) {
			System.out.println(fRef.apply(str));
		}
		
	}


}
