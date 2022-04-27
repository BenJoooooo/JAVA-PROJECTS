
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person mp = new Person("Black");
		Person mp2 = new Person("White", "Brown");
		Person mp3 = new Person("Brown", "Cream", "Black");
		Person mp4 = new Person("Blue", "Brown", "Blonde", 165);
		System.out.println("Eye Color: " + mp.eyeColor + "\nSkin Color: " + mp2.skinColor
				+ "\nHair Color: " + mp3.hairColor + "\nHeight: " + mp4.height);
		System.out.println("");
		mp.Walk();
		mp.Run();
		mp.Blink();
		mp.Crawl();
		mp.Jump();
	}
}
	