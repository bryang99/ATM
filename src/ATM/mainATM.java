package ATM;
/* Bryan Gonzalez
Program Project #5.13: ATM class
Brief Description: 
1. Input - Ask user for Pin(4 integers such as 2468)
2. Processing -  Apply while-loop and conditional if-else processing
3. Output: 
Refer to sample run of output
*/
//Message
public class mainATM {

	public static void main(String[] args) 
	{	
		ATM test  = new ATM();
		test.comparePin();
	}
}
/* Sample Output:
 Enter PIN: 
123
Your PIN is incorrect. You have 2 more times.
Enter PIN: 
1234
Your PIN is correct! 
 */