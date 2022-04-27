
public class MainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonClass pc = new PersonClass("Ben Joshua","IT", 20);
		System.out.println(pc.getName());
		System.out.println(pc.getDepartment());
		System.out.println(pc.getAge());
		System.out.println();
		
		Student s = new Student();
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getStudentNo());
	}

}
