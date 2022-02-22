package with_CEMIL;

import java.util.Scanner;

public class _my_stairs {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		
	    String s = "";
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	    
	    for(;i<=n;i++){
	      for(;j<=n;j++){
	        s=s+"*";
	        System.out.println(s);
	      }
	    }	
	    
	    
	}

}
