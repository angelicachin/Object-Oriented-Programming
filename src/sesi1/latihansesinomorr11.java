package sesi1;

public class latihansesinomorr11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 60 * 60 * 24 * 365;
		int birth = ((time/7) * 5);
		
		int death = (time/13) * 5;
		int newimmigrant = (time/45) * 5;
		
		System.out.print("The population is ");
		System.out.println(312032486 + birth - death + newimmigrant);
		
	}

}
