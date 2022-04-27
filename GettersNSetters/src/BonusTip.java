
public class BonusTip {

	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void printDetails() {
		System.out.println(getAge()+","+getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusTip bt = new BonusTip();
		bt.setName("Ben Joshua");
		bt.setAge(20);
		System.out.println(bt.getAge());
		System.out.println(bt.getName());
		bt.printDetails();
		
	}
}
