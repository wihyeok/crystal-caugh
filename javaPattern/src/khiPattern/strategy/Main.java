package khiPattern.strategy;

/*
 *  전략패턴 - 어플리케이션에서 달라지는 부분을 찾아내고 
 *  달라지지 않는 부분으로부터 분리 시킨다. 
 *  바뀌는 부분은 따로 뽑아서 캡슐화(인터페이스) 시킨다. 
 *  concreate의 알고리즘만 수정하면댐 
 *  위임이라는 느슨한 연결을 사용하고 있어 알고리즘을 용이하게 교환. 
 *  
 *  
 *  전략패턴은 앞으로 웹개발을 스프링으로 하신다면 그리고 객체지향적으로 개발을 하신다면 아주 중요하며 자주 사용될 패턴일 될 것입니다. 
 *  factory 와 template method, abstract factory 패턴을 충분히 이해하셨다면 이해하는데 어렵지않을거에요. 
 *  다만 책의 예제는 이해하기 다소 난이도가 있습니다. 다이어그램과 concrete의 역할을 두번이고 세번이고 읽어보세요. 
 *  각 클래스들의 연관도와 관계도를 익히시고 내일 전략패턴형태로 개발한 ppap의 암복호화모듈을 같이 보겠습니다 
 * */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Cash - 출금가능
		 * Voucher - 출금불가능
		 * Localcurrency - 출금불가능
		 * */
		
		Money cash = new Cash(10000, new Withdraw());
		Money voucher = new Voucher(100000,new WithdrawNoway());
		Money localcurrency = new LocalCurrecy(20000, new WithdrawNoway());
		
		
		
		cash.getWithdrwable().withdraw();
		voucher.getWithdrwable().withdraw();
		localcurrency.getWithdrwable().withdraw();
		
		
		
		
		
		
	}

}
