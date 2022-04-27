
public class Person3 {
	// Attributes / Properties
	private String eyeColor;
	private String skinColor;
	private String hairColor;
	private int height;
	private int weight;
	
	// Default Constructors
	public Person3() {
		eyeColor = "Brown";
		skinColor = "Cream";
		hairColor = "Black";
		height = 164;
		weight = 70;
	}
	
	// Overloading Constructors
	public Person3(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	public Person3(String eyeColor, String skinColor) {
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
	}
	public Person3(String eyeColor, String skinColor, String hairColor) {
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		this.hairColor = hairColor;
	}
	public Person3(String eyeColor, String skinColor, String hairColor, int height) {
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		this.hairColor = hairColor;
		this.height = height;
	}
	
	// Methods / Behaviors
	public void Walk() {
		System.out.println("Walk!");
	}
	public void Run() {
		System.out.println("Run!");
	}
	public void Blink() {
		System.out.println("Blink!");
	}
	public void Crawl() {
		System.out.println("Crawl!");
	}
	public void Jump() {
		System.out.println("Jump!");
	}

	// Getters and Setters
	
	public String getEyeColor() {
		return eyeColor;
	}
	
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
