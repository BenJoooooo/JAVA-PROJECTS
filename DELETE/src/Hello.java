
interface interfaces {
	void cal (int item);
}

class display implements interfaces {
	int x;
	public void cal(int item)
	{
		x = item * item;
	}
}

class Hello {
	public static void main (String[] args) {
		display arr = new display();
		arr.x = 0;
		arr.cal(2);
		System.out.println(arr.x);
	}
}

