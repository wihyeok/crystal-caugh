package khiPattern.templateMethod;

public abstract class Factory {

	/*
	 * 여기서 Factry를 상속받아서 지갑공장 회사공장 클래스를 만들어도대는가요?
	 * 
	 * 
	 * */

	
	protected abstract WaetBal create(String type);
}
