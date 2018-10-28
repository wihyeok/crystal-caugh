package kopattern.templateMethod;

public abstract class Sport {
	
	void readyToExercise() {
		startWarmingUp();
		prepareUniform();
		prepareShoes();
		if(isUsingPrepareOther()) {
			prepareOther();
		}
	}
	
	final void startWarmingUp() {
		System.out.println("준비운동을 합니다.");
	}
	
	abstract void prepareUniform();
	
	abstract void prepareShoes();
	
	boolean isUsingPrepareOther() {
		return false;
	}
	
	void prepareOther(){};
}
