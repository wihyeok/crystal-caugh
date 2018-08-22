package khiPattern.templateMethod;

public class SDSWaet extends WaetBal {

	
	private double bal;
	private double commRate;
	private String name;

	
	
	
	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public double getCommRate() {
		return commRate;
	}

	public void setCommRate(double commRate) {
		this.commRate = commRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public void initWaet(String owner) {
		// TODO Auto-generated method stub
		bal=0;
		commRate=10;
		this.name=owner;
	}

	@Override
	public void withdraw(double withdrawmoney) {
		// TODO Auto-generated method stub
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡSDS지갑출금ㅡㅡㅡㅡㅡㅡㅡ");
		bal-=withdrawmoney; 
		System.out.println("출금 잔액 : " +withdrawmoney);
		System.out.println("현재 잔액 : " +bal);
		 
	}

	@Override
	public void deposit(double depositmoney) {
		// TODO Auto-generated method stub
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡSDS지갑입금ㅡㅡㅡㅡㅡㅡㅡ");
		bal+=depositmoney;
		System.out.println("입금 잔액 : " +depositmoney);
		System.out.println("현재 잔액 : " +bal);
	 
	}

	@Override
	public double getCommition() {
		// TODO Auto-generated method stub
		return commRate/100;
	}

	
}
