package listdemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {             //Set will not allows duplicate whereas list will allow duplicates.

	public static void main(String[] args) {
		
		TreeSet<String> bookSet = new TreeSet<>();
		
		bookSet.add("Java in nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for dummys");
	//	bookSet.add(null);       // this will give nullpointer exception because treeSet doesn't allow null value or null element.
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in nutshell"));
		
		bookSet.add("Thinking in Java");         //This shows it will not allow duplicate elements.
		System.out.println(bookSet.size());
		
		for(String book: bookSet) {
			System.out.println(book);
		}
		
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		

	}

}
