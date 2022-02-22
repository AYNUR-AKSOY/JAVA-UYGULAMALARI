package with_CEMIL;

public class _my_perfectNumber {

	public static void main(String[] args) {
		
		int sayi= 6;
		boolean sonuc= mukemmelSayiKontrol(sayi);
		System.out.println(sonuc);
		
		
	}
		private static boolean mukemmelSayiKontrol(int sayi) {
			
			int toplam=0;
			
			for(int i=1; i<sayi;i++) {
				
				if(sayi% i==0) {
					toplam +=i;
				}
			}
		
		boolean sonuc= toplam==sayi;
		return sonuc;
		
	}

}
