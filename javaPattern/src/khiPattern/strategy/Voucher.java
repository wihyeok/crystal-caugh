package khiPattern.strategy;

public class Voucher extends Money{

	public Voucher(int bal, Withdrawable withdrwable) {
		super(bal, withdrwable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("바우처를 사용합니다.");
	}

}
