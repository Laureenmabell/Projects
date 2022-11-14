/*This program will determine the number of characters in the sirname
 * and display odd or even depending with the age number
 * The program asks the user to enter the sirname and current age 
 * then print the number of characters in the sirname and 
 * even or odd according to the age number 
 */

package ageandsirname;
//importing scanner class
import java.util.Scanner;

public class AgeandSirname {

	public static void main(String[] args) {
		try(Scanner input= new Scanner(System.in)) {
	    	  
	          //input user's Sirname
		      System.out.println("Enter your Sirname:"); 
		      var sirname = input.nextLine();
		      
		      //input user's age
		      System.out.println("Enter your age:");
		      var age = input.nextInt();//it stores age of the user
		      
		      //input the number of characters in the Sirname
		      var sirnameLength = sirname.length();//stores the number of characters in the sirname
		      
		      //is the age even or odd
		      String evenOdd;//stores odd or even
		      //if modulus of the age by 2 is 0
		      if((age % 2)==0 ) {
		          //(evenOdd)is even
		    	  evenOdd="even";
		    	  }		
		    	  else {
		    	  //else (evenOdd)is odd
		    	  evenOdd= "odd";	   
		      }
		      //the output
		      System.out.println("The number of characters in your Sirname is:" + sirnameLength);
		      System.out.println("Your current age is an " + evenOdd + " number.");
		}
	}
}
	
