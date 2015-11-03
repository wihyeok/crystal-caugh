package basic.Iterator;

/**
* Main 클래스
*/
public class Main {
	public static void main(String[] args) {
		BookShelf bs = new BookShelf(4);
		bs.appendBook(new Book("book1"));
		bs.appendBook(new Book("book2"));
		bs.appendBook(new Book("book3"));
		Iterator it = bs.iterator();
		while (it.hasNext()) {
			System.out.println(((Book) it.next()).getName());
		}
	}
}
