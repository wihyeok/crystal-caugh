package kopattern.strategy;

public class ModelDuck extends Duck{
	 
    public ModelDuck(){
        iFlyBehavior = new CannotFly(); 
        iQuackBehavior = new Quaaaak(); 
    }
     
    @Override
    public void display() {
        System.out.println("모형오리");
    }
     
}
