package javaCalismalari;

public class donguler {

	public static void main(String[] args) {
		                          //For Döngüsü
		/*  for (int i = baslangic kisimi ; kosul kisimi; arttirma veya azaltma kisimi ){

		}		
		*/		

			
		// 1 den 10 a kadar sayilari yazdirma 
				/*for (int i = 1; i <= 10 ; i++) {
				System.out.println(i);	
				}
				*/
		//1 den 500 e kadar tek ve cift sayilari belirtme	
				/*for (int i = 0; i <=500; i++) {
				if (i%2==0) {
					System.out.println( i+" bir çift sayıdır." );	
				}
					else {
						System.out.println(i+"bir tek sayıdır."  );
					}
				}		
		*/
			// 1 den 10 a kadar olan cift saylarin toplamini yapma	
				/*int toplam=0;
				for (int i = 1; i <=10; i++) {
					if (i%2==0) {
						toplam+=i;
					}
				}
				System.out.println(toplam);
			*/
				// 1 den 10 a kadar olan tek saylarin toplamini yapma	
					/*	int toplam=0;
						for (int i = 1; i <=10; i++) {
							if (i%2==1) {
								toplam+=i;
							}
						}
						System.out.println(toplam);
						*/
				

				
		// 1 den 40 a kadar olan sayilari ekrana yazdir cift olanlar yerine cift desin tekleri aynen yazsin 
			/*for (int i = 1; i <=40; i++) {
				if (i%2==0) {
					System.out.println(i+" cift bir sayidir.");
				}
				else {
					System.out.println(i);
				}
			}	
				*/
		
		/*Faktöriyel ve e Sayısı Hesabı):
		Bu kısımda, matematikteki ünlü bir sabit olan Euler Sayısı (e ≈ 2.718) bir formülle hesaplanmaya çalışılıyor:
		Adım Adım Açıklama:
		e değeri başlangıçta 1 olarak tanımlanıyor.
		Bir for döngüsü ile 1'den n (20) değerine kadar dönülüyor.
		İçeride bir iç döngü (for j) var; bu da faktöriyel hesaplıyor.
		Örneğin, 1!, 2!, 3! gibi faktöriyel değerler hesaplanıyor. (Faktöriyel: n! = 1 × 2 × ... × n)
		e formülüne göre her bir terim ekleniyor: 1 / faktöriyel.
		Sonuç olarak, Euler sayısı yaklaşık olarak hesaplanıyor.
		Sonuç:
		Hesaplanan e değeri ekrana yazdırılıyor.
		*/
	
	
double e = 1 ;
int n = 20;
int jfak=1;
for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=i; j++) {
		jfak*=j;
		
	}
	e +=(double)1/jfak;
	jfak=1;
}// for i
System.out.println(e);









/*Bu kısımda, belirli bir matematiksel toplam hesaplanıyor.
Adım Adım Açıklama:
sum isimli bir değişken tanımlanıyor ve başlangıç değeri 0 olarak veriliyor.
Bir for döngüsü ile 1'den 624'e kadar dönülüyor.
Döngüde şu işlem yapılıyor:

1 / (√i + √(i+1))

Yani, her adımda iki ardışık sayının karekökleri toplanıyor ve 1 bu değere bölünerek sum değişkenine ekleniyor.
Döngü tamamlanınca sum toplamı ekrana yazdırılıyor.
Sonuç:
Bu hesaplama, toplamda 624 terimi kapsayan bir seriyle ilgilidir. Her adımda ara sonuçlar da ekrana yazdırılıyor.
*/


 double sum =0;
    for (int i = 1; i <=624 ; i++) {
	sum+=1/(Math.sqrt(i)+Math.sqrt(i+1));	
	System.out.println("Result:"+sum);
	}

    
    
    
    
    /*  Ek Bilgi:   Math.sqrt(x) ifadesi, x sayısının karekökünü hesaplar. Örneğin:

    	Math.sqrt(4) sonucu 2 olur (çünkü 2'nin karesi 4'tür).

    	Math.sqrt(9) sonucu 3 olur.
    	*/
    
    
    
    
    
                                 //While Döngüsü
	/*  int i =1;
	   while (i<=10) {
	  
	  System.out.println(i); i++; 
	  }
	 
*/
	
	
	// 1 den 10 a kadar cift sayilari yazdirma
	/*int i = 1;
	while (i <= 10) {
		if (i % 2 == 0) {
			System.out.println(i);
		}
		i++;
	}
*/

	
	
//	1 den 10 a kadar tek sayilari yazdirma
	/*int i =1;
	while (i<=10) {
		if (i%2==1) {
		System.out.println(i);
		
		}
	i++;
	}
	*/
	
	
	//1 den 40 a kadar olan cift sayilarin toplami
	/*int i= 1;
	int toplam = 0;
	while (i<=40) {
		if (i%2==0) {
	 toplam +=i;
		}
		i++;
	}
System.out.println(toplam);//syso kismi disariya yazilir cunku while dongusu ile isin bitmistir
	 //ve sonucu bulman gerekir 
	*/
	
	
/*int i =1;
while (i<=10) {
	if (i%2==0) {
		System.out.println("cifttir");
	}
	else {
		System.out.println(i);
	}
i++;
}
*/	 
//Ek Not: continue anahtar kelimesi calistiginda altinda ne olursa olsun altindaki hicbir seyi calistirmaz 
	//	ve donguyu basa sarar
	
  //break anahtar kelimesi ise donguyu aniden durdurmak icin kullanilir dongu icinde belli bir kosul saglandiginda 
  //break komutu ile karsilasilinca dongu hemen sonlanir ve program donguden sonraki kisimdan devam eder 
  		
  		
  		
  		int sayi ;
  		for (int i = 1; i <= 10; i++) {
  			if (i == 4) {
  				sayi = i;
  				break;// dongunun devam etmesini engeller istenen sonuc bulunmus ise donguden cikar
       }
  		}
  		
  		System.out.println("cevap ");
  		
    for (int i = 0; i < 5; i++) {
        if (i == 3) {
            continue; // 3'ü atlar
        }
        System.out.println("Sayı: " + i);
    }
    
	}

}
