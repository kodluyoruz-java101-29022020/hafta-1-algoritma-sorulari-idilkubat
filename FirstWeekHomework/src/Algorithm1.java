import java.util.Scanner;

public class Algorithm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "idil";
		boolean loop = true;
		
		Scanner input = new Scanner(System.in);
		
		while(loop) {
			
			System.out.println("Enter your password: ");
			String s = input. nextLine();
			
			if(s.equals(password)) {
				System.out.println("Login Succesful!");
				loop = false;
			}
			
			else {
				System.out.println("Login Failed!");
				System.out.println("Try again!");
			}
		}
		


	}

}
