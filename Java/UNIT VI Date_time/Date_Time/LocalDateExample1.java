import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
//ChronoUnit is an enum that holds time units, including HALF_DAYS, 
//HOURS, YEARS,WEEKS and MONTHS.


public class LocalDateExample1
{
	public static void main(String[] args) 
	{
		System.out.println("The date ISO Format is"+LocalDate.of(2015, 02, 20));
		System.out.println("The date ISO Format is"+LocalDate.parse("2015-02-20"));
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow is"+tomorrow);
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		LocalDate nextMonthSameDay = LocalDate.now().plus(1, ChronoUnit.MONTHS);
		System.out.println("The Previous Month Same Day is"+ previousMonthSameDay);
		System.out.println("The Next Month Same Day is"+nextMonthSameDay);
		boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
		System.out.println("Is the date before?"+ notBefore);
		boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
		System.out.println("Is the date after?"+ notBefore);
		/*LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
		System.out.println("Beginning of Day"+ beginningOfDay);
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First Day of Month"+ firstDayOfMonth);*/
	}
}