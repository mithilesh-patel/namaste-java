package OOPS;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyWithWings();
	}
	
	
	public void display() {
		System.out.println("I am a real Mallard duck");
	}
}
