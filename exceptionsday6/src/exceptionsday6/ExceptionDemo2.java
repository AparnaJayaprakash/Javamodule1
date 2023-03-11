package exceptionsday6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Program task begins...");
		try {
		int a = Integer.parseInt(args[0]);    // args is also known as command line arguments.
		int b = Integer.parseInt(args [1]);     // the argument is passed as string "10" "20" but parseInt converts it into int.
		int c = b/a;
		
		String name = args[2];
		int data[] = {a,b};
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program task completed..");
	}

}
