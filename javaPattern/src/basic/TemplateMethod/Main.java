package basic.TemplateMethod;

/**
* AbstractClass(추상 클래스) 역할 : 
* AbstractDisplay 클래스가 템플릿 메소드를 구현
* ConcreteClass(구현 클래스) 역할 :
* CharDisplay, StringDisplay 클래스가 AbstractClass 클래스에 정의되어있는 추상메소드를 구현
*
* 특징
* 1. 로직의 공통화
* 2. 상위 클래스와 하위 클래스의 긴밀한 연계
* 3. 하위 클래스를 상위 클래스와 동일시한다.
* - "상위 클래스형의 변수에 하위 클래스의 어떠한 인스턴스를 대입해도 제대로 작동할 수 있도록 한다."
* - The Liskov Substitution Principle(LSP)
* - LSP는 Template Method 패턴에 국한되지 않는 상속의 일반적인 원칙
*
* 관련 패턴
* Factory Method :
* Template Method 패턴을 인스턴스 생성에 응용한 전형적인 예가 Factory Method 패턴
* Strategy 패턴 :
* Template Method 패턴에서는 '상속'을 이용해서 프로그램의 동작을 변경
* Strategy 패턴은 '위임'을 이용해서 프로그램의 동작을 변경
* 프로그램의 일부분을 변경하기 보다는 알고리즘 전체를 완전히 바꿈
*
*/
public class Main {
	
	public static void main(String[] args) {
		/* CharDisplay instance */
		AbstractDisplay d1 = new CharDisplay('H');
		/* StringDisplay instance */
		AbstractDisplay d2 = new StringDisplay("Hello world");
		AbstractDisplay d3 = new StringDisplay("안녕하세요.");
		
		/*
		* d1, d2, d3 모두 AbstractDisplay의 하위 클래스의 인스턴스기때문에
		* display 메소드 호출할 수 있다.
		* 실제 동작은 CharDisplay나 StringDisplay에서 결정한다.
		*/
		d1.display();
		d2.display();
		d3.display();
	}
}
