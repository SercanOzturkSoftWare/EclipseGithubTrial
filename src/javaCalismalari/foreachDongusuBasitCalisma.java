package javaCalismalari;

public class foreachDongusuBasitCalisma {

	public static void main(String[] args) {
		// yaz();foreach döngüsü belirtilen dizinin elemanlrının yazılmasında kullanılır
		// for veya while döngüsüde kullanılır
//ama bu daha kullanışlıdır foreach zaten diziler icin yapılmıştır.
		String[] isimler = { "bilal", "musa", "yakup", "kasım" };
		for (String dizininElemanlari : isimler) {
			System.out.println(dizininElemanlari);

		}

	}

}
