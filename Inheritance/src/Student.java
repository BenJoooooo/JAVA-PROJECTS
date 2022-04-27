
public class Student extends PersonClass{
	
	private String course;
	private int studentNo;
	
	public Student() {
		super();
		course = "Course mo?";
		studentNo = 0;
	}
	
	public Student(String course, int studentNo) {
		this.course = course;
		this.studentNo = studentNo;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course =  course;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
}
