package khiPattern.observer;

public class Ironman implements Observer, Heros{
	
	 
	public Ironman(){};
	public Ironman(Subject team){
		System.out.println("아이언맨 합류");
		team.add(this);
	}
	
	@Override
	public void behavior(EnemyStatus stat) {
		// TODO Auto-generated method stub
		switch(stat){
			case NONE: System.out.println("아이언맨 : 대기중"); break;
			case APPEAR: System.out.println("아이언맨 : 수트 착용"); break;
			case ATTACK: System.out.println("아이언맨 : 해킹당함. 전투불가능 "); break;
			case DISAPPEAR: System.out.println("아이언맨 : 수트 해제"); break;
		}
	}

	@Override
	public void update(EnemyStatus stat) {
		// TODO Auto-generated method stub
		this.behavior(stat);	
	}

}
