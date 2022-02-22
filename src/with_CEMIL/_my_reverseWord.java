package with_CEMIL;

public class _my_reverseWord {

	public static void main(String[] args) {
		// reverse string
		
		String str="Ankaralilar";
		reversed(str);
		
		String word="SiliconeLabs'i seviyoruz";
		String reversed="";
		
		for(int i= word.length()-1;i>=0;i--){
			reversed+=word.charAt(i);
		}
			System.out.println(reversed);
			
			
	}
	public static void reversed(String str) {
		str=str.toLowerCase();
		StringBuilder sb=new StringBuilder();
		for(int i= str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
			
		}
		
		System.out.println(sb);
		
		
	}

}
