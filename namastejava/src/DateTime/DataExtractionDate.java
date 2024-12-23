package DateTime;

import java.time.LocalDate;

public class DataExtractionDate {

	public static void StaticMethodEg() {
		System.out.println("This is example of Static imports");
	}
	
	public void InstanceMethod() {
		System.out.println("This is example of Instance imports");
		
	}

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(1997, 10, 27);

		System.out.println(date.getDayOfMonth());

	}
}
