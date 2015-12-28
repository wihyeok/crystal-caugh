package basic.singleton;

/**
 *	singleton 패턴
 *  - 지정한 클래스의 인스턴스가 '절대로' 1개밖에 존재하지 않는 것을 '보증'하고 싶을 때
 *  - 인스턴스가 1개밖에 존재하지 않는 것을 프로그램 상에서 표현하고 싶을 때
 *
 *
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2) {
			System.out.println("s1 and s2 is same obj");
		} else {
			System.out.println("s1 and s2 is not same");
		}
		System.out.println("maked ticket number is " + TicketMaker.getInstance().getNextTicketNumber());
		System.out.println("maked ticket number is " + TicketMaker.getInstance().getNextTicketNumber());
		System.out.println("maked ticket number is " + TicketMaker.getInstance().getNextTicketNumber());

		System.out.println("Start Triple.");
		for (int i = 0; i < 9; i++) {
			Triple triple = Triple.getInstance(i % 3);
			System.out.println(i + ":" + triple);
		}
		System.out.println("End Triple.");
	}

}
