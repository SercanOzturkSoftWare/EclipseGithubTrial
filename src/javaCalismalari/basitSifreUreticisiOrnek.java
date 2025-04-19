package javaCalismalari;

public class basitSifreUreticisiOrnek {

	public static void main(String[] args) {

		sifreUreticisi();

	}

	public static void sifreUreticisi() {
		char ilkK = (char) (Math.random() * 15 + 33);//48-33 , b-a+a , a=33 , b=48 , b-a=15
		char ikinciK = (char) (Math.random() * 26 + 65);//91-65 , b-a+a , a=65 , b=91 , b-a=26
		char ucuncuK = (char) (Math.random() * 10 + 48);
		String digerK = " ";
		for (int i = 1; i < 10; i++) {
			int kucukHarf = (int) (Math.random() * 26 + 97);
			digerK = digerK + (char) kucukHarf;

		}
		System.out.println("Uretilen Sifre: " + ilkK + ikinciK + ucuncuK + digerK);
	
	}

}
