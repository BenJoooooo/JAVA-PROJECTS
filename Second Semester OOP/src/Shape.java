
public class Shape {
	
	private String name;
	private String size;
	
//	default constructor
	public Shape() {
		name = "Shape name";
		size = "Shape size";
	}
	
//	overloaded constructor
	public Shape(String name, String size) { 
		this.name = name;
		this.size = size;
	}
	
//	Getters and setters
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public void printShapeInfo() {
		System.out.println("Value of name and size: " + name + "," + size);
	}
	public void printShapeName() {
		System.out.println(name);
	}
	public void printShapeSize() {
		System.out.println(size);
	}
}
