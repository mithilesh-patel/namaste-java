package DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodsExample {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2005, 1, 10);
		LocalDate date2 = LocalDate.of(2005, 10, 23);
		Period diff = Period.between(date1, date2);
		System.out.println("Years - " + diff.getYears()+ "- Months- "+ diff.getMonths()+ 
				" days "+ diff.getDays());
		
		LocalTime time1 = LocalTime.of(12, 32, 15);
		LocalTime time2 = LocalTime.of(17, 30, 45);
		
		Duration dura = Duration.between(time1, time2);
		
		System.out.println("Duration is "+ dura.toHours()+ " Hours "+ dura.toMinutes()+ " Minutes "
				+ dura.toSeconds()+ "seconds");
		
	}
}
