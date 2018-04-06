import java.util.Scanner;

/**
Convert class implements an app that should prompt user to enter a search term
to find amatch or matches in the array also printing out the number of matches found
*/

public class Convert{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);


		//Printing out Menu choice
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println("3. Exit ");

		//interger to provide a choice
		System.out.print("Choice: ");
		int choice = input.nextInt();

		//switch to provide choice between fahrenheit to celsius to celsius to fahrenheit
		switch (choice){
		//each case will be a choice in the menu to provide with the equatiuon you want
		case 1:
			System.out.print("Enter temperature: ");
			double fahrenheit = input.nextInt();
			double celsius = 5.0/9.0*(fahrenheit-32);
			System.out.println(fahrenheit+" Fahrenheit is "+celsius+" Celsius");
		break;

		case 2:
			System.out.print("Enter temperature: ");
			celsius = input.nextInt();
			fahrenheit = 9.0/5.0*celsius+32;
			System.out.println(celsius+" Celsius is "+fahrenheit+" Fahrenheit");
		break;

		case 3:
			System.out.println("Exiting....");
		break;
		}

		System.out.println();

		//Links file to main programme index
		Index.main(null);

	}// end main
}// end class