package kopattern.iterator;

// 요소들이 나열되어 있는 '집합체'
// 배열과 같이 요소들이 많이 모여있음
public interface Aggregate {
	public abstract Iterator iterator();
}
