import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;
//TemporalAdjusters is a final class of static utility methods used to modify temporal objects (such as LocalDate).
//DayOfWeek is an enum of days of the week, that is, FRIDAY, TUESDAY

public class LocalDateExample
{
	public static void main(String[] args) {
    LocalDate now, bDate, nowPlusMonth, nextTues;
    now = LocalDate.now();
    System.out.println("Now: " + now);
    bDate = LocalDate.of(1995, 5, 23); // Java's Birthday
    System.out.println("Java's Bday: " + bDate);
    System.out.println("Is Java's Bday in the past? " + bDate.isBefore(now));
    System.out.println("Is Java's Bday in a leap year? " + bDate.isLeapYear());
    System.out.println("Java's Bday day of the week: " + bDate.getDayOfWeek());
    nowPlusMonth = now.plusMonths(1);
    System.out.println("The date a month from now: " + nowPlusMonth);
    nextTues = now.with(next(TUESDAY));
    System.out.println("Next Tuesday's date: " + nextTues);
	
	//System.out.println("\nNext Friday: "+now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
    //System.out.println("Previous Friday: "+now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
	}
}