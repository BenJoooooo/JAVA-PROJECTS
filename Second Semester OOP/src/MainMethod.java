
public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape("Triangle","Small");
		System.out.println(s.getName());
		System.out.println(s.getSize());
		System.out.println("-----------------------");
		s.printShapeName();
		s.printShapeSize();
		s.printShapeInfo();
		
		System.out.println("-----------------------");
		Square sq = new Square(3,5);
		System.out.println(sq.getName());
		System.out.println(sq.getSize());
		System.out.println(sq.getLength());
		System.out.println(sq.getWidth());
		
		System.out.println("------------------------");
		sq.printShapeName();
		sq.printShapeSize();
		sq.printShapeLength();
		sq.printShapeWidth();
		sq.printShapeInfo();
	}
}
