package javaCalismalari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class soruCevapTesti {
 static class Soru {
		        private String soruMetni;  // Soru metni
		        private String dogruCevap; // Doğru cevap
		        private List<String> secenekler; // Şıklar

		        // Soru yapıcısı
		        public Soru(String soruMetni, String dogruCevap, String... secenekler) {
		            this.soruMetni = soruMetni;
		            this.dogruCevap = dogruCevap;
		            this.secenekler = new ArrayList<>();
		            Collections.addAll(this.secenekler, secenekler);
		        }

		        public String getSoruMetni() {
		            return soruMetni;
		        }

		        public String getDogruCevap() {
		            return dogruCevap;
		        }

		        public List<String> getSecenekler() {
		            return secenekler;
		        }

		        // Şıkları karıştır
		        public void secenekleriKaristir() {
		            Collections.shuffle(secenekler);
		        }

		        // Şık için cevabı al
		        public String seceneginCevabi(char secenek) {
		            int indeks = secenek - 'a';
		            if (indeks >= 0 && indeks < secenekler.size()) {
		                return secenekler.get(indeks);
		            }
		            return "";
		        }

		        // Doğru cevabın hangi şıkta olduğunu bul
		        public char dogruSecenekHarf() {
		            for (int i = 0; i < secenekler.size(); i++) {
		                if (secenekler.get(i).equals(dogruCevap)) {
		                    return (char) ('a' + i);
		                }
		            }
		            return '?';
		        }
		    }

		    public static void main(String[] args) {
		        // Soruları oluştur
		        List<Soru> sorular = sorulariOlustur();
		        Scanner kb = new Scanner(System.in);
		        int puan = 0;

		        System.out.println("=== Soru Çözme Programı ===");
		        System.out.println("Her soruyu 'a', 'b', 'c' veya 'd' şıklarını girerek cevaplayınız.");
		        System.out.println("Program her başlatıldığında şıkların sırası karışacaktır.");
		        System.out.println("Başlamak için Enter tuşuna basın...");
		        kb.nextLine();

		        for (int i = 0; i < sorular.size(); i++) {
		            Soru mevcutSoru = sorular.get(i);
		            mevcutSoru.secenekleriKaristir();

		            System.out.println("\nSoru " + (i + 1) + ": " + mevcutSoru.getSoruMetni());

		            // Şıkları yazdır
		            List<String> secenekler = mevcutSoru.getSecenekler();
		            for (int j = 0; j < secenekler.size(); j++) {
		                System.out.println((char) ('a' + j) + ") " + secenekler.get(j));
		            }

		            // Kullanıcının cevabını al
		            System.out.print("Cevabınız (a-d): ");
		            char kullaniciCevabi = 'x';
		            boolean gecerliGirildiMi = false;

		            while (!gecerliGirildiMi) {
		                String giris = kb.nextLine().trim().toLowerCase();
		                if (giris.length() == 1 && giris.charAt(0) >= 'a' && giris.charAt(0) <= 'd') {
		                    kullaniciCevabi = giris.charAt(0);
		                    gecerliGirildiMi = true;
		                } else {
		                    System.out.println("Lütfen geçerli bir şık girin (a-d): ");
		                }
		            }

		            // Cevabı kontrol et
		            String secilenCevap = mevcutSoru.seceneginCevabi(kullaniciCevabi);
		            char dogruSecenek = mevcutSoru.dogruSecenekHarf();

		            if (secilenCevap.equals(mevcutSoru.getDogruCevap())) {
		                System.out.println("Doğru Cevap!!!");
		                puan++;
		            } else {
		                System.out.println("Yanlış Cevap!!! Doğru cevap: " + dogruSecenek + ") " +
		                        mevcutSoru.getDogruCevap());
		            }
		        }

		        // Sonuçları göster
		        System.out.println("\n=== TEST SONUCU ===");
		        System.out.println("Toplam Soru : " + sorular.size());
		        System.out.println("Doğru Cevap : " + puan);
		        System.out.println("Yanlış Cevap: " + (sorular.size() - puan));
		        System.out.println("Başarı Oranı: %" + (puan * 100 / sorular.size()));
		        System.out.println("\nTekrar denemek için programı yeniden başlatın.");
		        kb.close();
		    }

		    // Soru listesi oluştur
		    private static List<Soru> sorulariOlustur() {
		        List<Soru> sorular = new ArrayList<>();
		        sorular.add(new Soru(
		                "Türkiye'nin başkenti neresidir?",
		                "Ankara",
		                "Ankara", "İstanbul", "İzmir", "Bursa"
		        ));
		        sorular.add(new Soru(
		                "Aşağıdakilerden hangisi bir programlama dili değildir?",
		                "HTML",
		                "Java", "Python", "HTML", "C++"
		        ));
		        sorular.add(new Soru(
		                "Su molekülünün kimyasal formülü nedir?",
		                "H2O",
		                "CO2", "H2O", "O2", "H2"
		        ));
		        sorular.add(new Soru(
		                "Hangisi Türkiye'nin en yüksek dağıdır?",
		                "Ağrı Dağı",
		                "Erciyes Dağı", "Uludağ", "Palandöken Dağı", "Ağrı Dağı"
		        ));
		        sorular.add(new Soru(
		                "Osmanlı İmparatorluğu hangi yılda kurulmuştur?",
		                "1299",
		                "1453", "1071", "1299", "1517"
		        ));
		        return sorular;
		    }
		}


