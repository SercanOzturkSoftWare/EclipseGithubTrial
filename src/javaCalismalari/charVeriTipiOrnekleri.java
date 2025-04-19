package javaCalismalari;

public class charVeriTipiOrnekleri {

	public static void main(String[] args) {
		
		char karakter ;
		int i ;
		for (i=33; i<=100; i++) {
		karakter = (char ) 	i;
		System.out.println("Kod "+ i + " karsilik gelir "+ karakter);
		
		}
		
    	
		
		char harf = 'A';
		double asciiDegeri = (int) harf;
		System.out.println("ASCII degeri: "+ asciiDegeri);

	
	char [] kelime = {'m', 'e' ,'r', 'H','a', 'b','a'};
	String kelimee = new String(kelime);
	System.out.println(kelimee);
	
	
	
	
	
	

	}

}
