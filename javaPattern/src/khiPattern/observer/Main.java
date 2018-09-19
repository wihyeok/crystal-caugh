package khiPattern.observer;


/**
*
* observer 패턴의 학습내용 및 추가적인 코멘트(질문 및 의견)들은 트렐로에 의견 남기기로 해요.
* 트렐로 확인하시고 패턴 남은 부분 학습하시면 될 것 같습니다~.
* 그게 더 히스토리도 그렇고 남을 것 같아요.
* 앞으로 학습하는 방식들은 점점 개선하겠지만 현재는 트렐로로 의견 나눠요~.
* 화이팅~
*
*
*
*
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avengers avengers = new Avengers();
		
		CaptainAmerica captainAmerica = new CaptainAmerica(avengers);
		Ironman ironman = new Ironman(avengers);
		Hulk hulk = new Hulk(avengers);
		
	
		System.out.println("======= 대기상태 ========");
		avengers.setStat(EnemyStatus.NONE);
	
		System.out.println("======= 빌런 등장 ========");
		avengers.setStat(EnemyStatus.APPEAR);
		
		System.out.println("======= 빌런 공격 ========");
		avengers.setStat(EnemyStatus.ATTACK);
		
		avengers.remove(ironman);
		
		System.out.println("======= 빌런 제거 ========");
		avengers.setStat(EnemyStatus.DISAPPEAR);
	}

}
