package kopattern.factory;

public class Main {
	public static void main(String[] args) {
		
		Product m1 = ProductFactory.getProduct("milk", "초코우유", 1000);
		Product m2 = ProductFactory.getProduct("milk", "커피우유", 1200);
		Product p1 = ProductFactory.getProduct("pencil", "4B연필", 800);
		Product p2 = ProductFactory.getProduct("pencil", "2B연필", 600);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
