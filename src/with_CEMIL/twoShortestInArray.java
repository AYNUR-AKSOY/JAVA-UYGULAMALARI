package with_CEMIL;

public class twoShortestInArray {

	public static void main(String[] args) {
		int arr[]={-9,-11,12,0};
		int shortest = Integer.MAX_VALUE;
        int secondShortest = Integer.MAX_VALUE;
        
		for(int i=0; i<arr.length;i++){
			if(arr[i]<=shortest){ // found the shortest number
			    secondShortest = shortest; // assign shortest number to second shortest number
				shortest=arr[i]; // assign the new value as shortest number
			}
			else if(arr[i] <= secondShortest){ // number is smaller than the second shortest, but bigger than the 
				                               // shortest number.
				                               // Mesela shortest: -11 iken, secondShortest = 5 iken, arr[5] = 0'da 
				                               // iken bu bloga girer buraya
				                               
			    secondShortest = arr[i]; // now my second shortest number is the new value arr[i]
			}
		
		}	
		System.out.println(shortest+" "+secondShortest);
	
		
	
	
		
	}

}
