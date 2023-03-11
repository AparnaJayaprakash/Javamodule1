package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;                                        //Filter takes predicate
import java.util.function.Predicate;                                       //Map takes Function
import java.util.stream.Collectors;                                        //Consumer takes terminal operator

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add( "sun" );
		list.add("moon");
		list.add("jupiter");
		list.add("uranus");
		list.add("pluto");
		list.add("mars");
		list.add("venus");
		
		/////Filter takes predicate
		
		//Using predicate
		Predicate<String> p = (str)->{
			
			return str.length()>3 || str.length()<10;
		};
		
		long count = list.stream().filter(p).count();                          //using predicate   stream explicitly gets one element from list
		System.out.println(count);
		
		//Using simple predicate method
		long count1 = list.stream().filter((str)->str.length()>3|| str.length()<10).count();                          //using predicate   stream explicitly gets one element from list
		System.out.println(count1);
		
		
		/////Map takes function
		
		//1. method without using function
		List<String> outList = list.stream().map((str)-> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(outList);
		
		//2.Method: using function
		Function<String,String> f = (str) -> {
			
			return str.toUpperCase();
			
		};
		List<String> outList1 = list.stream().map(f).collect(Collectors.toList());          //collect is terminate statement
		System.out.println(outList);
		
		/////Consumer takes terminal operator
		
		//1.using consumer
		
		Consumer<String> c = (str) ->{
			
			System.out.println(str);
		};
		list.stream().forEach(c);
		
	
		
		//2. Using consumer
		list.stream().forEach(System.out::println);        //:: scope resolution operator
		
		
		
		
		//Combining filter,map and consumer                         //First filter the data the perform the transformation(uppercase or 
//                                                                    lowercase or reverse or etc) and at last print the final statement.
		
		list.stream().filter(p).map(f).forEach(c);
	}

}
