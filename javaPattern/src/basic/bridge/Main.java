package basic.bridge;

/**
 * @author hyeok
 * <pre>
 * Bridge 패턴
 *  - '기능의 클래스 계층'과 '구현의 클래스 계층' 연결
 *  - 기능의 클래스 계층: 확장(상속)받아 기능(메소드)를 추가
 *  - 구현의 클래스 계층: 어떤 인터페이스API의 다른 구현체를 생성
 * </pre>
 */
public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));

	}

}
