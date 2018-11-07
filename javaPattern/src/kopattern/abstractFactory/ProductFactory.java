package kopattern.abstractFactory;

public class ProductFactory {
	public static Product getProduct(ProductAbstractFactory product) {
		return product.createProduct();
	}
}
