/// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-3):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch Lab");
    System.out.println("3. Methods Lab");
    System.out.println("4. Return Methods");
    System.out.println("5. Power Lab");
    System.out.println("6. Exit");

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
		Methods.main(null);
        break;
        case 6:
		System.out.println("Exiting...");
		System.out.println();
		Methods.main(null);
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}