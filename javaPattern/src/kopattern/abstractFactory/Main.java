package kopattern.abstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pencil = ProductFactory.getProduct(new PencilFactory("연필1", 3000));
		Product ballpen = ProductFactory.getProduct(new BallPenFactory("볼펜1", 2000));
		
		System.out.println( pencil.toString());
		System.out.println( ballpen.toString());
	}
}
