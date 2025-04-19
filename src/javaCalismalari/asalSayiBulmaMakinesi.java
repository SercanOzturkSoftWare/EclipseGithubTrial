package javaCalismalari;

import java.util.Scanner;

public class asalSayiBulmaMakinesi {

	public static void main(String[] args) {
		// bir sayının asal olup olmadığını kendinden kucuk butun sayılara bolerek anlıyouz bu kodda 1 e bolmek
				// harıc cunku her sayı 1 e bolunur o yuzden 2 den baslattık
		System.out.println("Asal Sayı Bulma Uygulamasına Hoş Geldiniz :)");
		System.out.println("***********************************************");

		int asalToplam = 0;
		int asalOlmayanToplam = 0;

		String asalSayilar = "";
		String asalOlmayanSayilar = "";

		boolean asalMi = false;

		Scanner kb = new Scanner(System.in);

		System.out.println("Dizinin Eleman Sayısını Giriniz: ");

		int diziUzunluk = kb.nextInt();
		kb.nextLine(); // enter karakterini boşa çıkarmak için yapıldı
		int[] sayilar = new int[diziUzunluk];// kullanıcının verdıgı uzunluk kadar bir dizi tanımlandı
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println("Dizinin " + i + ". index değerini giriniz: ");
			sayilar[i] = kb.nextInt();
			kb.nextLine();

		}
		for (int sayi : sayilar) {
			for (int j = 2; j < sayi; j++) {

				if (sayi % j == 0) {
					asalOlmayanToplam += 1;
					asalOlmayanSayilar += String.valueOf(sayi) + " ";
					break;
				} else {
					asalMi = true;
				}
			}
			if (asalMi) {
				asalToplam += 1;
				asalSayilar += String.valueOf(sayi) + " ";
				asalMi = false;
			}
		}
		System.out.println("Asal Sayıların Bilgileri ");
		System.out.println("Girilen Asal Sayıların Toplam Adedi = " + asalToplam + " Asal Sayilar = " + asalSayilar);

		System.out.println("*******************************************");

		System.out.println("Asal Olmayan Sayıların Bilgileri");
		System.out.println("Girilen Asal Olmayan Sayıların Toplamı = " + asalOlmayanToplam + " Asal Olmayan Sayilar = "
				+ asalOlmayanSayilar);

	}

}
