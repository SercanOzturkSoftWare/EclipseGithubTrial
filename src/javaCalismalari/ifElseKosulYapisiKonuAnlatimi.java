package javaCalismalari;

import java.util.Scanner;

public class ifElseKosulYapisiKonuAnlatimi {

	public static void main(String[] args) {
		// if : eger demektir 
		// else : belirtilen durumlar dışındaki durumlar için kullanılır
		// if ve else aynı anda calışmaz eger sunduğun koşul doğruysa if çalışır yanlış ise else çalışır doğru olduğunda yani else çalışmaz 
				
				if (8>3) {
				System.out.println("8 3 ' ten buyuktur ");	
				} else {
					System.out.println(" 8 3 ' ten kuçuktur ");
				}
	
		// ornek Çalışma
		Scanner kb = new Scanner (System.in);
		System.out.println("yarıcap degerini girin: ");
		double  r = kb.nextInt();
		double alan ;
		if (r <=0) {
			System.out.println("yanlış giriş baştan tekrardan deneyiniz ");
		}
		else 
		{ 
		alan = Math.PI*r*r ;
		
		System.out.println("alan: "+ alan );
		}
	}

}
