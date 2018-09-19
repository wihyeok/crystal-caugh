package khiPattern.observer;

public class CaptainAmerica implements Observer, Heros{

	
	public CaptainAmerica(){};
	public CaptainAmerica(Subject team){
		System.out.println("캡틴 합류");
		team.add(this);
	}
	@Override
	public void behavior(EnemyStatus stat) {
		// TODO Auto-generated method stub
		switch(stat){
		case NONE: System.out.println("캡틴 : 대기중"); break;
		case APPEAR: System.out.println("캡틴 : 방패 착용"); break;
		case ATTACK: System.out.println("캡틴 : 방패없음. 전투불가능 "); break;
		case DISAPPEAR: System.out.println("캡틴 : 방패 해제"); break;
	}
	}

	@Override
	public void update(EnemyStatus stat) {
		// TODO Auto-generated method stub
		this.behavior(stat);
	}

	
}
