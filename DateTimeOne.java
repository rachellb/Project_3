import java.util.concurrent.TimeUnit;

public class DateTimeOne extends MesoDateTimeOneAbstract {
	
	public DateTimeOne() {
		
	}

	public int getValueOfSecond() {
		// TODO: Return the current time (the seconds part) on the computer
		
	}

	public void sleepForFiveSec(){
		// TODO: Sleep program for 5 seconds?
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