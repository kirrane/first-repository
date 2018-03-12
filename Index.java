/// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-9):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch Lab");
    System.out.println("3. Methods Lab");
    System.out.println("4. Return Methods");
    System.out.println("5. Power Lab");
    System.out.println("6. Shadowing");
    System.out.println("7. Overloading");
    System.out.println("8. Reverse");
    System.out.println("9. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      	case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); //static method call, no instance required.
        break;
      	case 2:
        System.out.println("Switch lab");
        System.out.println();
        FirstSwitch.main(null);
        break;
      	case 3:
        System.out.println("Methods lab");
        System.out.println();
        Methods.main(null);
        break;
        case 4:
		System.out.println("Return Methods");
		System.out.println();
		Methods.main(null);
        break;
        case 5:
		System.out.println("Power Lab");
		System.out.println();
		Power.main(null);
        break;
        case 6:
		System.out.println("Shadowing");
		System.out.println();
		Shadow.main(null);
		break;
		case 7:
		System.out.println("Overloading Lab exercise");
		System.out.println();
		Arithmetic.main(null);
		break;
		case 8:
		System.out.println("Reverse Digits Method");
		System.out.println();
		Reverse.main(null);
		break;
        case 9:
		System.out.println("Exiting...");
        break;
      	default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}