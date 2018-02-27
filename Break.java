import java.util.Scanner;

public class Break {
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int counter = 0;

	System.out.println("Guess Number from 1 to 10.");
	System.out.println("You have 10 attempts: ");


	while(input.hasNext()){
		if(input.nextInt() == 8){
			System.out.println("Match found. It is 8.");
			break;
		}

	counter++;
	if(counter == 10){
		System.out.println("No match found.");
	break;
 	}
   }
  }
}