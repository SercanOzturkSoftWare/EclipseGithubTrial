package javaCalismalari;

import java.util.Scanner;

public class basitHesapMakinesi {

	public static void main(String[] args) {
		Scanner yapilis = new Scanner(System.in);
		System.out.println("lutfen islem icin birinci sayi degerini giriniz: ");
		double sayi1 = yapilis.nextDouble();
		System.out.println("lutfen yapilacak islem icin ikinci sayi degerini giriniz: ");
		double sayi2 = yapilis.nextDouble();
		System.out.println("yapilacak islem turu icin 1, 2, 3, 4  rakamlardan  birini giriniz: ");
		int islem = yapilis.nextInt();

		switch (islem) {
		case 1:
			System.out.println(sayi1 + sayi2);
			break;
		case 2:
			System.out.println(sayi1-sayi2);
			break;
		case 3:
			System.out.println(sayi1*sayi2);
			break;
		case 4 :
			System.out.println(sayi1/sayi2);

default:

		}
		
		
		
		/* İkinci Bir Yol
		 * 
		Scanner kb = new Scanner(System.in);
		System.out.println("lutfen Ilk sayi degerini giriniz: ");
		double sayi1 = kb.nextDouble();
		System.out.println("Lutfen islem icin 2. sayi degerinizi giriniz : ");
		double sayi2 = kb.nextDouble();
		System.out.println(" yapmak istediginiz islemi belirtilen islem numaralarindan birini girerek seciniz :");
		System.out.println(" toplama icin 1`i , ");
		System.out.println(" cikarma islemi icin 2 ` yi,");
		System.out.println(" carpma islemi icin 3` u, ");
		System.out.println(" bolme islemi icin 4`u seciniz ...");
		int islem = kb.nextInt();
	if (islem>=5) {
			System.out.println("gecersiz deger ...");
		}	
	switch (islem) {
		case 1: {
			System.out.println(sayi1 + sayi2);
			break;
		}
		case 2: {
			System.out.println(sayi1 - sayi2);
			break;
		}
		case 3: {
			System.out.println(sayi1 * sayi2);
			break;
		}
		case 4: {
			System.out.println(sayi1 / sayi2);
			break;
		}
		}

		 
		 */

	}

}
