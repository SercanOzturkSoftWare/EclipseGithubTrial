package javaCalismalari;

public class arttirmaAzaltmaOperatorleri {

	public static void main(String[] args) {
		// arttirma operatoru : ++	  girilen  sayiyi 1 arttirmak icin kullanilir.
		
		
			int a = 5;
			a++ ;
			a++ ;
			a++ ;
			System.out.println("sonuc1: " + a);

			
	 // azaltma operatoru : --     girilen sayiyi 1 azaltmak icin kullanilir. 
			
			int b = 12 ;
		    b-- ;
			b-- ;
		System.out.println("sonuc2: "+b);
			
			
		// ek not: systemout yapinca parantez 	icinde iki tirnak arasina bir kelime yazarsan o kelimeyi asagida gorursun 
		// iki tirnak arasina sadece bosluk birakilirsa o iki tirnagin saginda ve solunda yazdiklarin arasinda bosluk birakmis olursun 
	
		
		
		// ek bilgi
int	toplam =0;
		
		for (int i = 1;  i<=10; i++) {
		toplam +=i;	
		}
		System.out.println(toplam);

	}

}
