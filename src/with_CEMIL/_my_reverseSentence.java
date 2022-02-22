package with_CEMIL;

public class _my_reverseSentence {

	public static void main(String[] args) {
		
		String text = "Java is a funny programming language";
		String reverse = "";
		
		String arr[] = text.split(" ");
 		//      last index No   
		for (int i = arr.length - 1 ; i >=0 ; i--) {
			reverse = reverse.concat(arr[i]).concat(" ");
			//reverse = reverse.concat(arr[i]);
		}
		
		System.out.println(reverse.trim());	
		
		//System.out.println(reverse);	
		
		
		
		
		
		
	}

}
