package khiPattern.abstractFactory;

public class ComputerFactory {

	public static Monitor getMonitor(ComputerABFactory computerABFactory) {
		return computerABFactory.makeMonitor();
	}
	
	
	public static Speaker getSpeaker(ComputerABFactory computerABFactory) {
		return computerABFactory.makeSpeaker();
	}
}
