package polymorphism;

class Reptile{
	String getName() {
		return "Reptile";
	}
}


class Alligator extends Reptile{
	String getName() {
		return "Alligator";
	}
}


class Lizard extends Reptile{
	String getName() {
		return "Lizard";
	}
}

public class Zooworker {
	
	void feed(Reptile reptile) {
		System.out.println("I am a "+ reptile.getName());
	}

	public static void main(String[] args) {
		
		Zooworker z = new Zooworker();
		z.feed(new Reptile());
		z.feed(new Lizard());
		z.feed(new Alligator());		
		
	}
	
	
}
