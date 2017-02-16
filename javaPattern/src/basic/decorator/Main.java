package basic.decorator;

/**
 * <pre>
 * 1. 투과적 인터페이스(API): 상속받아 구현한 구현체에서도 원래의 인터페이스(API)는 감출 수 없음.
 *  - Display클래스에서 하위 클래스에 구현을 위임한 getRows, getRowText, show, getColumns의 메소드가 감추어지는 일 없이 다른 클래스에서도 실행되는것을 확인
 * 2. 내용물을 바꾸지않고 기능을 추가
 *  - Decorator패턴은 위임을 사용.
 * 3. 동적인 기능을 추가
 * 4. 단순한 장식이라도 다양한 기능을 추가 가능
 * 
 * </pre>
 * 
 * @author hyeok
 *
 */
public class Main {
	
	public static void main(String[] arg) {
		Display b1 = new StringDisplay("Hello, world.");
		Display b2 = new SideBorder(b1, '#');
		Display b3 = new FullBorder(b2);
		b1.show();
		b2.show();
		b3.show();
		Display b4 = new SideBorder(
					new FullBorder(
						new FullBorder(
							new SideBorder(
								new FullBorder(
									new StringDisplay("nice to meet you.")
								)
								, '*'
							)
						)
					)
				, '/');
		b4.show();
	}

}
