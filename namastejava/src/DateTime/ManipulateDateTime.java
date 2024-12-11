package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulateDateTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1997, 10, 27);
		LocalTime time = LocalTime.of(10,23,23, 0);
		
//		Combining Date and Time
		LocalDateTime dateTime1 = LocalDateTime.of(date, time);
		System.out.println(dateTime1);
		
		LocalDateTime dateTime2 = dateTime1.plusDays(5);
		System.out.println(dateTime2);
		System.out.println(dateTime2.plusHours(12));
		
	}
}
