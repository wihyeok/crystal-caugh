package basic.adapter;

/**
* 왜 Adapter패턴을 사용하는가?
* Adapter패턴은 기존의 클래스를 개조해서 필요한 클래스를 만드는 프로그래밍.
* 검증된(테스트를 이미 마친) 프로그램에 추가적인 프로그램을 하여 발빠르게 만들 수 있음.
* 만약 버그가 발생해도 Adpater 역할의 클래스를 중심으로 디버깅이 쉬워짐.
* FileIo.java, FileIOMain.java 의 연습문제를 꼭 풀이하여 Adapter패턴이 필요성을 숙지.
* 관련패턴 :
* Bridge - Adapter 패턴은 인터페이스(API)가 서로 다른 클래스들을 연결하는 패턴.
* Bridge 패턴은 기능의 계층과 구현의 계층을 연결시키는 패턴.
* Decorator - Adapter 패턴은 인터페이스(API)의 차이를 조정하기 위한 패턴.
* Decorator 패턴은 인터페이스(API)를 수정하지 않고 기능을 추가하는 패턴.
*/
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();
		AbPrint ap = new AbPrintBanner("Hi there");
		ap.printStrong();
		ap.printWeak();
	}
}
