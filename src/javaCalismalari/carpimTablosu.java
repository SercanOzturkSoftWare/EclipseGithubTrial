package javaCalismalari;

public class carpimTablosu {

	public static void main(String[] args) {
		 for (int i = 1; i <=10; i++) {
			  for (int j = 1; j <=10; j++) {// ilk başta i=1 alindıktan sonra bu for döngüsünden cikilmadan 
		// i nin bir sonrakı degerıne gecmez en son j= 11 olup kurakı saglamayınca alttakıler yapıldıktan sonra 
		//ilk for döngüsüne tekrar döner ve i= 2 alınır sonra aynı sekılde devam eder i nin her degeri icin tekrar 
		// eder yani içteki döngü sonlanana kadar dıştal		
				  System.out.println(i +"*" + j+ "="+(i*j) );
				
			}
			System.out.println("-------------------");
		}
				
				
				

	}

}
