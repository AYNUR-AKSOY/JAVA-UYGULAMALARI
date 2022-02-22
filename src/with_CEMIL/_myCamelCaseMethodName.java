package with_CEMIL;

public class _myCamelCaseMethodName {

	public static void main(String[] args) {
		
		String ifade= "BU BIR DENEMEDIR";
		String yeniYazim= camelCaseDonusturucu(ifade);
		
		System.out.println(yeniYazim);
		
	}
	
	private static String camelCaseDonusturucu(String ifade) {
		
		String[]kelimeler = ifade.split(" ");
				
		String yeniIfade="";
		
		for(int i=0; i<kelimeler.length;i++) {;
		String kelime=kelimeler[i];
		
		if(i==0) {
			yeniIfade +=kelime.toLowerCase();
		}
		else {
			String ilkHarf= kelime.substring(0,1).toUpperCase();
			String kalanHarfler= kelime.substring(1,kelime.length()).toLowerCase();
			String yeniKelime= ilkHarf+kalanHarfler;
			yeniIfade+=yeniKelime;
		}
		}
	
	return yeniIfade;
		
	
	}
		
		
	}

	

