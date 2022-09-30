package sesi1;

public class latihansesinomorr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double time = 45.5;
		double timeInHour = time/60;
		
		double distance = 14;
		double distanceInMiles = distance * 1.6;
		
		double speedInMilesPerHour = distanceInMiles/timeInHour;
		System.out.printf("Thus, the average speed of the runner in miles per hour is %.2f", speedInMilesPerHour);
	}

}
