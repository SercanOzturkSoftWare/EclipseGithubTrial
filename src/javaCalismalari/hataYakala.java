package javaCalismalari;

import java.util.Scanner;

public class hataYakala {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		try {

			System.out.println("iki tane  tam sayi girin : ");
			int ts1 = kb.nextInt();
			int ts2 = kb.nextInt();
			System.out.println("Bolme sonucu: " + (ts1 / ts2));
		}

		catch (Exception ex) {
			System.out.println("olusan hata: " + ex.getMessage());

		} finally {// hata olussada olusmasada finally kismi her zaman calisir
			System.out.println("calismaya devam eder.... ");
		}

	}

}
