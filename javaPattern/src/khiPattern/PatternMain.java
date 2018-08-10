package khiPattern;

public class PatternMain {
	
	/**
	 * 이 패키지 밑으로 패턴별 패키지를 생성하여
	 * 스터디 실습예제, 학습내용 등을 기록
	 * 
	 * iterator Pattern
	 * 왜 번거로운 Iterator 패턴을 사용할까?
		- Iterator를 사용함으로써 구현과 분리해서 하나씩 셀 수 있기 때문.
		- 다음 코드의 while 루프는 BookShelf의 구현에 의존하지 않는다.
		- 만약 배열을 사용해서 Book을 관리하지 않고 Vector를 사용하도록 변경해도
		BookShelf가 iterator 메소드를 가지고있으며
		올바른 Iterator를 반환한다면 while루프는 변경하지 않아도 동작한다.
		- 결국 디자인패턴은 클래스의 재이용화를 촉진한다.
		- 클래스간 결합을 약하게 해서 부품으로 재이용하기 쉽도록 하기위해 추상클래스나 인터페이스가 도입
		- 구체적인 클래스(BookShelf, BookShelfIterator)만으로 프로그래밍(비즈니스로직 등)을 하는 것이 아니고,
		추상클래스나 인터페이스를 사용해 프로그래밍을 한다는 사고방식을 반드시 기억.
	 * List를 상속받아 구현한 클래스들(결국 Iterable을 상속받음)이
	 * Iterator패턴을 충실히 구현하고있으며 집합된 개별원소들의 정합성(원본 == iterator)을 보장하여
	 * 원본 집찹체와 iterator의 젭합체가 맞지 않을경우 예외발생.
	 * 실제로 iterator를 어떻게 구현하느냐에따라 집합체와 개별원소들의 보장까지 수행.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
