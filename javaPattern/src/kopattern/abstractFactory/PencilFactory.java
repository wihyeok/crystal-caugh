package kopattern.abstractFactory;

public class PencilFactory implements ProductAbstractFactory {

	private String name;
	private int price;
	
	public PencilFactory (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new Pencil(name, price);
	}

}
