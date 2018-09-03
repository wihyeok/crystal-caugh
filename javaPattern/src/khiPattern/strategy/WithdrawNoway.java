package khiPattern.strategy;

public class WithdrawNoway implements Withdrawable {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("출금 가능한 화폐가 아닙니다.");
	}

}
