package basic.singleton;

/**
 * 주석처리된 부분을 싱글톤 패턴으로 변경하시오.
 *
 */
public class TicketMaker {
//	private int ticket = 1000;
//	public int getNextTicketNumber() {
//		return ticket++;
//	}
	private int ticket = 1000;
	private static TicketMaker singleton = new TicketMaker();
	private TicketMaker() {
	}
	public static TicketMaker getInstance() {
		return singleton;
	}
	/**
	 * 복수의 쓰레드에서 호출될 경우 같은 값을 반환할 수 있음.
	 * synchronized로 자원의 동기화.
	 * @return
	 */
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}

}
