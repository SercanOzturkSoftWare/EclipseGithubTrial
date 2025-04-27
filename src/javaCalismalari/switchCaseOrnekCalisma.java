package javaCalismalari;

import java.util.Scanner;

public class switchCaseOrnekCalisma {

	public static void main(String[] args) {
		       // Haftanın Günleri
		Scanner kb = new Scanner(System.in);
		System.out.println("lütfen bir tam sayı değeri giriniz: ");
		int girilenDeger = kb.nextInt();// kullanıcıdan alınan değeri sayi degişkenine atadık
	
		// Kullanici 1-7 arasinda deger girene kadar devam et
        while (girilenDeger < 1 || girilenDeger > 7) {
            System.out.println("Girmis oldugunuz deger gecersizdir, lutfen 1 ile 7 arasinda bir tam sayi giriniz...");
            girilenDeger = kb.nextInt();
        }
		
		switch (girilenDeger) {// sayı degiskenini switch e atadık ve burada altta bulunan case blokları 
						//ile kıyaslama yapacak
		case 1:
			System.out.println("pazartesi");
			break;

		case 2:
			System.out.println("salı");
			break;

		case 3:
			System.out.println("carsamba");
			break;

		case 4:
			System.out.println("persembe");
			break;

		case 5:
			System.out.println("cuma");
			break;

		case 6:
			System.out.println("cumartesi");
			break;

		case 7:
			System.out.println("pazar");
			break ;
		//default:
		//	System.out.println("Girmiş Olduğnuz Değerin 1-7 Arasında Bir Tam Sayı Değeri Olması Gerekmektedir. Lütfen Yeniden Giriniz :) ");
		}
		/*
		 * switch in icine girmiş oldugun sayı degeri hicbir case blogunda
		 * bulunmuyorsa(yani çalıştırmazsa) default anahtar kelimesi ile defaultun
		 * altındaki syso çalışır
		 *ama biz while dongusu kullandigimiz icin bunu yapmamiza gerek kalmadi
		 *while dongusu ile girilenDeger 1 ile 7 arasinda olana kadar basa sarmis oluruz 
		 */

	}

}
