package primenumber;
//importing Scanner class
import java.util.Scanner;
public class Primenumber {
    //static method
   static boolean isPrime(int number){
           for(int num =2; num <= number/2; num++)
           {
               //condition for the non-prime number
               if(number% num ==0){
                   return false;
               }
           }
           return true;
       }
                   
   //main method which displays all prime numbers between 1 to 500
    public static void main(String[] args) {
        //creating scanner object
        try(Scanner scanner= new Scanner (System.in)){
        System.out.println("Prime numbers between 1 to 500");
        //getting primenumbers between 1 to 500
        for (int num =1; num <=500; num++){
          
            if (isPrime(num)){
                System.out.println(num + " is a prime number");
            } else{
                 System.out.println(num + " is not a prime number");
            }
        }
           scanner.close();     
    }}}