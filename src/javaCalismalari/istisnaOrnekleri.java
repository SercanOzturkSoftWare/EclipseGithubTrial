package javaCalismalari;

public class istisnaOrnekleri {

	public static void main(String[] args) {
		try {
			// throw new Exception (" Bu Mesaj catch Kisminda yakalanacak");
			hataMesaji();
// eger try blogunun icinde throw kismi varsa direkt catch blogunda yakalanir 
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("mesaj 2 ");
		}
		System.out.println("mesaj 3 ");

	}// main

	public static void hataMesaji() throws Exception {
		throw new Exception("Bu mesaj catch kisminda yakalanacak2");
	}

}// class
