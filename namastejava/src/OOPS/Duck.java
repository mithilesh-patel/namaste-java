package OOPS;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks swim, even decoys");
	}
	
    public void display() {}
	
    public void setFlyBehavior(FlyBehavior fb){
    	flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior fb){
    	quackBehavior = fb;
    }
}
