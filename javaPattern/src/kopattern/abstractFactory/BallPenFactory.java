package kopattern.abstractFactory;

public class BallPenFactory implements ProductAbstractFactory {

	private String name;
	private int price;
	
	public BallPenFactory (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new BallPen(name, price);
	}

}
