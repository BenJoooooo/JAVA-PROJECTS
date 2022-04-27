
public class Clock {
	private int hr;
	private int min;
	private int sec;
	
	public Clock() {
		hr = 0;
		min = 0;
		sec = 0;
	}
	
	public Clock(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	
	// Mutators and Accessors
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getHr() {
		return hr;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMin() {
		return min;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getSec() {
		return sec;
	}
	public String getTime() {
		return "Current time: " + hr + ":" + min + ":" + sec;
	}
}
