package khiPattern.abstractFactory;

public interface ComputerFactory {

	public Monitor makeMoniter();
	public Speaker makeSpeaker();
	public boolean hasSSD();
}
