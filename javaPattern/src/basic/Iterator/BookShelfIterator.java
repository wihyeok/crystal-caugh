package basic.Iterator;

/**
* BookShelfIterator 클래스
* <desc>
* ConcreteIterator(구체적인 반복자) 역할
* Iterator가 결정한 인터페이스(API)를 실제로 구현
* </desc>
*/
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
