
public class LessonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LessonOneClass lessonOne = new LessonOneClass("123456", "Black","Honda",120);
		System.out.println(lessonOne.plateNumber);
		System.out.println(lessonOne.color);
		System.out.println(lessonOne.manufacturer);
		System.out.println(lessonOne.currentSpeed);
		
		System.out.println("\n");
		
		lessonOne.accelerate();
		lessonOne.turn();
		lessonOne.brake();
	}

}
