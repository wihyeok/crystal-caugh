package basic.Iterator;

/**
* 서가 클래스
* <desc>
* ConcreteAgreegate(구체적인 집합체)
* 이 클래스를 집합체로 다루기위해 Aggregate 인터페이스를 구현
* iterator메소드는 BookShelf 클래스에 대응하는 Iterator로서
* , BookShelfIterator라는 클래스의 인스턴스를 생성해서 반환.
* </desc>
*/
public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
