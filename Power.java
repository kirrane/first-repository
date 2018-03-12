import java.util.Scanner;

public class Power{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);


		System.out.print("Enter Base (negative to quit)= ");
		int base = input.nextInt();


		while(base >= 0){
			System.out.print("Enter exponent: ");
			int exponent = input.nextInt();

			System.out.println(base+" to the "+exponent+" power is "+integerPower(base, exponent));
			System.out.print("Enter Base (negative to quit)= ");
			base = input.nextInt();
			Index.main(null);
		}
	}
	public static int integerPower(int base, int exponent){
		int product = 1;
		for(int i = 1; i <= exponent; i++)
			product *= base;

		return product;

	}

}