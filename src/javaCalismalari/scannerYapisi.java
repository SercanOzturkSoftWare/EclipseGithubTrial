package javaCalismalari;

import java.util.Scanner;

public class scannerYapisi {
public static void main(String[] args) {

	//kullanicidan deger alma nasil yapilir ?
	// Scanner(tarayici) 
/*     nextLine()-> String veri tipi icin kullanilir
       nextInt()->Integer veri tipi icin kullanilir
       nextByte()->Byte veri tipi icin kullanilir
       nextFloat()->Float veri tipi icin kullanilir
       nextDouble()->Double veri tipi icin kullanilir
  */
	
Scanner yapmak = new Scanner(System.in);
System.out.println("adinizi giriniz:");
String isim = yapmak.nextLine();/* basina string ifade yazdik cunku nextline string ifadeler icin kullanilir int,boolen filan 
olsaydi hata verirdi	*/

/*asagida adinizi girin denilen yere adini girdiginde bir ust satirdaki yapmak.nextline ile yakalanip geriye string ifadesi olarak donecek
	yani yukaridaki isim degiskeninin icinde artik yazdigin isim olmus olacak 
	 */
	System.out.println("soyadinizi giriniz ");
	String soyisim =yapmak.nextLine();
/*asagida soyadinizi girin denilen yere adini girdiginde bir ust satirdaki yapmak.nextline ile yakalanip geriye string ifadesi olarak donecek
yani yukaridaki soyisim degiskeninin icinde artik yazdigin soyisim olmus olacak  */ 
	
	System.out.println("adiniz ve soy adiniz: " + isim + " " + soyisim );
//bir ustteki satir ise kaydetmis oldugun ifadeleri asagida yazdirman icin kullanilir 
	
	
	


	}
}
