package khiPattern.mediator;


/**
 * 
 * 클래스를 단순화하는 패턴 중 facade패턴보다는 조금 클래스화된 패턴이라고 보면 될 것 같습니다.
 * 
 * 각각의 하위 클래스들은 중재역할을 하는 클래스에게 자신의 상태변화 및 보고등의 임무만하고 실제의 모든 처리는
 * 중재역할을 하는 클래스가 각 중개인에게 실제 업무를 지시(실행)하 실행합니다.
 * 이번장은 책에나온 예제도 괜찮으니 꼭 해보세요.
 * 
 * mediator 패턴은 다수의 오브젝트(객체) 사이를 조정해야할 경우 사용합니다.
 * 중재하는 클래스에서 모든 컨트롤을 한다는 것을 명심하세요.
 * 
 * 마지막으로 모든 패턴이 그러하고 모든 객체지향 프로그램에서 중요한 것.
 * 변경되는 것 변경되지 않는 것의 분리. 중요합니다.
 * 더 간단 명료하게 말하자면 관심사를 분리하는 것.
 * 이것이 객체지향이 가져야할 기본이며 나중에 배우게될 스프링의 기본원칙 중 한가지가 된다는 것을 기억해주세요.
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mediator userMediator = new UserMediator();
		
		Colleague user1 = new User("김혠");
		Colleague user2 = new User("선영");
		Colleague user3 = new User("현지");
		
		user1.setMediator(userMediator);
		user2.setMediator(userMediator);
		user3.setMediator(userMediator);
		
		userMediator.addColleague(user1);
		userMediator.addColleague(user2);
		userMediator.addColleague(user3);
	
		user1.setMsg("user1 이다");
		user1.send();
	}

}
