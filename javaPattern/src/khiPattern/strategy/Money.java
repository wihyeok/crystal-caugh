package khiPattern.strategy;

public abstract class  Money {

	private int bal;
	private Withdrawable withdrwable;
	


	public Money(int bal, Withdrawable withdrwable) {
		super();
		this.bal = bal;
		this.withdrwable = withdrwable;
	}

	public final Withdrawable getWithdrwable() {
		return withdrwable;
	}

	public final void setWithdrwable(Withdrawable withdrwable) {
		this.withdrwable = withdrwable;
	}

	public final int getBal() {
		return bal;
	}

	public final void setBal(int bal) {
		this.bal = bal;
	}

	
	public abstract void buy();
	
	
}
