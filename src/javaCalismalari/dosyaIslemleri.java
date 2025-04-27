package javaCalismalari;

import java.io.File;
import java.io.IOException;

public class dosyaIslemleri {

	public static void main(String[] args) {
		// Dosya ile ilgili işlemler yapan sınıf

		try {
			File dosya = new File("C:/ornek/deneme.txt");
			if (dosya.createNewFile()) {
				System.out.println("Dosya oluşturuldu.");
				System.out.println("Does it exist? " + dosya.exists());
				System.out.println("The file has " + dosya.length() + " bytes");
				System.out.println("Can it be read? " + dosya.canRead());
				System.out.println("Can it be written? " + dosya.canWrite());
				System.out.println("Is it a directory? " + dosya.isDirectory());
				System.out.println("Is it a file? " + dosya.isFile());
				System.out.println("Is it absolute? " + dosya.isAbsolute());
				System.out.println("Is it hidden? " + dosya.isHidden());
				System.out.println("Absolute path is " + dosya.getAbsolutePath());
			} else {
				System.out.println("Dosya Zaten Var");
			}
		} catch (IOException ex) {
			System.out.println("Bir hata oluştu: " + ex.getMessage());
			ex.printStackTrace(); // Hata detaylarını gösterir
		}
	}
}
