
public class Student {
	private String hairColor;
	private String eyeColor;
	private String skinColor;
	private int age;
	private int weight;
	
	public Student() {
		hairColor = "Black";
		eyeColor = "Brown";
		skinColor = "Cream";
		age = 20;
		weight = 72;
	}
	
	// Encapsulation for the haircolor
	public void SetHairColor(String newHairColor) {
		hairColor = (newHairColor);
	}
	public String GetHairColor() {
		return hairColor;
	}
	
	// Encapsulation for the eyecolor
	public void SetEyeColor(String newEyeColor) {
		eyeColor = newEyeColor;
	}
	public String GetEyeColor() {
		return eyeColor;
	}
	
	// Encapsulation for the skincolor
	public void SetSkinColor(String newSkinColor) {
		skinColor = newSkinColor;
	}
	public String GetSkinColor() {
		return skinColor;
	}
	
	// Encapsulation for the age
	public void SetAge(int newAge) {
		age = newAge;
	}
	public int GetAge() {
		return age;
	}
	
	// Encapsulation for the weight
	public void SetWeight(int newWeight) {
		weight = newWeight;
	}
	public int GetWeight() {
		return weight;
	}
}
