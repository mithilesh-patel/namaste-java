package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.of(1997,12,10,16,23,23);
		System.out.println(datetime);
		System.out.println(datetime.format(DateTimeFormatter.ISO_TIME));
		
//		MMMM - Month
//		dd - Day
//		yyyy - Year
//		hh - hour
//		mm minutes
//		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, MMMM, hh:mm");
		System.out.println(datetime.format(f)); 
	}
}
