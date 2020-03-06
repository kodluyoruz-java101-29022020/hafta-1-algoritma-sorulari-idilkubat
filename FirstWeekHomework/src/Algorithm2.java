import java.util.Scanner;

public class Algorithm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		
		System.out.println("Enter two numbers!");
		System.out.print("First number: ");
		int firstNumber = input.nextInt();
		System.out.print("Second number: ");
		int secondNumber = input.nextInt();
		
		while(loop) {
			
			System.out.println("Operation menu :  ");
			System.out.println("1- Addition");
			System.out.println("2- Substraction");
			System.out.println("3- Multiplication");
			System.out.println("4- Division");
			
			System.out.print("Choose your operation: ");
			byte operation = input.nextByte();

			switch (operation) {
			
			case 1 : 
				System.out.print("Addition of two numbers is: "+ (firstNumber + secondNumber));
				loop = false;
				break;
			
			case 2 : 
				System.out.print("Substraction of two numbers is: "+ (firstNumber - secondNumber));
				loop = false;
				break;
					
			case 3 : 
				System.out.print("Multiplication of two numbers is: "+ (firstNumber * secondNumber));
				loop = false;
				break;
				
			case 4 : 
				System.out.print("Division of two numbers is: "+ (float)firstNumber /(float)secondNumber);
				loop = false;
				break;
				
			default: 
				System.out.println("Incorrect choose!");
				break;
			
			}
		}
		
		

	}

}
