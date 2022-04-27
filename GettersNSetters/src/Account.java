
public class Account {

	String name;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setName("Ben Joshua");
		a.setAge(20);
		System.out.println(a.getAge());
		System.out.println(a.getName());
		a.printDetails();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void printDetails() {
		System.out.println(name+","+age);
	}
}
