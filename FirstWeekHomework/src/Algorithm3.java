import java.util.Random;

public class Algorithm3 {
	
	public static int[] createArray(int arraySize) {
		
		Random rand = new Random();
		int[] array = new int[arraySize];
		
		for(int i=0; i<arraySize; i++) {
			
		    int x=rand.nextInt(100);
			System.out.print(" " + x);
			array[i] =x;
			
		}
		return array;
		
	}
	
	public static void calculateAverageofArray(int[] array) {
		
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			
			sum += array[i];	
		}
		System.out.println("\nSum: " + sum);
		double average = (double)sum /array.length;
		System.out.println("\nAverage: " + average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculateAverageofArray(createArray(100));

	}

}
