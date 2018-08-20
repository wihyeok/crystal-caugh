package basic.flyweight;

import java.util.StringTokenizer;

public class TokenString {
	private BigChar[] bigChars;
	public TokenString(String string) {
		StringTokenizer st = new StringTokenizer(string, "-");
		System.out.println(st.countTokens());
		bigChars = new BigChar[st.countTokens()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for (int i = 0; i < bigChars.length; i++) {
			String tkString = st.nextToken();
			if (tkString != null && !"".equals(tkString.trim())) {
				bigChars[i] = factory.getBigChar(tkString.charAt(0));
			} else {
				bigChars[i] = null;
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < bigChars.length; i++) {
			bigChars[i].print();
		}
	}
	
	public BigChar getBigChar(int index) {
		if (bigChars.length > index) {
			return bigChars[index];
		} else {
			return null;
		}
	}

}
