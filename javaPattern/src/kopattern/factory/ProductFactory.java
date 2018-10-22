package kopattern.factory;

public class ProductFactory {
	public static Product getProduct(String type, String name, int price) {
		if(type.equals("milk")) {
			return new Milk(name, price);
		} else if (type.equals("pencil")) {
			return new Pencil(name, price);
		} else {
			return null;
		}
	}
}
