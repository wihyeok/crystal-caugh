package basic.flyweight;

import java.util.HashMap;

public class BigCharFactory {
	
	// 이미 만들어진 BigChar의 인스턴스를 관리
	private HashMap<String, BigChar> pool = new HashMap<String, BigChar>();
	
	private static BigCharFactory singleton = new BigCharFactory();
	
	private BigCharFactory() {
	}
	
	public static BigCharFactory getInstance() {
		return singleton;
	}
	
	public synchronized BigChar getBigChar(char charname) {
		BigChar bc = (BigChar) pool.get("" + charname);
		if (bc == null) {
			bc = new BigChar(charname);
			pool.put("" + charname, bc);
		}
		return bc;
	}

}
