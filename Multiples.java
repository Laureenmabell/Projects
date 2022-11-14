/*This program displays all the multiples  
 * of 2,3 and 7 within the range 71 t0 50
 */

package multiples;
public class Multiples {

	public static void main(String[] args) {
		System.out.println("\nMultiple of 2:");
		//getting the multiples of 2
		for(int num =71;num<=150; num++) {
		//if number is divisible by 2 then it is a multiple of 2
		 if (num % 2==0) 
			 System.out.print(num +",");
		 
		 }
		 System.out.println("\n\nMultiple of 3:");
		 //getting the multples of 3
		 for(int num =71;num<=150; num++) {
		 //if number is divisible by 3 then it is a multiple of 3	
			 if (num % 3==0) 
			    System.out.print(num +",");
		}
		System.out.println("\n\nMultiple of 7:");
		//getting the multiples of 7
		for(int num =71;num<=150; num++) {
		//if number is divisible by 7 then itis a multiple of 7	
			if (num % 7==0) 
				 System.out.print(num +",");
		}
		//print output
		System.out.println("\n");
	}
}


