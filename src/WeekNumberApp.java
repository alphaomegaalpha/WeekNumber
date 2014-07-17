import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WeekNumberApp {

	public WeekNumberApp() {
		
	}

	public static void main(String[] args) throws ParseException {

		Console c = System.console();

		if (c == null) {
			System.err.println("No console.");
			System.exit(1);
		}
		
		String sDate = c
				.readLine("Please type in date in format 'YYYY-MM-DD': ");
		
		Date dDate = new SimpleDateFormat("y-M-d", Locale.ENGLISH).parse(sDate);
		WeekNumber weekNumber = new WeekNumber(dDate);
		int wn = weekNumber.getWeekNumber();
		System.out.println(Integer.toString(wn));
	}

}
