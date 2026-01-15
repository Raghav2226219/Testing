package package_1;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class TC_010_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		Instant currenttime=Instant.now();
		
		System.out.println("Current Time: "+currenttime);
		System.out.println();
		
		LocalDate now = LocalDate.now();
		LocalDate Independence = LocalDate.of(1947, Month.AUGUST, 15);
		Period period = Independence.until(now);
		
		System.out.println("Now: " + now.format(formatter));
		System.out.println("Independence:"+Independence.format(formatter2));
		System.out.println();
		
		System.out.println("Now: "+ now);
		System.out.println("Independence: " + Independence);
		System.out.println("Tomorrow: " + now.plusDays(2));
		System.out.println("LastMonth: " + now.minusMonths(1));
		System.out.println("Leap Year: " + now.isLeapYear());
		System.out.println("Move to 30th day of month: " + now.withDayOfMonth(30));
		System.out.println();
		
		
		System.out.println("Period of Independence till now: " + period);
		System.out.println("Days: " + period.get(ChronoUnit.DAYS));
		System.out.println("Months: " + period.get(ChronoUnit.MONTHS));
		System.out.println("Years: " + period.get(ChronoUnit.YEARS));
		System.out.println();
		
		ZonedDateTime ct=ZonedDateTime.now();
		ZonedDateTime ct_in_paris=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		
		System.out.println("India Time:"+ct);
		System.out.println("Paris Time:"+ct_in_paris);
		System.out.println();
		
		
		
		}

}
