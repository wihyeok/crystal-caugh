package khiPattern.abstractFactory;

public class LGComputerFactory implements ComputerFactory{

	@Override
	public Monitor makeMoniter() {
		// TODO Auto-generated method stub
		return new LGMonitor();
	}

	@Override
	public Speaker makeSpeaker() {
		// TODO Auto-generated method stub
		return new LGspeakter();
	}

	@Override
	public boolean hasSSD() {
		// TODO Auto-generated method stub
		return true;
	}

}
