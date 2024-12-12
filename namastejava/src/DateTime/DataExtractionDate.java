package DateTime;

import java.time.LocalDate;

public class DataExtractionDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1997, 10, 27);
		
		System.out.println(date.getDayOfMonth());
		
	}
}
