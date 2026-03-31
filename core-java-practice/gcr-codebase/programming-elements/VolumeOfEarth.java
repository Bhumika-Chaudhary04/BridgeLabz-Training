
public class VolumeOfEarth {
	public static void main(String[] args) {
		int radiusOfEarthInKm=6378;
//		volume of sphere is (4/3)*pi*r*r*r
		double volumeOfEarthInCublicKm=(4/3)*Math.PI*radiusOfEarthInKm*radiusOfEarthInKm*radiusOfEarthInKm; //volume in cubic km
		double volumeOfEarthINCubicMiles=volumeOfEarthInCublicKm*0.239913; //volume in cubic Miles
		
		System.out.println("The voulme of earth in cubic kilometers is "+volumeOfEarthInCublicKm+" and cubic miles is "+volumeOfEarthINCubicMiles);
	}

}
