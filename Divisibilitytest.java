/*This program helps kids learn the divisibility test of numbers
 * The program checks whether the given integer is 
 * divisible by integers in the range of 0-9
 */

package divisibilitytest;
//Importing Scanner class
import java.util.Scanner;
public class Divisibilitytest {

	public static void main(String[] args) {
	int num;
	try(Scanner scanner = new Scanner(System.in)){
	//take input from the user
	System.out.println("Enter any number:");
	num = scanner.nextInt();
	{
	/*The divisibility rules state that the number is divisible by;
	 * 1 - if any number is divisible by 1
	 * 2- if it ends with an even number
	 * 3- if the sum of the digits are divisible by 3
	 * 4- if the last 2 digits are divisible by 4
	 * 5- if the last digits is 0 or 5
	 * 6- if the number is divisible by both 2 and 3
	 * 7-if the differences between twice the unit digit of the given number and the remaining part of 
	 * the given number should be a multiple of 7 or it should be equal to 0
	 * 8-if the last 3 digits form a number divisible by 8
	 * 9-if the sum of the digits is divisible by 9
	 */
	}
	//create if else statement
	if (num %1 ==0) {
		//display output
		System.out.println(num + " is divisible by 1,because any number divided by 1 will give the number itself");
	}else {
		System.out.println(num + " is not divisible by 1");
	}
	if (num % 2==0) {
		//display output
		System.out.println(num + " is divisible by 2,because it ends with an even number");
	}else {
		System.out.println(num + " is not divisible by 2");
	}
	if (num % 3==0) {
		//display output
		System.out.println(num + " is divisible by 3,because the sum of its digits is divisible by 3");
	}else {
		System.out.println(num + " is not divisible by 3");
	}
	if (num %4 ==0) {
		//display output
		System.out.println(num + " is divisible by 4,because the last two digits are divisible by 4");
	}else {
		System.out.println(num + " is not divisible by 4");
	}
	if (num %5 ==0) {
		//display output
		System.out.println(num + " is divisible by 5,because it ends with 0 or 5");
	}else {
		System.out.println(num + " is not divisible by 5");
	}
	if (num %6 ==0) {
		//display output
		System.out.println(num + " is divisible by 6,because it is divisible by both 2 and 3");
	}else {
		System.out.println(num + " is not divisible by 6");
	}
	if (num % 7==0) {
		//display output
		System.out.println(num + " is divisible by 7,because it has a reminder of zero when divided by 7");
	}else {
		System.out.println(num + " is not divisible by 7");
	}
	if (num % 8==0) {
		//display output
		System.out.println(num + " is divisible by 8,because the last three digits are divisible by 8 ");
	}else {
		System.out.println(num + " is not divisible by 8");
	}
	if (num % 9==0) {
		//display output
		System.out.println(num + " is divisible by 9,because the sum of its digits is divisible by nine");
	}else {
		System.out.println(num + " is not divisible by 9");
	  }
   }
}}

