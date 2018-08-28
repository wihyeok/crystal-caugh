package khiPattern.abstractFactory;

public abstract class Monitor {

	public abstract String getName();
	public abstract String getPrice();

	public String toString() {
		return "모니터 모델 : " + getName() + ", 모니터 이름 : " + getPrice();
	}

}
