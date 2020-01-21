package eggs;


import eggs.Menu;
import eggs.Vessel;
import eggs.Boiling;
import java.util.Scanner;

public class Test {
 
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Menu ob = new Menu();

	    System.out.println("********************Welcome to the Kitchen!********************");
	    System.out.println("              Please Select From The Following Options:               ");
	System.out.println("**********************************************************************");
	boolean quit = false;
	int choice;
	Vessel eg = new Vessel();
	Boiling b = new Boiling();
    do{

        ob.dispMenu();
        choice = input.nextInt();
        System.out.println("\n\n");
        switch (choice) {
              case 1:
            	eg.addEgg(eg);
            	System.out.println("Next step.Clean and fill with cold water.");
            	System.out.println("Next step.After they Bury.....");
            	System.out.println("Next step.Choice time for boil:3/5 or more.");
              case 2:
            	  System.out.println("\n\n");
            	  b.boilTime(b);
              case 3:
            	  System.out.println("Wait a minute for them go grow and peel off! " +
            	  		"Have a nice day!");
            	  break;
              default:

                  System.out.println("Invalid choice.");
              case 0:

                  quit = true;

                  break;
            }
      } while (!quit);

      System.out.println("Bye-bye!");



              

       
        
}
}
