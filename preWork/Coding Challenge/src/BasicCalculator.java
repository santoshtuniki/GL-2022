import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner in = new Scanner(System.in)) {
		
			System.out.println("Enter num1: ");
			int number1 = in.nextInt();
	
			System.out.println("Enter num2: ");
			int number2 = in.nextInt();
			
			System.out.println("Enter the option: ");
			System.out.println("1.addition");
			System.out.println("2.subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.division");
			int option = in.nextInt();
			
			switch (option) {
				case 1 :
				{
					System.out.println(number1 + number2);
					break;
				}
				case 2 :
				{
					System.out.println(number1 - number2);
					break;
				}
				case 3 :
				{
					System.out.println(number1 * number2);
					break;
				}
				case 4 :
				{
					if(number2!=0) {
						System.out.println(number1 / number2);
					}else {
						System.out.println("Cannot be divided!!!");
					}
					break;
				}
				default : 
					System.out.println("Wrong Option!");
			}
		}
	}
}
