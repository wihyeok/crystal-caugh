package khiPattern.abstractFactory;

public abstract class Speaker {

	public abstract String getName();
	public abstract String getPrice();

	public String toString() {
		return "스피커 모델 : " + getName() + ", 스피커 가격 : " + getPrice();
	}
	
}
