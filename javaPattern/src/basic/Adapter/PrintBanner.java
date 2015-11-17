package basic.Adapter;

/**
* 어댑터 역할 수행
* 상속을 사용한 Adapter 패턴
*/
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}
	
	public void printWeak() {
		/* 상속받은 메소드 */
		showWithParen();
	}
	
	public void printStrong() {
		/* 상속받은 메소드 */
		showWithAster();
	}
}
