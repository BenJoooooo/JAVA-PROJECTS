
// extends the mouse and implements the interface of rgbMouse
public class bluetoothMouse extends mouse implements rgb{

	public void connect() {
		System.out.println("Connected!");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Black!");
	}
}
