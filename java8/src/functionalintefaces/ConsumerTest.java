package functionalintefaces;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Andhra Pradesh", "TamilNadu", "Telengana", "Kerala", "Karnataka");

		Consumer<String> consumer = (str) -> { // Consumer accepts input but it doesnt require to return like lambda,
												// here we can print right there

			System.out.println(str);
		};

		consumer.accept("I am doing awesomee!!!! :)");

		for (String str : strings) {
			consumer.accept(str);
		}
		
		printStrings(strings, consumer);

	}

	public static void printStrings(List<String> strings, Consumer<String> c) {

		for (String str : strings) {
			c.accept(str);
		}
	}

}
