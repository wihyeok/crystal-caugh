package kopattern.strategy;

public class CannotFly implements IFlyBehavior{
	 
    @Override
    public void fly() {
        System.out.println("날지못해요");
    }
 
}
