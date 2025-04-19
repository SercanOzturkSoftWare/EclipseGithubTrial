package javaCalismalari;

public class matematikselislem {

	public static void main(String[] args) {
		int n = 20; // Seri uzunluğu
		seriTopla(n); // Metodu çağır
	}

	public static void seriTopla(int n) {
		double m = 0; // Seri toplamı için başlangıç

		for (int i = 1; i <= n; i++) {
			m += (double) i / (i + 1); // Seri toplama işlemi
			System.out.println(i + " \t" + m); // i ve m değerlerini yazdır \t ise i ve m degerleri arasına -
			// boşluk koymak için konuldu (karışıklık olmasın diye.)
		}


	}

}
