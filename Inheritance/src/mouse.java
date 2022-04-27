

// Will list all the specifications of the original mouse
interface specs {
	
	void leftClick();
	void rightClick();
	void scrollUp();
	void scrollDown();
	
}

public class mouse implements specs {

	@Override
	public void leftClick() {
		// TODO Auto-generated method stub
		System.out.println("Left mouse clicked!");
	}

	@Override
	public void rightClick() {
		// TODO Auto-generated method stub
		System.out.println("Right mouse clicked!");
	}

	@Override
	public void scrollUp() {
		// TODO Auto-generated method stub
		System.out.println("Scrolled up!");
	}

	@Override
	public void scrollDown() {
		// TODO Auto-generated method stub
		System.out.println("Scrolled down!");
	}
	
}
