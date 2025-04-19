package javaCalismalari;

public class kosulYapilariOrnekleri2 {

	public static void main(String[] args) {
		/*
		 * Bir kuru yemişçi toptancıdan ; 12 kilo leblebiyi kilosunu 3,5 TL 25 kilo
		 * fındığı , kilosunu 15,7 TL den 40 kilo bademin , kilosunu 22 TL den almıştır
		 * 
		 * bu ürünleri satarken , --> Leblebinin kilosunu %50 fazlasından satmış -->
		 * Fındığı ise , %40 fazlasına satmış --> Bademi ise , %60 fazlasına satmıştır
		 * kuru yemişçi o günkü kazandığı para ile dükkanının kirasını ödemek istemiştir
		 * kira tutarı = 500 TL kazandığı para 500 TL den yüksek ise kirayı ödeyebilsin
		 * değil ise kirayı ödeyemesin ...
		 */

		// fiyatlar
		
		
		double leblebi = 3.5;
		double findik = 15.7;
		double badem = 22;
		
		double maliyet = leblebi*12 + findik*25 + badem*40 ;
		System.out.println("Ürünlerin Toplam Maliyeti: "+ maliyet + "TL'dir.");
		double satisFiyati= (leblebi*12)*1.5+ (findik*25)*1.4+(badem*40)*1.6;
		System.out.println("Ürünlerin Toplam Satış fiyatı: "+ satisFiyati+ "TL'dir.");
		double kar = satisFiyati - maliyet;
		System.out.println("Ürünlerin Satşından Elde Edien Toplam kar miktarı: "+ kar + "TL'dir.");
		double dukkanKirasi = 500;
		if (kar<dukkanKirasi) {
			System.out.println("Bu Miktar İle Dükkan Kirasını Ödeyemezsiniz :(");
		}else {
			System.out.println("Dükkan kirasını Ödeyebilmek İçin Yeterli Paraya Sahipsiniz     Kirayı Ödeyebilirsiniz :)");
		}
		
		
		
		
		
		
		
		
		
		
		


	}

}
