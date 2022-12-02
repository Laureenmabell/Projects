package array;
//importing array class
import java.util.Arrays;
//importing scanner class
import java.util.Scanner;
public class Array {
    //creating static scanner object
        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Initializing unsorted int array
        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

     System.out.println("Enter 15 integer values to the array:");
     //getting the integer values
     
    myArray[0]=input.nextInt();//index[0]stores the 1st element
    myArray[1]=input.nextInt();//index[1] stores the 2nd element..
    myArray[2]=input.nextInt();
    myArray[3]=input.nextInt();
    myArray[4]=input.nextInt();
    myArray[5]=input.nextInt();
    myArray[6]=input.nextInt();
    myArray[7]=input.nextInt();
    myArray[8]=input.nextInt();
    myArray[9]=input.nextInt();
    myArray[10]=input.nextInt();
    myArray[11]=input.nextInt();
    myArray[12]=input.nextInt();
    myArray[13]=input.nextInt();
    myArray[14]=input.nextInt();//index[14] stores the 15th element

   //converting array to a string list
    String myList = Arrays.toString(myArray);
    
    //displaying elements in the array to user as a list
System.out.println("The elements of this array are:"+ myList);
System.out.println("Enter any element to check if it is in the array");
int numInput =input.nextInt();
find(myArray,numInput);
    }
    private static void  find(int[]arr,int toFind){
        //using linear search method
        boolean found= false;
        for(int num: arr){
            //checking if number is present or not
            if(num==toFind ){
                found = true;
                break;
            }}
        if(found){
            //printing results
            System.out.println(toFind + " is in the array.");
        }else{
            System.out.println(toFind+ " is not in the array.");
            }
        }


    }
    

