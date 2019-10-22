import java.time.*;

public class DateTimeOne extends MesoDateTimeOneAbstract {
	
	private LocalDateTime lt; //Makes a LocalDateTime object
	
	public DateTimeOne() {
		lt = LocalDateTime.now(); //Initializes lt to the current datetime
	}

	public int getValueOfSecond() {
		// TODO: Return the current time (the seconds part) on the computer
		return lt.getSecond();
	}

	public void sleepForFiveSec(){
		try {
		    Thread.sleep(5 * 1000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
	}

	public String dateTimeNow() {
		// TODO: Return the date and time currently
	}

	public String dateTimeOfOtherCity() {
		// TODO: Generate HashMap of Time zones in other cities, print output?
	}

	public String dateTimeDifferentZone() {
		// TODO: Generate HashMap of the time as it would be in other time zones
	}

	public String timeZoneHashMap() {
		// TODO: Add two more time zones, then print the time zones in 3 different
		// styles
	}

}