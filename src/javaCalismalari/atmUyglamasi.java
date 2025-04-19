package javaCalismalari;

import java.util.Scanner;

public class atmUyglamasi {

	public static void main(String[] args) {
              // Eksik Hali
		/*
		 * //Sercan Öztürk IBAN = TR1234 000 567 985 345 6572 2345 
		 * // sercanın kullanıcıadı ve şifresi = sercan55 --- 123 
		 * // Bilal Camur IBAN = TR6545 000 567 985 345 6572 3485 
		 *bilal 
		 // bilalin kullanıcı adı ve şifresı = bilal12 --- 658 
		 //bakiye görüntülemek için 1 i // para cekmek için 2 yi // farklı hesaba para
		 * yatırmak için 3 ü // uygulamadan çıkmak için q tuşuna basınız 
		 * 
		 * String islemSecenekleri= "Bakiye görüntüleme --->1" + "para çekme --->2"
		 * +"farklı hesaba para yatırmak--->3" + "çıkış için q ya basınız"; 
		 * Scanner kb =new Scanner(System.in); 
		 *  double bilalBakiye = 2450;
		 * String bilalIBAN ="TR6545 000 567 985 345 6572 3485"; 
		 * String bilalKUllanıcı= "bilal12"; 
		 *  StringbilalSifre= "123"; 
		 *  double sercanBakiye =3000; 
		 * String sercanIBAN="TR1234 000 567 985 345 6572 2345"; 
		 * String sercanKullanici= "sercan55";
		 * String sercanSifre = "456"; 
		 * System.out.println("ATM ye hoş geldiniz ");
		 * System.out.println("lütfen bilgilerinizi giriniz ");
		 * System.out.println("kullanıcı adı : "); 
		 * String kullaniciAdi= kb.nextLine();
		 * System.out.println("sifre: "); 
		 * String sifre= kb.nextLine(); 
		 * if(kullaniciAdi.equals("bilal12") && sifre.equals("123")) {
		 * System.out.println("Bilal Camur hesabına giriş yapıldı...");
		 * System.out.println(islemSecenekleri);
		 * System.out.println("lütfen bir seçim yapınız: "); 
		 * String secim =kb.nextLine(); switch(secim) { case"1":
		 * System.out.println("çekmek istediginiz tutarı giriniz: "); 
		 * int cekilecekTutar= kb.nextInt(); 
		 * if (bilalBakiye<=cekilecekTutar) { 
		 * bilalBakiye-=cekilecekTutar; System.out.println("kalan tutar: " + bilalBakiye); 
		 * } else {
		 * System.out.println("yetersiz bakiye ");
		 *  } break ;
		 *   case"3":
		 * System.out.println("yatırılacak tutarı girin : "); 
		 * int yatirilacakTutar =kb.nextInt(); 
		 * String yatırılacakiban = kb.nextLine(); 
		 * // yatırılacakIban; 
		 * if(yatırılacakiban.equals(sercanIBAN)) {
		 * System.out.println("para Sercan ÖztÜrk adlı kişiye yatırılıyor ...");
		 * bilalBakiye= yatirilacakTutar; 
		 * } 
		 * } 
		 * }
		 * 
		 */

		
		
		
		// Tamamlanmış Hali
		Scanner kb = new Scanner(System.in);

		double mertBakiye = 2450;
		String mertIBAN = "TR6545 000 567 985 345 6572 3485";
		String mertKullaniciAdi = "bilal12";
		String mertSifre = "01234";

		double sercanBakiye = 3000;
		String sercanIBAN = "TR1234 000 567 985 345 6572 2345";
		String sercanKullaniciAdi = "sercan55";
		String sercanSifre = "45678";

		System.out.println("ATM'ye hoş geldiniz!");
		System.out.println("Lütfen kullanıcı adı ve şifre bilgilerinizi giriniz.");

		System.out.print("Kullanıcı adı: ");
		String kullaniciAdi = kb.nextLine();

		System.out.print("Şifre: ");
		String sifre = kb.nextLine();

		if (kullaniciAdi.equals(mertKullaniciAdi) && sifre.equals(mertSifre)) {
			System.out.println("Bilal Çamur hesabına giriş yapıldı...");
			kullaniciIslemMenusu(kb, mertBakiye, sercanIBAN, sercanBakiye);
		} else if (kullaniciAdi.equals(sercanKullaniciAdi) && sifre.equals(sercanSifre)) {
			System.out.println("Sercan Öztürk hesabına giriş yapıldı...");
			kullaniciIslemMenusu(kb, sercanBakiye, mertIBAN, mertBakiye);
		} else {
			System.out.println("Hatalı kullanıcı adı veya şifre!");
		}

		kb.close();
	}

	public static void kullaniciIslemMenusu(Scanner kb, double bakiye, String digerHesapIBAN, double digerHesapBakiye) {
		String islemSecenekleri = """
				Bakiye görüntüleme ---> 1
				Para çekme ---> 2
				Farklı hesaba para yatırma ---> 3
				Çıkış yapmak için q'ya basınız
				""";

		while (true) {
			System.out.println(islemSecenekleri);
			System.out.print("Lütfen bir seçim yapınız: ");
			String secim = kb.nextLine();

			switch (secim) {
			case "1":
				System.out.println("Mevcut bakiye: " + bakiye + " TL");
				break;

			case "2":
				System.out.print("Çekmek istediğiniz tutarı giriniz: ");
				double cekilecekTutar = kb.nextDouble();
				kb.nextLine(); // Buffer'ı temizle
				if (bakiye >= cekilecekTutar) {
					bakiye -= cekilecekTutar;
					System.out.println("Tutar başarıyla çekildi. Kalan bakiye: " + bakiye + " TL");
				} else {
					System.out.println("Yetersiz bakiye!");
				}
				break;

			case "3":
				System.out.print("Yatırılacak tutarı girin: ");
				double yatirilacakTutar = kb.nextDouble();
				kb.nextLine(); // Buffer'ı temizle
				System.out.print("IBAN'ı girin: ");
				String girilenIBAN = kb.nextLine();
				if (girilenIBAN.equals(digerHesapIBAN)) {
					if (bakiye >= yatirilacakTutar) {
						bakiye -= yatirilacakTutar;
						digerHesapBakiye += yatirilacakTutar;
						System.out.println("Tutar başarıyla transfer edildi.");
					} else {
						System.out.println("Yetersiz bakiye!");
					}
				} else {
					System.out.println("Hatalı IBAN girdiniz!");
				}
				break;

			case "q":
				System.out.println("Çıkış yapılıyor. İyi günler dileriz!");
				return;

			default:
				System.out.println("Geçersiz seçim yaptınız.");
				break;
			}
		}
	}

}
