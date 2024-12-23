package MethodEg;

public class InstanceCounter {
	
	static int countOfInstance;
	public InstanceCounter() {
		// TODO Auto-generated constructor stub
		countOfInstance++;
	}
	
	public static void main(String[] args) {
		InstanceCounter i1 = new InstanceCounter();
		InstanceCounter i2 = new InstanceCounter();
		InstanceCounter i3 = new InstanceCounter();
		InstanceCounter i4 = new InstanceCounter();
		InstanceCounter i5 = new InstanceCounter();
		InstanceCounter i6 = new InstanceCounter();
	
		System.out.println(countOfInstance );
		
	
	}
}
