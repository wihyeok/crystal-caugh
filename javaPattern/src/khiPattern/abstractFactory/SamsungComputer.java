package khiPattern.abstractFactory;

public class SamsungComputer extends Computer{

	ComputerABFactory computerfactory;
	
	 
	@Override
	void makeComputer() {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("컴퓨터조립 시작");
		monitor = computerfactory.makeMonitor();
		speaker = computerfactory.makeSpeaker();
		System.out.println("컴퓨터조립 완료");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "(" + monitor.getName() + "," + monitor.getPrice() +")\n";
		str+= "(" + speaker.getName() + "," + speaker.getPrice() +")\n";
		return str;
	}

}
