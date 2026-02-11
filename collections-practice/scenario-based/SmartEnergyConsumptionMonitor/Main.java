package SmartEnergyConsumptionMonitor;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		EnergyMonitor monitor=new EnergyMonitor();
		try {
			Date today=new Date();
			monitor.addReading(today,2.5);
			monitor.addReading(today, 3.0);
			monitor.addReading(today, 1.5);
		    System.out.println("Daily Average : "+monitor.getDailyAverage(today));
			Calendar cal = Calendar.getInstance();
	        int month = cal.get(Calendar.MONTH);
	        int year = cal.get(Calendar.YEAR);
            System.out.println("Monthly Average: " +monitor.getMonthlyAverage(month, year));
		}
		catch(InvalidEnergyReadingException e) {
			System.out.println(e.getMessage());
		}
	}
}
