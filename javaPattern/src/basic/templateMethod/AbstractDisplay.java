package basic.templateMethod;

public abstract class AbstractDisplay {
	/* 하위 클래스에 구현을 맡기는 추상 메소드 */
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	/* 추상 클래스에서 구현되고 있는 메소드 */
	public final void display() {
		/* 상위 클래스인 추상 클래스에서 처리 흐름(템플릿) */
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
