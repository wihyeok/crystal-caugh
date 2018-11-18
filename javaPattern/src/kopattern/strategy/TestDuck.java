package kopattern.strategy;

public class TestDuck {
	 
    public static void main(String[] args) {
        // 작은오리
        Duck miniDuck = new MiniDuck();
        miniDuck.display();
        miniDuck.performFly();
        miniDuck.performQuack();
         
        System.out.println();
         
        // 모형오리
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        
        // 모형오리가 날수 있게 수정
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
         
    }
 
}
