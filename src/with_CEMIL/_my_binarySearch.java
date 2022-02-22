package with_CEMIL;

public class _my_binarySearch {

	public static void main(String[] args) {
		// binary search kullanacaksak sayilar sirali olmali

		
		int array[]= {2,7,9,15,20,22,25,30,40};
		
		int index= binarySearch(array,25);
		System.out.println("bulunan index "+ index);
	}
			
			
		private static int binarySearch(int[]array, int sayi) {
			
			int sol=0;
			int sag=array.length-1;
			int orta=(sol+sag)/2;
			
			
			
			while(sol<=sag) {
				
			if(array[orta]<sayi) {
				sol=orta+1;
			}
			else if(array[orta]==sayi) {
				return orta;
			}
			else if (array[orta]>sayi) {
				sag=orta-1;
			}
			orta=(sag+sol)/2;
			}
			
			return -1;	// herhangibir data bulamazsa -1 donsun
				
			}
			

		
		
		
	}


