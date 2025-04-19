package javaCalismalari;

import java.util.Scanner;

public class basitOrnekler1 {

	public static void main(String[] args) {

	int  durum ;
	int n1 = 3 ; int n2 = 5 ;
	durum = (n1>n2)? 1: (n1==n2? 0 : -1);
// n1>n2 mi eger öyleyse cevap 1 degılse yandakı işleme gec yandakı işlem =>  n1=n2 mi 
//     	öyleyse cevap 0 degilse cevap -1 olarak ata demektir 
	System.out.println(durum);	
		  
		
	
	
	
	Scanner giris = new Scanner(System.in);
	System.out.println("*****lütfen double cinsinden 3 adaet sayı giriniz: ***** ");	
	System.out.println("Lutfen Double Cinsinden Ilk Sayinizi Giriniz: ");
	double x = giris.nextDouble();
	System.out.println("Lutfen Double Cinsinden Ikinci Sayinizi Giriniz: ");
	double y = giris.nextDouble();
	System.out.println("Lutfen Double Cinsinden Ucuncu Sayinizi Giriniz: ");
	double z = giris.nextDouble();
	
	System.out.println((x<y && y<z)? "Girmis Oldugunuz Sayi Degerleri Sıralanmıştır": "Girmis Oldugunuz Sayi Degerleri Sıralanmamıştır");
		
	
	
	
	
	
	
	
	}

}
