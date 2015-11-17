package basic.Adapter;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();
		AbPrint ap = new AbPrintBanner("Hi there");
		ap.printStrong();
		ap.printWeak();
	}
}
