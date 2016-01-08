package basic.prototype.anonymous;

import basic.prototype.framework.Product;

/**
 * java의 clone 메소드는 자신의 클래스(혹은 하위)에서만 호출할 수 있기때문에 다른 클래스의 요청으로 복제를 하는 경우
 * 아래와같이 createClone 메소드를 이용해서 clone을 기술
 *
 */
public class MessageBox implements Product {
	private char decochar;
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
