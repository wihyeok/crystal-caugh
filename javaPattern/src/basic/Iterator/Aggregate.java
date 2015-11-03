package basic.Iterator;

/**
* 집합체 인터페이스
* <desc>
* Agreegate(집합체) 역할
* 집합체를 하나씩 나열하고 검색, 조사하고 싶을 때
* iterator 메소드를 사용해서 Itorator인터페이스를 구현한 클래스의 인스턴스를 1개 만든다.
* </desc>
*/
public interface Aggregate {
	public abstract Iterator iterator();
}
