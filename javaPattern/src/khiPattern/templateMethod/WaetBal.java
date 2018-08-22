package templateMethod;

public abstract class WaetBal {

	
 
	
	abstract public void initWaet( String owner);
	abstract public void withdraw(double withdrawmoney);
	abstract public void deposit(double depositmoney);
	abstract public double getCommition();
	

	
	public void create(double depositmoney,String name) {
		double commition;
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ지갑생성ㅡㅡㅡㅡㅡㅡㅡㅡ");
		initWaet(name);
		deposit(depositmoney); // 처음입금 
		commition=getCommition(); // 5% --> 0.05 로반환
		System.out.println("ㅡㅡㅡㅡㅡ지갑생성수수료가 출금됩니다ㅡㅡㅡㅡ");
		withdraw(depositmoney*commition); // 생성수수료 출금
		 
	}
	 
	 
	
}
