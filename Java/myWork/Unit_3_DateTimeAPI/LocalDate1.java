import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;


public class LocalDate1{

	public static void main(String[] args) {

		//Present Date
		LocalDate present = LocalDate.now();
		System.out.println("Current Date="+present);


		LocalDate day2k01 = LocalDate.of(2001, Month.JANUARY, 1);
		System.out.println("Specific Date="+day2k01);


		LocalDate presentKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Present Date in IST="+presentKolkata);

		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date= "+dateFromBase);

		LocalDate hundredDay2014 = LocalDate.ofYearDay(2002, 100);
		System.out.println("100th day of 2002="+hundredDay2014);
	}

}
