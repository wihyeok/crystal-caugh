package khiPattern.abstractFactory;

public class LGMonitor extends Monitor {

	 private String name;
	 private String price;
	 
	 
	
	public LGMonitor(String name, String price) {
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
