package kopattern;

// 하나씩 나열하면서 요소에 대한 검색을 실행하는 인터페이스
// 다음 요소의 존재 여부에 대한 값을 조사하는 hasNext()
// 다음 요소를 얻기 위한 next(), Object 타입의 값 1개를 반환함
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
