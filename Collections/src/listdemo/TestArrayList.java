package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		
		
		ArrayList flowers = new ArrayList();
		
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double("10.10"));
		
		flowers.add("Tulips");
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Lily");
		flowers.add("Cosmos");
		
		//String str = (String) flowers.get(3);      // type casted the array list to string to get the ouput
		
		Object obj = flowers.get(3);
		if(obj instanceof Integer) {
			Integer in = (Integer) obj;
			System.out.println(in.MAX_VALUE);
		}
		else if (obj instanceof Double) {
			Double d = (Double) obj;
			System.out.println(d.MAX_VALUE);
			
		}
		else if(obj instanceof String) {
			String str = (String) obj;
			System.out.println(str.toUpperCase());
		}
		
		
		/*
		 * System.out.println(flowers); System.out.println(flowers.size()); // gives
		 * length System.out.println(flowers.get(2)); // gives object at index 2.
		 * System.out.println(flowers.contains("lily")); // gives if it has lily or not/
		 * gives true or false flowers.add(2, "Sunflower"); // adds object to arraylist
		 * to the specified index System.out.println(flowers);
		 * 
		 * for(Object obj: flowers) { // gives all objects System.out.println(obj); }
		 * 
		 * flowers.remove(2); // removes object from the index
		 * System.out.println(flowers);
		 * 
		 * 
		 * Iterator iter = flowers.iterator();
		 * 
		 * while(iter.hasNext()) { // gives all objects System.out.println(iter.next());
		 * }
		 * 
		 * for(int i =0; i<flowers.size(); i++) { // gives all objects
		 * 
		 * System.out.println(flowers.get(i)); }
		 */
		
		

	}

}
