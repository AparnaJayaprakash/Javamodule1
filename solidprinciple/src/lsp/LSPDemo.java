package lsp;

public class LSPDemo {
	
	public void CalculateArea(Shape s) {
		System.out.println(s.getArea());
	}

	public static void main(String[] args) {
		LSPDemo lsp = new LSPDemo();
		//
		//An instance of rectangle is passed
		//
		lsp.CalculateArea(new Rectangle(1,4));
		//
		//An insance of Square is passed
		//
		lsp.CalculateArea(new Square(5));
		
	}

}
