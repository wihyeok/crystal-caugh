package basic.iterator;

/**
* Main 클래스
*/
public class Main {
	public static void main(String[] args) {
		BookShelf bs = new BookShelf(5);
		bs.appendBook(new Book("book1"));
		bs.appendBook(new Book("book2"));
		bs.appendBook(new Book("book3"));
		
		/*
		왜 번거로운 Iterator 패턴을 사용할까?
		- Iterator를 사용함으로써 구현과 분리해서 하나씩 셀 수 있기 때문.
		- 다음 코드의 while 루프는 BookShelf의 구현에 의존하지 않는다.
		- 만약 배열을 사용해서 Book을 관리하지 않고 Vector를 사용하도록 변경해도
		BookShelf가 iterator 메소드를 가지고있으며
		올바른 Iterator를 반환한다면 while루프는 변경하지 않아도 동작한다.
		- 결국 디자인패턴은 클래스의 재이용화를 촉진한다.
		- 클래스간 결합을 약하게 해서 부품으로 재이용하기 쉽도록 하기위해 추상클래스나 인터페이스가 도입
		- 구체적인 클래스(BookShelf, BookShelfIterator)만으로 프로그래밍(비즈니스로직 등)을 하는 것이 아니고,
		추상클래스나 인터페이스를 사용해 프로그래밍을 한다는 사고방식을 반드시 기억.
		*/
		Iterator it = bs.iterator();
		while (it.hasNext()) {
			System.out.println(((Book) it.next()).getName());
		}
		
		/*
		연습문제) 예제에선 최초에 지정한 서가의 크기를 초과할 수 없다.
		배열이 아니라 ArrayList를 사용해서 서가의 크리를 초과해도 추가할 수 있도록 변경하시오.
		*/
	}
}
