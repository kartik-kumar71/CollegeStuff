import java.time.LocalTime;
import java.time.ZoneId;


public class LocalTime1 {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();
		System.out.println("Current Time="+time);

		LocalTime specificTime = LocalTime.of(8,30,35,720);
		System.out.println("Specific Time of Day="+specificTime);

		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST="+timeKolkata);

		LocalTime specificSecondTime = LocalTime.ofSecondOfDay(500);
		System.out.println("500th second time= "+specificSecondTime);

	}

}
