package ATM;
import java.util.Scanner;

/**
   ATM class that determine whether userPin is same/not the same from Pin(1234). 
*/
public class ATM {
	//Instance variables
	final private int Pin = 1234;
	private int userPin;
	    /**
	      Compares pin(1234) with userPin, applying loop processing and conditional processing
	     */
	    public void comparePin()
	    {  
	    	try (Scanner sc = new Scanner(System.in)) 
	    	{
				System.out.println("Enter PIN: ");
				   userPin = sc.nextInt();
				   if (Pin == userPin)
				   {    
				       System.out.println("Your PIN is correct!");
				     
				       System.exit(0); // exit(0) ends program
				   }
				   int counter = 1;
				   while (Pin != userPin && counter <= 3)
				   {
				       if (counter!=3) //Keep asking for input
				       {
				           System.out.println("Your PIN is incorrect. You have "+(3-counter)+" more times.");
				           System.out.println("Enter PIN: ");
				           userPin = sc.nextInt();
				           if (userPin == Pin) //Ouput correct
				           {    
				              System.out.println("Your PIN is correct!");
				             
				              System.exit(0); //exit(0) ends program
				           }
				       counter++; //Increment counter 
				       }
				       else //Ran out of three times to input Pin
				       {
				           System.out.println("Entered incorrect PIN three times. Your bank card is blocked");
				           System.exit(0);
				       }
				
				   }
			}
	    }
};
	

