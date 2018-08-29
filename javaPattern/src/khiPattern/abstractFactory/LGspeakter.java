package khiPattern.abstractFactory;
public class LGspeakter extends Speaker {

	private String name;
	private String price;
	
	
	
	
	public LGspeakter(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
