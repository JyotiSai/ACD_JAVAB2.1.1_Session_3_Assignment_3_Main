package session3assignments; //Package declaration

/**
 * This class demonstrates Constructor Chaining within the same class using this keyword
 *
 */
public class ConstructorChainingSameClass 
{
	ConstructorChainingSameClass() //Default Constructor
	{
		this(5); //Calling Single parameterized constructor
		System.out.println("Default Constructor");
	}//End of ConstructorChainingSameClass()
	
	ConstructorChainingSameClass(int parameter) //Single parameterized constructor
	{
		this(10,20); //Calling double parameterized constructor
		System.out.println(parameter); //Printing value of parameter 
	} //End of Single parameterized constructor
	
	ConstructorChainingSameClass(int parameter1, int parameter2) //Double parameterized constructor
	{
		System.out.println(parameter1+parameter2); //Adding both the parameters and printing the value of resulting value
	}//End of Double parameterized constructor
	public static void main(String [] args) //main method
	{
		new ConstructorChainingSameClass(); //Calling default constructor
	} //End of main method
} //End of Class
