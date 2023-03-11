package oopsday2_shapes;

public class RectangleFactory {
	
	public static void main(String[] args) {
		
		ShapeIface Rectangle = new Rectangle(5,5);
		System.out.println(Rectangle);
		Rectangle.area();
	}

}
