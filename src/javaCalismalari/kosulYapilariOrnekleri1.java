package javaCalismalari;

import java.util.Scanner;

public class kosulYapilariOrnekleri1 {

	public static void main(String[] args) {
		// öğrencinin adını, soyadını, dersin adı , vize1 ve final notlarıını girip
		// dersi geçip geçmediğini bulalım
		// geçme notu sınırı 60 olacak vizenin %40 ı ve finalin %60 ı alınacak
		Scanner giriniz = new Scanner(System.in);
		System.out.println("Lütfen Adınızı Giriniz: ");
		String isim = giriniz.nextLine();
		System.out.println("Lütfen Soy Adınızı Giriniz: ");
		String soyİsim = giriniz.nextLine();
		System.out.println("Lütfen Ortalaması Hesaplanacak Dersin Adını Giriniz : ");
		String dersAdi = giriniz.nextLine();
		System.out.println("Lütfen Vize Sınavıdan Aldığınız Notu Giriniz:  ");
		double vizeNot = giriniz.nextDouble();
		System.out.println("Lütfen Final Sınavından Aldığınız Notu Giriniz: ");
		double finalNot = giriniz.nextDouble();
		double gecmeNotu = 60;
		double ortalama = vizeNot *0.4 + finalNot * 0.6;
		if (ortalama < gecmeNotu) {
			System.out.println(isim + " Adlı Öğrencimiz " + dersAdi + " Dersinden " + ortalama
					+ " Not Ortalaması Sebebiye kalmıştır. ");
		} else {
			System.out.println(isim + " Adlı Öğrencimiz " + dersAdi + " Dersini " + ortalama
					+ "Not Ortalaması ile Geçmiştir Tebrik Ederiz :)");
		}

	}

}
