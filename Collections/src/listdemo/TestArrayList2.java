package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();      // <> this specifies the data type to be stored in the arraylist.
		//colors.add(new Object());              // it gives error because it only accepts String
		//colors.add(new Double("10.10"));		 // it gives error because it only accepts String
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		colors.add(null);         //this will give 2 null element in the array list
		
		System.out.println(colors.size());
		System.out.println(colors);
		
		String str = colors.get(3);
		System.out.println(str);
		

	}

}
