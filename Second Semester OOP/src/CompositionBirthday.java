
public class CompositionBirthday {
	
	private String name;
	private Birthday birthday;
	
	public CompositionBirthday(String name, Birthday birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
