package basic.builder;

public class Director {
	private Builder builder;
	/**
	 * @param builder
	 * Builder의 하위 클래스의 인스턴스가 주어진다.
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[]{"좋은 아침입니다.", "안녕하세요",});
		builder.makeString("밤에");
		builder.makeItems(new String[]{"안녕하세요.", "안녕히 주무세요.", "안녕히 계세요.",});
		builder.close();
	}
}
