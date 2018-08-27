package khiPattern.abstractFactory;

public class SamsungComputerFactory implements ComputerFactory {

	@Override
	public Monitor makeMoniter() {
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
