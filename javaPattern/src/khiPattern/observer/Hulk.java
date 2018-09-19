package khiPattern.observer;

public class Hulk implements Observer, Heros {

	
	public Hulk(){};
	public Hulk(Subject team) {
		System.out.println("헐크 합류");
		team.add(this);
	}
	
	
	@Override
	public void behavior(EnemyStatus stat) {
		// TODO Auto-generated method stub
		switch(stat){
			case NONE: System.out.println("헐크 : 대기중"); break;
			case APPEAR: System.out.println("헐크 : 헐크 변신"); break;
			case ATTACK: System.out.println("헐크 : 박사로 돌아감. 전투불가능  "); break;
			case DISAPPEAR: System.out.println("헐크 : 박사님으로 변신"); break;
		}
	}

	@Override
	public void update(EnemyStatus stat) {
		// TODO Auto-generated method stub
		this.behavior(stat);		
	}

	 
}
