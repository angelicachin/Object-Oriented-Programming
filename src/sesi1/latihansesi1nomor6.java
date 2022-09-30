package sesi1;

public class latihansesi1nomor6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
		int awal = 1;
        int akhir = 9;
        int total = 0;
        
        while (awal <= akhir){
        	total += awal;
        	awal++;
        }
        
        System.out.println(total);
	}

}
