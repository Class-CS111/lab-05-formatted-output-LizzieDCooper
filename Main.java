//STUDENT NAME: Lizzie Cooper
// COLLABORATORS: N/A
//DATE: 2/16/25
// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double numStart = 3.80;
    int numRemain = 0;
    int numQuarters = 0; 
    int numDimes = 0;
    int numNickels = 0;

    //CALCULATION SECTION
    //Quarters
    numRemain = (int) (100 * numStart);
    numQuarters = numRemain / 25;
    numRemain %= 25; 
    //Dimes
    numDimes = numRemain / 10;
    numRemain %= 10; 
    //Nickles
    numNickels = numRemain / 5;
    numRemain %= 5; 

    //OUTPUT SECTION
    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickles, and %d pennies", 
    numStart, numQuarters, numDimes, numNickels, numRemain);
  }

}
