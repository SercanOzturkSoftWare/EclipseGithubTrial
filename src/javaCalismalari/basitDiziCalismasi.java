package javaCalismalari;

public class basitDiziCalismasi {

	public static void main(String[] args) {
		int[]n = {10,20,30	};
		System.out.println(elemanTopla(n));
				
		}
		
		public static int elemanTopla(int[]n) {
			int sonuc =0;
			for (int i = 0; i < n.length; i++) {
				sonuc+=n[i];
				}	
			return sonuc;
		
		
	}

}
