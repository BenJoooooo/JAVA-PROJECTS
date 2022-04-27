
public class Square extends Shape{
	
	private int length;
	private int width;
	
//	default constructor
	public Square() {
		length = 0;
		width = 0;
	}
	
//	overloaded constructor
	public Square(int length, int width) {
		super("octagon","big");
		this.length = length;
		this.width = width;
	}
	
//	getters and setters
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	
	public void setLength() {
		this.length = length;
	}
	public void setWidth() {
		this.width = width;
	}
	
	public void printShapeLength() {
		System.out.println(length);
	}
	public void printShapeWidth() {
		System.out.println(width);
	}
	public void printShapeInfo() {
		super.printShapeInfo();
		System.out.println("Value of lenth and width: " + length + "," + width);
	}
}
