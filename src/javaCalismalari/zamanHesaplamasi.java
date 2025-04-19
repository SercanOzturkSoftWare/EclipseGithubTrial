package javaCalismalari;

import java.util.Scanner;

public class zamanHesaplamasi {

	public static void main(String[] args) {
		// Saniye Cinsinden gorilen miktari saat dakika ve saniye cinsinden yazma 
		Scanner kb = new Scanner(System.in);

			System.out.println("lutfen saniye cinsinden bir deger giriniz: ");
			double saniye = kb.nextDouble();
			double kalan = 0;
			double kalanSaniye = 0;
			double saat = 0;
			double dakika = 0;
			if (saniye >= 3600) {
				saat = saniye / 3600;
				kalan = saniye - saat;
			} else if (kalan >= 60) {
				dakika = kalan / 60;
				kalanSaniye = saniye - dakika;
			}
			System.out.println(saniye + " =" + saat + " saat + " + dakika + " dakika " + kalanSaniye + " saniyedir.");

		
			
			
			
			
			
	}

}
