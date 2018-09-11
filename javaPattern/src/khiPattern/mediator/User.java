package khiPattern.mediator;

public class User extends Colleague{

	
	public User(String name) {
		super(name);
	}
	
	@Override
	public void receive(Colleague colleague) {
		// TODO Auto-generated method stub
		System.out.println(getName()+"님에게 도착한 " + colleague.getName() + "의 메세지 : " + colleague.getMsg());
	}
	
	

}
