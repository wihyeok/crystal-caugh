package khiPattern;

public class BBcream extends Cosmetic{

	
	private int bright;
	private String name;
	
 	
	public BBcream(String name,int bright) {
		super();
		System.out.println(bright+"호의 \""+name+"\"비비크림을 제조합니다");
		this.name = name;
		this.bright = bright;
	}

	
	public int getBright() {
		return bright;
	}


	public void setBright(int bright) {
		this.bright = bright;
	}

	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "BBcream";
	}

	
	public void info() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ" );
		System.out.println("종류 : "+getType());
		System.out.println("이름 : "+name);
		System.out.println("색상 : "+bright +"호");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ" );
	}
}
