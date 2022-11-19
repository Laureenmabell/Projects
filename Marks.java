/*This program will compute the marks of five units done by a student
 * The program will ask the student to enter the marks for the
 * five units,compute the average and 
 * display the average on the screen which should be in 2 decimal places
 */

package marks;
//importing Scanner class
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
	//declaring variables
	double networks,entrepreneurship,accounting,programming,datastructure,average;
	try(Scanner input = new Scanner(System.in)){
	/*ask student to enter marks for the first unit.*/
    System.out.println("Enter the marks for networks:");
    /*getting networks marks and string it in the networks variable*/
    networks= input.nextDouble();
    System.out.println("Enter the marks for entrepreneurship:");
    /*getting entrepreneurship marks and string it in the networks entrepreneurship */
    entrepreneurship = input.nextDouble();
    System.out.println("Enter the marks for accounting:");
    /*getting accounting marks and string it in the networks accounting*/
    accounting= input.nextDouble();
    System.out.println("Enter the marks for programming:");
    /*getting programming marks and string it in the networks programming */
    programming = input.nextDouble();
    System.out.println("Enter the marks for datastructure:");
    /*getting networks marks and string it in the networks datastructure*/
    datastructure = input.nextDouble();
    
    //compute average
    average=( networks + entrepreneurship + accounting + programming + datastructure)/5;
    //display average
    System.out.println("The Average is " + average);
    System.out.format("% 2f average in 2 decimal places "+ average}
	 } 
	}
   }
