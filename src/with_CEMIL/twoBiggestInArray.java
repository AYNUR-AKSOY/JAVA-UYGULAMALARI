package with_CEMIL;

public class twoBiggestInArray {

	public static void main(String[] args) {
		
		int arr[]={-9,9,5,-11,12,0,50,100,-2};
		int biggest = 0;//Integer.MIN_VALUE;//sayi negatif olursa diye bu sekilde yazmak daha dogru olur. 
		                //sayinin pozitif oldugunu biliyorsak 0 almak iyi olur.
        int secondBiggest = 0;//Integer.MIN_VALUE;
        
        
		for(int i=0; i<arr.length;i++){
			if(arr[i]>=biggest){ 
			    secondBiggest = biggest; 
				biggest=arr[i]; 
			}
			else if(arr[i] >= secondBiggest){ 
			    secondBiggest = arr[i]; 
			}
		
		}	
		System.out.println(biggest+" "+secondBiggest);
	
		

	}

}
