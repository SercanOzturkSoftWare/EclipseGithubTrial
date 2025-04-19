package javaCalismalari;

public class rastgeleSayiAtama {

	public static void main(String[] args) {
		/*Kod, 100 elemanlı bir dizi (array) oluşturuyor 
		ve bu dizinin her elemanına rastgele sayılar atıyor.
		Bu rastgele sayılar, 35 ile 80 arasında bir aralıkta olacak şekilde üretiliyor.
		Ardından, dizinin her bir elemanını ekrana yazdırıyor.*/
		
		Object [] karisikDizi = new Object[100];
		for (int i = 0; i < karisikDizi.length; i++) {
			karisikDizi[i]=(Math.random()*45+35);//35 ve 80
				System.out.print(karisikDizi[i]+" ");
			}
	}

}
