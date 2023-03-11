package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


interface Formula{
	
	public void m1();
}
class Some{
	
	public static void m2() {
		
		System.out.println("from m2....");
	}
	
}

class Other{
	
	Other() {
		System.out.println("from Other constructor...");
	}
	void m2(String str) {
		
		System.out.println("from m2..." + str);
	}
}
public class TestMethodRefs {

	public static void main(String[] args) {
		
		Formula f = Some::m2;       //:: - this is used for method references in java 8. Primarily used form 1.constructor 2. static method 3. instance method
		f.m1();
		
		f = Other::new;       //reference of constructor to interface         new - constructor method reference
		
		List<String> list = Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println);                              //System.out::println - instance method reference
		
		List<Integer> intList = Arrays.asList(12,32,1323,11);
		Optional<Integer> num = intList.stream().reduce(Math::max);              //Math::max - static method reference
		Optional<Integer> num1 = intList.stream().reduce(Math::min);
		System.out.println(num.get());
		System.out.println(num1.get());

	}

}
