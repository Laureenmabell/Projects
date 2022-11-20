/*In this program we write a method that asks user to enter the year,
 *  checks if it is a leap year and outputs the text 'the year you entered is a leap year'
 */

package leapyear;
//importing Scanner class
import java.util.Scanner;

public class Leapyear {
	
        //static method to find leap year
	    static void Findleapyear(){
		//variable to store the year
		int year;
		//creating scanner object
		try(Scanner scan = new Scanner(System.in))
		{
		System.out.println("Enter any year:");
		year = scan.nextInt();
		//if year is divisible by 4 it ia a leapyear
		//if year is not divisible by 100 it is not a leap year
		//if year is divisible by 400 it is a leap year
		if (((year % 4==0) && (year % 100!=0))||(year % 400 == 0))
	    //output
			System.out.println( " The year you entered is a leap year.");
			else
			System.out.println( " The year you entered is a not a leap year.");
		}}
	    
		//this is the main method
		public static void main(String[] args) {
			
			//call static method to main method
			Findleapyear();
          }
	  }


	
	
		
	
