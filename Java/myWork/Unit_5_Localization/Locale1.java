import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Locale1{
  public static void main(String[] args) {
    LocalDateTime present = LocalDateTime.now();
    Locale locale = Locale.ITALY;
    DateTimeFormatter dt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(locale);
    System.out.println("Present date: "+present.format(dt)
    +" Local: "+locale.toString());
  }
}
