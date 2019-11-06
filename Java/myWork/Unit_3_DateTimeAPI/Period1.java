import java.time.LocalDate;
import java.time.Period;

public class Period1 {

    public static void main(String a[]) {

        LocalDate presentTime = LocalDate.now();
        System.out.println("current date: "+presentTime);

        LocalDate dateAfter10Days = presentTime.plus(Period.ofDays(10));
        System.out.println("date after 10 days: "+dateAfter10Days);

        LocalDate dateBeforeWeek = presentTime.minus(Period.ofWeeks(3));
        System.out.println("date before 3 week: "+dateBeforeWeek);

        Period periodDiff = Period.between(dateBeforeWeek, dateAfter10Days);
        System.out.println("day difference: "+periodDiff.getDays());
        System.out.println("months difference: "+periodDiff.getMonths());
    }
}
