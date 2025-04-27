package javaCalismalari;

public class metotCalismalari2 {

	public static void main(String[] args) {
		//Parametreli Ve Geriye Değer Döndürmeyen Method 
/* Bir Methodun Parametreli Olması Demek Parantezin İçerisine Once Parametrenin Veri Tipi 
		Sonra Parametrenin İsminin tanımlanması Demektir 
		*/
topla(5, 13);
	}
	public static void topla (int sayi1 , int sayi2) {
		int sonuc = sayi1 + sayi2;
		System.out.println("Sonuç : " + sonuc);
	}

}
