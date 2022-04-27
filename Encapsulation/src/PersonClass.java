import java.util.Scanner;

public class PersonClass {
	
	private String name;
	private int age;
	Scanner in = new Scanner(System.in);
	
	public PersonClass() {
		name = "Default Name";
		age = 0;
	}
	
//	Getters Method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
//	Setters Method
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("Write your Age: ");
		age = in.nextInt();
		if (age <= 0 || age >= 100) {
			System.out.println("Invalid age!");
		}
		else {
			this.age = age;
		}
	}
	
}
