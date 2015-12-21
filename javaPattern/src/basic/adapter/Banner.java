package basic.adapter;

/**
* 미리 제공되어있는 강조 출력용 배너클래스
*/
public class Banner {
	private String string;
	
	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}
	
	public void showWithAster() {
		System.out.println("+" + string + "+");
	}
}
