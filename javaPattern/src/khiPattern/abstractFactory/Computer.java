package khiPattern.abstractFactory;

public abstract class Computer {

	
	String name;
	Monitor monitor;
	Speaker speaker;
	boolean hasSSD;
	
	abstract void makeComputer();


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
