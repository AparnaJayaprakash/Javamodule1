package oopsday3.line;

public class TestLine {

	public static void main(String[] args) {
		
		
		LineIface line = new LineFunction();
		
		Point P1 = new Point(5,6);
		Point P2 = new Point(4,4);
		
		System.out.println(P1.getX() + "," + P1.getY());
		System.out.println(P2.getY() + ","+  P2.getY());
		
		line.drawLine(P1, P2);
		
		
		
		
		
		

	}

}
