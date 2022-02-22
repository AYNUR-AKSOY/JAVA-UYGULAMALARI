package with_CEMIL;

import java.util.HashMap;

public class _my_kelimeCumledeKacKereTekrarlanmis {

	public static void main(String[] args) {
		
	String metin= "Aynur, ders calismayi cok seviyor, her gun ders calisiyor.";
	
	String[] parcala = metin.split(" ");
	
	HashMap<String, Integer> kelimeler= new HashMap<>();
	
	for(int i=0; i<parcala.length;i++) {
		String kelime= parcala[i];
		
		if(kelimeler.containsKey(kelime)) {
			int sayi= kelimeler.get(kelime);
			kelimeler.put(kelime, sayi+1);
		}
		else {
			kelimeler.put(kelime,1);
		}
	}
	System.out.println(kelimeler);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
