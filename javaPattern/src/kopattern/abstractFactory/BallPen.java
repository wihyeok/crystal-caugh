package kopattern.abstractFactory;

public class BallPen extends Product {
	private String name;
	private int price;
	
	public BallPen(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
}
