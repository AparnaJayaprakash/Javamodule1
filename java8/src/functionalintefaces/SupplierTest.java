package functionalintefaces;

import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;

public class SupplierTest {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Andhra Pradesh", 
				"TamilNadu",
				"Telengana",
				"Kerala", 
				"Karnataka");
		
		Supplier<String> supplier = () -> {
			
			return new String("Hola!");
			
		};
		System.out.println(supplier.get());

	}
	
	
}


