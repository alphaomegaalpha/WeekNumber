import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WeekNumber {

	Date date;

	public WeekNumber(Date date) {
		this.date = date;
		}

	public int getWeekNumber() {
		Calendar calendar = new GregorianCalendar(); 
		calendar.setTime(this.date);     
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public Date getDate(Date date){
		return date;
	}
	
	

}
