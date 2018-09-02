package khiPattern.strategy;

public class LocalCurrecy extends Money{

	public LocalCurrecy(int bal, Withdrawable withdrwable) {
		super(bal, withdrwable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
		
		System.out.println("지역 화폐를 사용합니다");
		
	}



}
