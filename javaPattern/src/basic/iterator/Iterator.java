package basic.iterator;

/**
* Iterator 인터페이스
* <desc>
* Iterator(반복자) 역할
* 요소를 하나씩 나열하면서 루프 변수와 같은 역할을 수행하는 인터페이스
* </desc>
*/
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
