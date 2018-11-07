package kopattern.abstractFactory;

public abstract class Product {
	public abstract String getName();
	public abstract int getPrice();
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "상품명: " + getName() + ", 가격: " + getPrice();
	}
}
