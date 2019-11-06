import java.time.Duration;
import java.time.Instant;

public class Instant1 {

	public static void main(String[] args) {

		Instant timestamp = Instant.now();
		System.out.println("Current Timestamp = "+timestamp);

		Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
		System.out.println("Specific Time = "+specificTime);

		Duration thirtyDay = Duration.ofDays(30);
		System.out.println(thirtyDay);
	}

}
