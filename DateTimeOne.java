import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map.Entry;

public class DateTimeOne extends MesoDateTimeOneAbstract {
	
	private LocalDateTime lt; //Variable for LocalDateTime object
	private LocalDateTime GMT; //Variable for GMT time object
	private LocalDateTime BST; //Variable for BST time object
	private static HashMap<String, String> TIME_ZONES;
	
	
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
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm"); //Formats given time into HH:mm style
		String formatDateTime = lt.format(formatter); 
		System.out.println("Time on Server: " + formatDateTime);
		
		GMT = lt.plusHours(5); //Add 5 hours to server time for GMT
		formatDateTime = GMT.format(formatter); 
		System.out.println("GMT: " + formatDateTime);
		
		BST = GMT.plusHours(6); //Add 6 hours for to GMT for BST
		formatDateTime = BST.format(formatter);
		System.out.println("BST (90E): " + formatDateTime);
		
		formatDateTime = lt.format(formatter); //Keep the server time for CST 
		System.out.println("CST (90W): " + formatDateTime);
		
	}

	public void dateTimeDifferentZone() {
		// TODO: Generate HashMap of the time as it would be in other time zones
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy HH:mm"); //Formats given time 
		String formatDateTime = lt.format(formatter); 
		String formatDateTimeGMT = GMT.format(formatter); 
		String formatDateTimeBST = BST.format(formatter);
		
		TIME_ZONES.put("GMT", formatDateTime); 
		TIME_ZONES.put("BST", formatDateTimeGMT);
		TIME_ZONES.put("CST", formatDateTimeBST);
		
		for (Entry<String, String> entry : TIME_ZONES.entrySet()) { //Prints the contents of the TIME_ZONES HashMap
		    System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

	public void timeZoneHashMap() {
		// TODO: Add two more time zones, then print the time zones in 3 different
		// styles
	}

}