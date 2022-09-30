package sesi1;

public class latihansesi1nomor7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hasil1 = 0;
		double hasil2 = 0;
		for (int i = 1; i <= 11; i += 2) {
			if(i == 1) {
				hasil1 += 1.0;
			}
			else if(i == 3 || i == 7 || i == 11) {
				double bagi = i;
				hasil1 -= 1/bagi;
			}
			else {
				double bagi = i;
				hasil1 += 1/bagi;
			}
		}
		System.out.println(hasil1);
		
		for (int i = 1; i <= 13; i=i+2) {

			if(i == 1) {
				hasil2 += 1.0;
			}
			else if(i == 3 || i == 7 || i == 11) {
				double bagi = i;
				hasil2 -= 1/bagi;
			}
			else {
				double bagi = i;
				hasil2 += 1/bagi;
			}
		}
		System.out.println(hasil2);
		double phi1 = 4 * hasil1;
		double phi2 = 4 * hasil2;
		System.out.println("Phi 1 = " + phi1);
		System.out.println("Phi 2 = " +  phi2);
		
	}

}
