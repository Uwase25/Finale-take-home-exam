package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		Random rand= new Random();
		int randomNum= rand.nextInt(999);
		int[] generateRandom= new int[700];
		
		for(int i=0; i<700; i++) {
			generateRandom[i]= rand.nextInt(999);
			
		}
		int Number= scan.nextInt();
		Arrays.parallelSort(generateRandom);
		System.out.println(generateRandom[Number-1]);
		
	}

}
