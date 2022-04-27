
public class Birthday {
	
	private int month;
	private int day;
	private int year;
	
	public Birthday() {
		month = 00;
		day = 00;
		year = 0000;
	}
	
	public Birthday(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("Birthday: %s", this);
		System.out.println();
	}
	
	public String toString() {
		return String.format("%d/%d/%d",month,day,year);
	}
	
}
