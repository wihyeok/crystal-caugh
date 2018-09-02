package khiPattern.strategy;

public class Cash extends Money{

	
	
	public Cash(int bal, Withdrawable withdrwable) {
		super(bal, withdrwable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("현금을 사용합니다.");
	}
	
	
	
}
