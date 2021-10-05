import java.util.Scanner;


public class Calculator {

	static void add(int int1, int int2) {
		
		System.out.println(int1+int2);
	}
	static void subtract(int int1, int int2) {
		
		System.out.println(int1-int2);
	}
	static void multiply(int int1, int int2) {
		
		System.out.println(int1*int2);
	}
	static void divide(int int1, int int2) {
		
		System.out.println(int1/int2);
	}
	static void average(int int1, int int2) {
		
		System.out.println((int1+int2)/2);
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num1;
		int num2;
		int menuInput;
		//create a menu in the terminal for use with 6 options
		//switch with 6 cases 1 for each method

		boolean endOfProgram = false;

		Scanner input = new Scanner(System.in);

		while (!endOfProgram){
			
			System.out.println("=============");
			System.out.println("***************\nMENU \n \n \n1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Average \n6. Exit \n ***************\n Please enter your choice(1-6): ");
			menuInput = input.nextInt();
			
			

			switch (menuInput) {
				case 1:
				System.out.println("Choose the first number");
				num1 = input.nextInt();
				System.out.println("Choose the second number");
				num2 = input.nextInt();
				add(num1,num2);
					
					break;
				case 2:
				System.out.println("Choose the first number");
				num1 = input.nextInt();
				System.out.println("Choose the second number");
				num2 = input.nextInt();
				subtract(num1,num2);
					
					break;
				case 3:
				System.out.println("Choose the first number");
				num1 = input.nextInt();
				System.out.println("Choose the second number");
				num2 = input.nextInt();
				multiply(num1,num2);
					
					break;
				case 4:
				System.out.println("Choose the first number");
				num1 = input.nextInt();
				System.out.println("Choose the second number");
				num2 = input.nextInt();
				divide(num1,num2);
					
					break;
				case 5:
				System.out.println("Choose the first number");
				num1 = input.nextInt();
				System.out.println("Choose the second number");
				num2 = input.nextInt();
				average(num1,num2);
					
					break;
				
				case 6: 
				endOfProgram = true;
				break;
			
				default:
				System.out.println("invalid choice");
					break;
			}


		}
		input.close();



		// System.out.println("Enter First Number");
		// num1 = input.nextInt();
		// System.out.println("Enter Second Number");
		// num2 = input.nextInt();
		
		// input.close();
		
		
	}

}