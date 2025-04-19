package javaCalismalari;

import java.util.Scanner;

public class tekCiftBelirleyicisi {

	public static void main(String[] args) {

		System.out.println("***GİRİLEN SAYININ TEK Mİ ÇİFT Mİ OLDUĞUNU BULMA PROGGRAMI***  ");
		Scanner kb = new Scanner(System.in);
		System.out.println("Dizinin Eleman Sayısını Giriniz: ");   
		int diziUzunluk = kb.nextInt();
   		kb.nextLine();// Enter karakterin boşa çıkarmaya yarar 
		
		int [] sayilar = new int[diziUzunluk];
	for (int i = 0; i < sayilar.length; i++) {
		System.out.print("Dizinin "+ i+ ".index degerini giriniz: ");
		sayilar[i]= kb.nextInt();
     	kb.nextLine();// Enter karakterşnş boşa çıkarmaya yarar
		
	}
	for (int deger : sayilar) {
		tekMiCiftMi (deger );
		
	}
		
	}
	public static void tekMiCiftMi (int sayi) {
		if (sayi%2==0) {
			System.out.println("Sayı: "+ sayi + " Çifttir.");
		}else {
			System.out.println("Sayı: "+ sayi + " Tektir.");
		}
	}
}
