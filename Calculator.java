/*This program creates a calculator that helps the
 *  user to perform the basic operations(+,-,* and /)
 */

package calculator;
//importing Scanner class
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	//store two numbers
	double num1,num2;
	Scanner scanner= new Scanner (System.in);	
	
	System.out.println("Enter the first number");
	//take input from the user	
	num1 = scanner.nextDouble();
	System.out.println("Enter the second number");
	//take input from the user	
	num2 = scanner.nextDouble();
	
	System.out.println("Enter any operator(+,-,*,/):");
	char operator = scanner.next().charAt(0);
	
	scanner.close();
	double output;
	
	switch(operator) {
	//case to add two numbers
	case'+':
		output= num1 + num2;
		break;
	//case to subtract two numbers
	case'-':
		output= num1 - num2;
		break;
	//case to multiply two numbers
	case'*':
		output= num1 * num2;
		break;
    //case to divide two numbers
	case'/':
		output= num1 / num2;
		break;	
	/*if user enters any other operator or char apart from 
	 * +,-,* and /,then display an errror messsage to the user
	 * 
	 */	
	 default:
		 System.out.println("You have entered the wrong operator");
		 return;
	}
	 //print the final result
	 System.out.println(num1 + "" + operator + "" + num2 + " = " + output);
	}
}
