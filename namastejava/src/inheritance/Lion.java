package inheritance;

public class Lion extends Animal {

	String name;

	Lion(int length, int breadth, String name) {
		super(length, breadth);
		this.name = name;
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
	
	private void showEverything() {
		System.out.println("Parent length-"+ length+ ", parent breadth-"+ breadth + ", child name"+ name );
	}

	public static void main(String[] args) {
		Lion l = new Lion(45, 56, "Rambo");
		l.roar();
		l.showEverything();
	}

}
