package listdemo;

public class StringBuilder1 {


	public static void main(String[] args) {
		
		int i = 12321;
		String str = i + "";
		StringBuilder sb = new StringBuilder(str);
		 sb.reverse();
		boolean result = str.equals(sb.toString());
		System.out.println(result);
		
		
		
		
		
		
		
		//from Integer to String
		
	}

	
}
