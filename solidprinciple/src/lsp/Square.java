package lsp;

public class Square implements Shape {
	
	private int side;
	

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getArea() {
		
		return 0;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
