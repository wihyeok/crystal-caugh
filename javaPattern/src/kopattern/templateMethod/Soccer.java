package kopattern.templateMethod;

public class Soccer extends Sport {

	@Override
	void prepareUniform() {
		// TODO Auto-generated method stub
		System.out.println("축구유니폼을 준비합니다.");
	}

	@Override
	void prepareShoes() {
		// TODO Auto-generated method stub
		System.out.println("축구화를 준비합니다.");
	}

	@Override
	boolean isUsingPrepareOther() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	void prepareOther() {
		// TODO Auto-generated method stub
		System.out.println("축구공을 준비합니다.");
	}
}
