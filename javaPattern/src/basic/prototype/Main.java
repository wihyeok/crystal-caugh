package basic.prototype;

import basic.prototype.framework.Product;
import basic.prototype.anonymous.MessageBox;
import basic.prototype.anonymous.UnderlinePen;
import basic.prototype.framework.Manager;

/**
 * 인스턴스를 작성할 때 new Something()이라는 식을 이용하여 반드시 new를 사용하여 클래스 이름을 지정해야함.
 *
 * Prototype 패턴
 *  - 이름을 지정하지 않고 인스턴스를 생성해야할 때가 있는 경우 클래스로부터 인스턴스를 만드는게 아닌 인스턴스를 복사해서 새로운 인스턴스를 생성
 *  - 1. 종류가 너무 많아 클래스로 정리되지 앟는 경우
 *  - 2. 클래스로부터 인스턴스 생성이 어려운 경우
 *  - 3. framework와 생성할 인스턴스를 분리하고 싶은 경우
 *
 *
 */
public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);

		Product p1 = manager.create("strong message");
		p1.use("Hello, world");
		Product p2 = manager.create("warning box");
		p2.use("Hello, world");
		Product p3 = manager.create("slash box");
		p3.use("Hello, world");

	}
}
