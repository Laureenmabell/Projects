/*create a java project,a package,a class,and in the class,
 * This program calculates the area of a triangle using three non-static methods
 * one method asks the user to enter the base and height
 * the other method computes the area of the triangle 
 * and the outher shows the output of the calculated area of the triangle 
 * and displays it to user
 */
package area;
//importing Scanner class
import java.util.Scanner;
public class Areaoftriangle {
		static double base,height,area;
		
		//non-static method to get the input of the base and height
		void baseHeight(){
		//creating scanner object
		try(Scanner scanner = new Scanner(System.in)){
		
		//getting input for the base and height
		System.out.println("Enter the base of the triangle");
		base = scanner.nextDouble();
		System.out.println("Enter the height of the triangle");
	    height = scanner.nextDouble();
		}}
		
		//non-static method to find the area of the triangle
		void findArea() {
	    //Area= (base*height)/2
	    
	    area=(base*height)/2;
		}
		
		//non static method to output calculated area
		void outputResults() {
	    //display area
	    System.out.println(" Area of triangle is:" + area);
		}
	    
		//main method
	    public static void main(String[] args) {
	    	//calling the non static methods to the main method
	    	Areaoftriangle myClass=new Areaoftriangle();
	    	myClass.baseHeight();
	    	myClass.findArea();
	    	myClass.outputResults();
	    	
	    	
	   }
	}
