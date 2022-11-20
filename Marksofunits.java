/*This program will compute the average marks for three units
 * This program asks a lecturer to enter marks for three units,
 * javaprogramming,networking and maths,compute the average then display it in the format
 * marks for javaprogramming is?
 * marks for networking is
 * marks for maths is?
 * the average is?
 */

package unitmarks;
//importing scanner claass
import java.util.Scanner;

public class Marksofunits {
	//using static method to get average
	static void findAverage() {
		
			//declaring variables
			double javaprogramming;
			double networking;
			double maths;
			double average;
			
			try(Scanner input = new Scanner(System.in)){
			/*ask student to enter marks for the first unit.*/
		    System.out.println("Enter the marks for javaprogramming:");
		    javaprogramming= input.nextDouble();
		    /*ask student to enter marks for the second unit.*/
		    System.out.println("Enter the marks for networking:");
		    networking = input.nextDouble();
		    /*ask student to enter marks for the third unit.*/
		    System.out.println("Enter the marks for maths:");
		    maths= input.nextDouble();
		   
		    
		    //getting average
	         average = (javaprogramming + networking + maths)/3;  
		    //diplay result for javaprogramming,networking and maths marks
		    System.out.println("Marks for javaprogramming is " + javaprogramming);
		    System.out.println("Marks for networking is " + networking);
		    System.out.println("Marks for maths " + maths);
		    
		    //output for average
			System.out.println( "The average is: " + average);
			}}
		    
			public static void main(String[] args) {
				//callihg static method to main method
					    findAverage();  
		    

	}}
