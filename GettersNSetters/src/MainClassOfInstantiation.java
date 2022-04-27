
public class MainClassOfInstantiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instantiation i = new Instantiation();
		System.out.println("Displaying initial values ");
		System.out.println(i.getName());
		System.out.println(i.getAge());
		System.out.println("Setting new values: ");
		System.out.println("Displaying new values: ");
		i.setAge(20);
		i.setName("Ben Joshua");
		System.out.println(i.getAge());
		System.out.println(i.getName());
	}
}
