package javaCalismalari;

public class turlerArasiDonusumler {

	public static void main(String[] args) {
		/*String tipinden int tipine dönüştürme
		 * Int tipinden String tipine dönüştürme
		 * Double tipinden int tipine dönüştürme 
		 * Int tipinden double tipine dönüştürme 
		 * Float tipinden long tipine dönüştürme 
		 * Long tipinden float tipine dönüştürme 
		 * Long tipinden String tipine dönüştürme 
		 * Float tipinden String tipine dönüştürme 
		 * Byte tipinden String tipine dönüştürme 
		 */
				
		       
				String a = "5";
				String b="10";
				System.out.println(a+b);
		/* 
		 bu işlem için cevabı 510 yapar çünkü 2 tane String tipinden degeri toplamak istersek okutma satırında
		ikisini yan yana yazar.
		*/	
			
				
				
//1. yol  strıng tipinden olan k yi int tipnden olan L ye cevirdik (.valueOf ile ) 
				String k= "17";
				int l = Integer.valueOf(k);
				System.out.println(l);
	
		 
//2. Yol olarakta strıng tipinden olan m i int tipnden olan n ye cevirdik (.parseInt ile )
				String m = "19";
			int n =	Integer.parseInt(m);
			System.out.println(n);
				
				
//3.Yol olarakta double tipinden olan Sayi`yi int tipnden olan intSayi`ya cevirdik(parantez icine yazarak)
				double Sayi = 13.1333d;
				int intSayi = (int) Sayi;	
				
				System.out.println(intSayi);
				
		//https://medium.com/gokhanyavas/javada-tip-d%C3%B6n%C3%BC%C5%9F%C3%BCmleri-ve-string-i%CC%87fadeler-4d5457497c78
//			yukarıdakı lınkten butun dönüştürmeleri görebilirsin 
			
				
				
				
				
				
	}

}
