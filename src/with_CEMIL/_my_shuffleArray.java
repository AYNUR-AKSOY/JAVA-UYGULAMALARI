package with_CEMIL;

import java.util.Arrays;
import java.util.Random;

public class _my_shuffleArray {

	public static void main(String[] args) {
		// arrayin icindeki verileri karisik hale getirmek icin
		
		int array[]= {5,2,7,9,10};
		
		Random random=new Random();
		
		for(int i=0;i<array.length;i++) {
			
			int rasgele=random.nextInt(array.length);
			int rasgeleIndextekiSayi=array[rasgele];
			array[rasgele]=array[i];
			array[i]=rasgeleIndextekiSayi;
		}
		
		System.out.println(Arrays.toString(array));
	}

}
