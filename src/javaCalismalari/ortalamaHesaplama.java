package javaCalismalari;

import java.util.Scanner;

public class ortalamaHesaplama {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("lutfen ilk dersten aldiginiz sinav notunuzu giriniz: ");
		double sinav1 = kb.nextDouble();
		System.out.println("lutfen 2. dersten aldiginiz sinav notunuzu giriniz: ");
		double sinav2 = kb.nextDouble();
		System.out.println("lutfen 3. dersten aldiginiz sinav notunu giriniz:  ");
		double sinav3 = kb.nextDouble();
		double ortalama = (sinav1 + sinav2 + sinav3) / 3;
		if (ortalama >= 90) {
			System.out.println("A ile gectiniz tebrikler...");
		}

		else if (ortalama >= 80 && ortalama < 90) {
			System.out.println(" B ile gectiniz tebrikler ...");

		} else if (ortalama >= 70 && ortalama < 80) {
			System.out.println("C ile gectiniz tebrikler ...");
		} else if (ortalama >= 60 && ortalama < 70) {
			System.out.println("D ile gectiniz tebrikler... ");
		} else if (ortalama < 60) {
System.out.println("60 in altinda bir not ortalamasina sahip oldugunuz icin F aldiniz tekrar deneyiniz ...");
					
		}

	}

}
