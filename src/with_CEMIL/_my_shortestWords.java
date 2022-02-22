package with_CEMIL;
import java.util.Arrays;
import java.util.Scanner;
public class _my_shortestWords {

	public static void main(String[] args) {
		
		  String str="a,bb,ccc,dddd";
		  String arr [] = str.split(",");
		 
		  String shortest = str;
		  String secondShortest = str;
		  
		  for (int i = 0; i < arr.length; i++) {
			  
				if(arr[i].length()< shortest.length()){
					
					secondShortest=shortest;
					shortest = arr[i];
				}
				
				else if(arr[i].length()<=secondShortest.length()) {
					secondShortest=arr[i];
				}
				
					
				}
		  System.out.println(shortest + " "+ secondShortest);
		   
		  
		 
		  
		 
		  
}

}
