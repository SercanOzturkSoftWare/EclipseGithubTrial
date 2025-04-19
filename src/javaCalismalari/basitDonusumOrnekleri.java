package javaCalismalari;

import java.util.Scanner;

public class basitDonusumOrnekleri {
	public static void main(String[] args) {
//	celcius fahrenheit donusumu 
    Scanner kb = new Scanner(System.in);
   System.out.println("celcius cinsinden bir deger girin :");
	double celcius = kb.nextDouble();  
	double sonuc = (celcius * 1.8) + 32;
	System.out.println("celcius cinsinden girmiş olduğunuz değerin fahrenheit karşılığı: "+ sonuc);
	
	//silindirin hacmini taban alanini hesaplama 
	
	Scanner g = new Scanner(System.in);
	System.out.println("taban alanı için r degerini girin : ");
	 double r= g.nextDouble();
	 System.out.println("h degerini girin:" );
	 double h = g.nextDouble();
 double tabanalanı = Math.PI*r*r ;
System.out.println("taban alanı : " + tabanalanı);
	System.out.println("silindirin hacmi : " + (tabanalanı * h));	
		
	// adım sayısından metreyı bulma 
	 Scanner a = new Scanner(System.in); 
	System.out.println(" attığınız adım sayısını giriniz : ");
	double adim = a.nextDouble();
	double metre = 0.305*adim ;
	System.out.println("attığınız adım sayısının metre karşılığı :  " + metre );
	
	// poundsu kg a donusturmek 
	Scanner yapilis = new Scanner(System.in);
	double pounds,kg ;
	System.out.println("pounds degerini giriniz : ");
	pounds = yapilis.nextDouble();
	kg = pounds * 0.454 ;
	System.out.println("kg karşılığı : " + kg);


	
	}

}
