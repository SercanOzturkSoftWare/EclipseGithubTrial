package javaCalismalari;

import java.util.Scanner;

public class tryCatchBloklari {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Lutfen iki adet sayı gırınız: ");
		int s1 = kb.nextInt();
		int s2 = kb.nextInt();
		try {//hataya musait kısım try kısmına yazılır try bir block tur 
			int sonuc = (s1/s2);
			System.out.println("s1/s2: " + sonuc);
		} 
catch (ArithmeticException e) {// turkcesı yakalamaktır hata olacak durum gercekleşirse catch 
			//bloğu devreye girer
	System.out.println("Hata Oluştu: "+ e.getMessage());

}
		
		System.out.println("İşlem Tamamlandı... ");
		
	}

}
