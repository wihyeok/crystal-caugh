package khiPattern.abstractFactory;

abstract class Computer {

	
	String name;
	Monitor monitor;
	Speaker speaker;
	boolean hasSSD;
	
	abstract void makeComputer();
	public abstract String toString();


	public final Monitor getMonitor() {
		return monitor;
	}


	public final void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}


	public final Speaker getSpeaker() {
		return speaker;
	}


	public final void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}


	public final boolean isHasSSD() {
		return hasSSD;
	}


	public final void setHasSSD(boolean hasSSD) {
		this.hasSSD = hasSSD;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	


	 void prepare(){
		 
	        System.out.println("컴퓨터조립을 준비 중 입니다..");
	}

 
}
