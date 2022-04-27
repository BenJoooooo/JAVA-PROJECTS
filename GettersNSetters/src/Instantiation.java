
public class Instantiation {
	
	private String name;
	private int age;
	
	
	//Constructor 1
	public Instantiation() {
		name = "default name";
		age = 0;
	}
	
	//Constructor 2oo
	public Instantiation(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
