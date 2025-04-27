package javaCalismalari;

public class metotCalismasi3 {

	public static void main(String[] args) {
                //Parametreli Ve Geriye Değer Dönderen Method 
	  /*Methodun Geriye Değer Döndermesi Demek void Kısmının yazılmaması ve yerine bir 
	Veri Tipi Tanımlanması Demektir
	*/
		
		 int metottanGelenSonuc= carp(5,9);
		System.out.println(metottanGelenSonuc);
		
	}
	public static int carp(int sayi1 , int sayi2) {
		int sonuc = sayi1*sayi2;
		return sonuc;
			
	}
	

}
