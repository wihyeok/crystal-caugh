package khiPattern.abstractFactory;

public class LGComputerFactory implements ComputerABFactory{

	
	private String name;
    private String price;
	
    
    
	public LGComputerFactory(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	@Override
	public Monitor makeMonitor() {
		// TODO Auto-generated method stub
		return new LGMonitor(name, price);
	}

	@Override
	public Speaker makeSpeaker() {
		// TODO Auto-generated method stub
		return new LGspeakter(name, price);
	}

	@Override
	public boolean hasSSD() {
		// TODO Auto-generated method stub
		return true;
	}

}
