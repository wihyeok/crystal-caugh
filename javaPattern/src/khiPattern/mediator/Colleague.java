package khiPattern.mediator;

public abstract class Colleague {

	private Mediator mediator;
	protected String name;
	private String msg;
	
	
	
	
	public Colleague(String name) {
		super();
		this.name = name;
	}

	public final Mediator getMediator() {
		return mediator;
	}

	public final void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getMsg() {
		return msg;
	}

	public final void setMsg(String msg) {
		this.msg = msg;
	}

	public void send() {
		System.out.println(this.name+"이 보냄");
		mediator.mediate(this);
	
	}
	
	public abstract void receive(Colleague colleague);
}
