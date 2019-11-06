import java.time.Duration;
import java.time.LocalTime;

public class Duration1 {

    public static void main(String a[]) {
        LocalTime givenTime = LocalTime.of(2, 30, 15);
        System.out.println("time: "+givenTime);

        LocalTime updatedTime = givenTime.plus(Duration.ofMinutes(20)).plus(Duration.ofSeconds(30));
        System.out.println("updated time: "+updatedTime);

        Duration drt = Duration.between(givenTime, updatedTime);
        System.out.println("difference in seconds: "+drt.getSeconds());
        System.out.println("difference in seconds: "+drt.toMinutes());
    }
}
