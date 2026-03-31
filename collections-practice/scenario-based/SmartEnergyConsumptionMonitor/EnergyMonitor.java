package SmartEnergyConsumptionMonitor;
import java.util.*;
public class EnergyMonitor {
	private Map<Date,List<Double>> map;
	public EnergyMonitor() {
		map=new HashMap<>();
	}
	
	//add energy reading
	public void addReading(Date date,double reading) throws InvalidEnergyReadingException{
		if(reading<0) {
			throw new InvalidEnergyReadingException("Energy reading cannot be negative");
		}
		map.computeIfAbsent(date,d->new ArrayList<>()).add(reading);
	}
	//get daily average
	public double getDailyAverage(Date date) {
		List<Double> readings=map.get(date);
		if(readings==null || readings.isEmpty()) {
			return 0;
		}
		double avg=0;
		for(double r:readings) {
			avg+=r;
		}
		avg/=readings.size();
		return avg;
	}
	//calculate monthly income
	public double getMonthlyAverage(int month,int year) {
		double avg=0;
		int count=0;
		Calendar cal=Calendar.getInstance();
		for(Date date:map.keySet()) {
			cal.setTime(date);
			if(cal.get(Calendar.MONTH)==month && cal.get(Calendar.YEAR)==year) {
				for(double r:map.get(date)) {
					avg+=r;
					count+=1;
				}
			}
		}
		return count==0?count:avg/count;
	}
}
