package khiPattern.abstractFactory;

public class SamsungComputerFactory implements ComputerABFactory {

	private String name;
    private String price;
	
	
	public SamsungComputerFactory(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public Monitor makeMonitor() {
		// TODO Auto-generated method stub
		return new SamsungMonitor();
	}

	@Override
	public Speaker makeSpeaker() {
		// TODO Auto-generated method stub
		return new SamsungSpeaker();
	}

	@Override
	public boolean hasSSD() {
		// TODO Auto-generated method stub
		return false;
	}

}
