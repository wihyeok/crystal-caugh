package basic.prototype.framework;

import java.util.HashMap;

/**
 * Product나 Manager클래스의 소스에 MessageBox클래스나 UnderlinePen클래스의 클래스 이름이 전혀 언급되지 않음.
 * 이 두 클래스는 Product의 구현 클래스와는 독립적임을 나타내고 있음(수정해도 구현클래스와 독립적임).
 * 소스 안에 클래스의 이름을 쓰면 그 클래스와 밀접한 관계가 생김.
 *
 */
public class Manager {
	private HashMap<String, Product> showcase = new HashMap<String, Product>();
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	public Product create(String protoname) {
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}
}
