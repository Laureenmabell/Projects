/*Create a java project,name it methods_in_java and in project 
 * create package named java_methods and in package
 * create class named methods
 * In this program we write a method that asks a lecturer to enter three numbers,
 *  using if statement and determine the largest,smallest and display
 *  the results in the format
 *  The smallest number?
 *  The largest number
 *  ? is your largest number and ? smallest number.
 */

package java_methods;
//importing scanner class
import java.util.Scanner;
public class Methods {

	public static void main(String[] args) {
		//creating scanner object
		try(Scanner input= new Scanner(System.in)){
		//declaring variables
		double num1,num2,num3,smallest,largest;
		
		System.out.println("Enter the first number");
		//getting first number
		num1=input.nextDouble();
		System.out.println("Enter the second number");
		//getting second number
		num2=input.nextDouble();
		System.out.println("Enter the third number");
		//getting third number
		num3=input.nextDouble();
		
		//getting return values from the static methods
		smallest = findsmallest(num1,num2,num3);
	    largest = findlargest(num1,num2,num3);
		
	    //output of the smallest and largest number
		System.out.println("Smallest number is " + smallest);
		System.out.println("Largest number is " + largest);
		System.out.println(smallest + " is the smallest number and " +largest+ " is the largest number ");
	}}
		
    //static method that will find the smallest number
	static double findsmallest (double num1,double num2,double num3) {
			double smallest = num1;
			if(num2 < smallest) {
				smallest= num2;
			}
			if (num3< smallest) {
				smallest = num3;
			}
			return smallest;
			}
	//static method wiil that find the largest number
	static double findlargest(double num1,double num2,double num3) {
	       double largest= num1;
			if(num2 > largest) {
				largest= num2;
			}
			if (num3> largest) {
				largest = num3;
			}
			return largest;
		}}
				
		
		       
		 