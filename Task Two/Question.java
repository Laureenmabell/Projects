/*This program contains one non-static method, two static methods and a constructor
 */
package question4;

public class Question {
	//declaring a variable
	int num;
	
	//constructor
   public Question(){
    	 num = 2;
    }
   //non- static method
    void abc() {
		System.out.println("This is a non static method");
	}
    //static method
	static void abc2() {
		System.out.println("This is a static method" );
	}
	//static method
    static void abc3() {
		System.out.println("This is a Static method" );
	}
    //main method
	public static void main(String[] args) {
		//calling non static method to the main method
		Question myClass = new Question();
		myClass.abc();
		
		 // calling static method to main method
		abc2();
		abc3();
		
		//calling constructor to main method
        Question myObj= new Question();
        System.out.println(myObj.num);//prints value of num
	}
}
