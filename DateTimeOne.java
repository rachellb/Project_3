import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeOne extends MesoDateTimeOneAbstract {
	
	private LocalDateTime lt; //Makes a LocalDateTime object
	
	public DateTimeOne() {
		lt = LocalDateTime.now(); //Initializes lt to the current datetime
	}

	public int getValueOfSecond() {
		//Return the current time (the seconds part) on the computer
		return lt.getSecond();
	}

	public void sleepForFiveSec(){
		try {
		    Thread.sleep(5 * 1000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
	}

	public void dateTimeNow() {
		//Return the date and time currently
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a"); //Check that this is true
		String formatDateTime = lt.format(formatter);
		String strng = "Current Date/Time: " + formatDateTime;
		System.out.println(strng);
	}

	public void dateTimeOfOtherCity() {
		// TODO: Generate HashMap of Time zones in other cities, print output?
		
	}

	public void dateTimeDifferentZone() {
		// TODO: Generate HashMap of the time as it would be in other time zones
	}

	public void timeZoneHashMap() {
		// TODO: Add two more time zones, then print the time zones in 3 different
		// styles
	}

}