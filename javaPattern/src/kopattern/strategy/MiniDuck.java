package kopattern.strategy;

public class MiniDuck extends Duck {
    
    public MiniDuck(){
        iFlyBehavior = new FlyWithWings();
        iQuackBehavior = new Quack();
    }
     
    @Override
    public void display() {
        System.out.println("작은오리");
    }
 
}
