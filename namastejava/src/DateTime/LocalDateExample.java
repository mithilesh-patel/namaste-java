package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateExample {
	public static void main(String[] args) {
		LocalDate time1 = LocalDate.of(2015, Month.DECEMBER, 9);
		LocalDate time2 = LocalDate.of(2015, 05, 9);

		System.out.println("time1 -" + time1);
		System.out.println(time2);

//		Local Date Time
		System.out.println(LocalDateTime.now());
//		Local Time 
		System.out.println(LocalTime.now());

//		Adding 4 months in time1
//		time1 = time1.plusMonths(4);
		System.out.println("time1 after adding 4 months-" + time1.plusMonths(4));

		
	}
}
