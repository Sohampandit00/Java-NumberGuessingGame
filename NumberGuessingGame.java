/**
* Write a description of class highLoiw here.
*
* @author (your name)
* @version (a version number or a date)
*/
import java.util.Scanner;
public class highLoiw
{
	public static void main(String [] args)
	{
		double randomNumber = Math.random() * 100;
		Scanner myScan = new Scanner(System.in);
		double userChoice;
		String tryAgain = "";
		do
		{
		System.out.println("Pick a number from 1 to 100: ");
		userChoice = myScan.nextDouble();
		if(userChoice == (int)randomNumber)
		{
		System.out.println("You got it!");
		tryAgain = "No";
		}else if(userChoice > (int)randomNumber)
		{
		System.out.println("Too high");
		System.out.println("Do you want to try again?");
		tryAgain = myScan.next();
		}
		else if(userChoice < (int)randomNumber)
		{
		System.out.println("Too low");
		System.out.println("Do you want to try again?");
		tryAgain = myScan.next();
		//System.out.println(tryAgain);
		}
		else
		System.out.println("Please enter a valid input");
		}while(tryAgain.equals("Yes"));
	}
}
