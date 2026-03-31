package scenario_based;
public class TemperatureAnalyzer {
	// Method to analyze temperatures
	public static void analyzeTemperatures(float[][] temp) {
		int hottestDay=0;
		int coldestDay=0;
		float maxTemp=temp[0][0];
		float minTemp=temp[0][0];
		float[] dailyAverages=new float[7];
		for (int day=0;day<7;day++) {
			float sum=0;
			for (int hour=0;hour<24;hour++) {
				float currentTemp=temp[day][hour];
				sum+=currentTemp;
				// Check hottest temperature
				if (currentTemp>maxTemp) {
					maxTemp=currentTemp;
					hottestDay=day;
				}
				// Check coldest temperature
				if (currentTemp<minTemp) {
					minTemp=currentTemp;
					coldestDay=day;
				}
			}
			// Average temperature
			dailyAverages[day]=sum/24;
		}

		// Output results
		System.out.println("Hottest Day: Day " + (hottestDay + 1) + " with temperature " + maxTemp);
		System.out.println("Coldest Day: Day " + (coldestDay + 1) + " with temperature " + minTemp);
		System.out.println("\nAverage Temperature Per Day:");
		for (int i = 0; i < 7; i++) {
			System.out.println("Day " + (i + 1) + ": " + dailyAverages[i]);
		}
	}
	// Example usage
	public static void main(String[] args) {
		float[][] temperatures = new float[7][24];
		// Sample data (for demo)
		for (int i=0;i<7;i++) {
			for (int j=0;j<24;j++) {
				temperatures[i][j]=20+(float)(Math.random() * 15);
			}
		}
		analyzeTemperatures(temperatures);
	}
}
