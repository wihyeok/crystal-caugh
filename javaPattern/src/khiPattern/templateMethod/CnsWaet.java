package templateMethod;

public class CnsWaet extends WaetBal{
	

	private double commRate; // 수수료율 " % " 
	private double bal; //지갑잔액
	private String name; // 지갑주인이름
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBal() {
		return bal;
	}
 

	public void setBal(double bal) {
		this.bal = bal;
	}
	
	public void setCommRate(double commRate) {
		this.commRate = commRate;
	}
	
	@Override
	
	public void withdraw(double withdrawmoney) {
		// TODO Auto-generated method stub
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡCNS지갑출금ㅡㅡㅡㅡㅡㅡㅡ");
		bal-=withdrawmoney; 
		System.out.println("출금 금액 : " +withdrawmoney);
		System.out.println("현재 잔액 : " +bal);
	 
	}

	@Override
	public void deposit(double depositmoney) {
		// TODO Auto-generated method stub
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡCNS지갑입금ㅡㅡㅡㅡㅡㅡㅡ");
		bal+=depositmoney;
		System.out.println("입금 금액 : " +depositmoney);
		System.out.println("현재 잔액 : " +bal);
	 
	}

	@Override
	public void initWaet(String owner) {
		// TODO Auto-generated method stub
		bal=0;
		commRate=5;
		name=owner;
	}

	@Override
	public double getCommition() {
		// TODO Auto-generated method stub
		return commRate/100;
	}

}
