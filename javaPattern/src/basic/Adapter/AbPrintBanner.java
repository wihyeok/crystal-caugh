package basic.Adapter;

/**
* 위임을 사용한 Adapter 패턴
* AbBanner를 구현하되 Banner를 인스턴스로 생성하여 실제 구현을 위임하고있음.
*/
public class AbPrintBanner extends AbPrint {
	private Banner banner;
	public AbPrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
	
}
