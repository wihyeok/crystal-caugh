package basic.flyweight;

public class Main {
	
	/**
	 * 오브젝트(객체)를 '가볍게'하기 위한 패턴.
	 * '가볍게'는 결국 메모리 사용량을 최소화
	 *  - 인스턴스를 가능한 대로 공유시켜서 쓸데없이 new하지 않도록 한다.
	 * 
	 * 한 개의 인스턴스를 공유할 때 주의점
	 * 1. 작은 변경이라도 영항범위가 커질 수 있다. -> 여러 장소에 공유시켜야할 정보만 Flyweight 역할에게 제공
	 * 
	 * 
	 */

	public static void main(String[] args) {
//		if (args.length == 0) {
//			System.out.println("Usage: java Main digits");
//			System.out.println("Example: java Main 1212123");
//			System.exit(0);
//		}
		
		BigString bs = new BigString("1001");
		bs.print();
		
		TokenString ts = new TokenString("0-1-0-1");
		ts.print();
		
		System.out.println(bs.getBigChar(0));
		
		System.out.println(bs.getBigChar(0).equals(ts.getBigChar(0)));
		System.out.println(bs.getBigChar(1).equals(ts.getBigChar(1)));
		System.out.println(bs.getBigChar(2).equals(ts.getBigChar(2)));
		System.out.println(bs.getBigChar(3).equals(ts.getBigChar(3)));
	}

}
