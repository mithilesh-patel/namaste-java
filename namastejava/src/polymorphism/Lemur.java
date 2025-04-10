package polymorphism;


class Primate{
	void hasHair(){
		System.out.println("Yes primate has a hair");
	}
}

interface HasTail {
	public boolean isTailStriped();
}


public class Lemur extends Primate implements HasTail{
	@Override
	public boolean isTailStriped() {
		return false;
	}
	
	void sleepingOnTrees() {
		System.out.println("This is Lemur specific method");
	}
	
	
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		lemur.hasHair();
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		
		Primate p = new Lemur();
		Lemur l3 = (Lemur)p;  // Downcasting happening here
		l3.sleepingOnTrees();
	}
}
