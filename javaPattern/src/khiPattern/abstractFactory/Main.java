package khiPattern.abstractFactory;

/**
 * 
 * 팩토리 메서드 패턴 : 객체 생성을 위한 인터페이스를 정의하고 이를 상속한 서브 클래스를 이용하여 객체를 생성합니다. 즉 객체를 만드는 것을 서브 클래스에게 맡기는 것입니다. 
 * 추상 팩토리 패턴 : 인터페이스를 이용해 서브 클래스를 거치지 않고도 서로 연관된 객체를 생성합니다.
 * 
 * 차이점: 두 가지 패턴 모두 객체를 생성하는 일을 하지만 팩토리 메서드 패턴은 상속을 이용하여 객체를 생성하고 추상 팩토리 패턴은 객체 구성을 이용하여 객체를 생성합니다.
 * 
 * 이 패턴도 마찬가지로 변하는 것과 변하지 않는 것을 분리해내는 것이 가장 중요합니다.
 * 패턴학습할 때 그리고 공통 혹은 개발하실 때 패턴화(컴포넌트화)하실 때 항상 머리속에 꼭 그려보면서 개발하시기 바랍니다.
 * 
 * abstract factory 패턴을 사용
 *  추상 팩토리는 객체 생성 로직을 효과적으로 감추는 패턴입니다.
 *  객체 생성 로직이 복잡할수록 팩토리를 거쳐 객체를 생성하는 편이 로직을 개발하는데 실수도 적어지고 간결하게 됩니다.
 *  일관된 방향으로 객체를 생성하고 생성 자체를 통제해야 할 경우 팩토리 패턴을 고려하는 편이 좋습니다.
 *  정리하자면 다음과 같은 경우 추상 팩토리 패턴을 사용하시면 됩니다.
 *  1. 객체들이 함께 사용되도록 설계되어있고, 이 부분에 대한 제약(틀)을 만들고 싶을 때
 *  2. 제품에 대한 클래스 라이브러리를 제공하고 구현 내용을 노출시키고 싶지 않을 때
 *  3. 한번 구성한 제품을 다른 것으로 대체할 수 있어야 할 때
 *  
 * abstract factory 패턴의 장점
 * 1. 하나의 기본 형태에 대해 굉장히 다양한 서브 클래스를 제공해야 할 때 매우 유용하다.
 * 2. 구체적인 클래스가 분리되어 사용자 코드에는 나타나지 않기 때문에 보안에 유리하다.
 * 3. 클래스명 대신 팩토리 메서드를 사용하여 객체를 생성하기 때문에 추후 실제 생성되는 객체가 바뀌거나 추가되어도 문제가 없다.
 * 4. 리소스 재활용성 - 팩토리 메서드가 반드시 객체를 생성할 필요는 없고 상황에 따라서 새로 생성하거나 기존의 것을 리턴할 수 있다.
 * 
 * 여기까지가 추상 팩토리 패턴의 정리입니다.
 * 내일은 쉽게 이해가 될만한 예를 올리겠습니다.
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Monitor lgmonitor = ComputerFactory.make
		Monitor lgmonitor = ComputerFactory.getMonitor(new LGComputerFactory("gram monitor", "200,000"));
		Speaker lgspeaker = ComputerFactory.getSpeaker(new LGComputerFactory("gram speaker", "60,000"));
		
		System.out.println(lgmonitor.toString());
		System.out.println(lgspeaker.toString());
		
		
		Computer lgCom = new LGcomputer();
		lgCom.setMonitor(lgmonitor);
		lgCom.setSpeaker(lgspeaker);
		lgCom.setHasSSD(true);
		
		System.out.println(lgCom.toString());
		
		Monitor samsungmonitor = ComputerFactory.getMonitor(new SamsungComputerFactory("gram monitor", "200,000"));
		Speaker samsungspeaker = ComputerFactory.getSpeaker(new SamsungComputerFactory("gram speaker", "60,000"));
		
		System.out.println(lgmonitor.toString());
		System.out.println(lgspeaker.toString());
		
		
		Computer samsungCom = new SamsungComputer();
		samsungCom.setMonitor(samsungmonitor);
		samsungCom.setSpeaker(samsungspeaker);
		samsungCom.setHasSSD(true);
		
		System.out.println(samsungCom.toString());
		
		
		
	}

}
