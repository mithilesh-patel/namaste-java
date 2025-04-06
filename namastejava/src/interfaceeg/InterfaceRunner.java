package interfaceeg;

public class InterfaceRunner implements Flyable {
	
	public void fly() {
		System.out.println("Hey i can fly");
	}
	
	public void canIRun() {
		System.out.println("Yes Bro u can run");
	}
	
	public static void main(String[] args) {
		
		InterfaceRunner Parrot = new InterfaceRunner();
		Parrot.fly();
		System.out.println(Flyable.speed);
		Parrot.canIRun();
	}

}
