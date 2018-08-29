package khiPattern.abstractFactory;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Monitor lgmonitor = ComputerFactory.make
		Monitor lgmonitor = ComputerFactory.getMonitor(new LGComputerFactory("gram monitor", "200,000"));
		Speaker lgspeaker = ComputerFactory.getSpeaker(new LGComputerFactory("gram speaker", "60,000"));
		
		System.out.println(lgmonitor.toString());
		System.out.println(lgspeaker.toString());
		
		
		Computer lgCom = new LGcomputer();
		lgCom.setMonitor(lgmonitor);
		lgCom.setSpeaker(lgspeaker);
		lgCom.setHasSSD(true);
		
		System.out.println(lgCom.toString());
		
		Monitor samsungmonitor = ComputerFactory.getMonitor(new SamsungComputerFactory("gram monitor", "200,000"));
		Speaker samsungspeaker = ComputerFactory.getSpeaker(new SamsungComputerFactory("gram speaker", "60,000"));
		
		System.out.println(lgmonitor.toString());
		System.out.println(lgspeaker.toString());
		
		
		Computer samsungCom = new SamsungComputer();
		samsungCom.setMonitor(samsungmonitor);
		samsungCom.setSpeaker(samsungspeaker);
		samsungCom.setHasSSD(true);
		
		System.out.println(samsungCom.toString());
		
		
		
	}

}
