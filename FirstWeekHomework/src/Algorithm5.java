import java.util.ArrayList;
import java.util.Random;

public class Algorithm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] array = new int[100];
		
		for(int i=0; i<array.length; i++) {
			
			int x=rand.nextInt(100);
			array[i]= x;
		}
		
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();

		for(int i=0; i<array.length; i++) {
			
			if(array[i] % 2 == 0) {
				even.add(array[i]);
			}
			
			else {
				odd.add(array[i]);
			}
			
		}
		
			System.out.println("EVEN NUMBERS");
			System.out.print(even);
			
			System.out.println("\nODD NUMBERS");
			System.out.print(odd);
			

	}

}
