package session3assignments; //Package declaration

/**
 * This child class demonstrates Constructor Chaining between parent and child class using super keyword
 *
 */
public class ConstructorChainingParentChild extends ConstructorChainingSameClass
{
	public ConstructorChainingParentChild() //Default Constructor
	{
		super(9); //Calling single parameterized constructor of parent class using super keyword
		System.out.println("Child default constructor called.");
	}//End of default constructor
	
	public ConstructorChainingParentChild(String name) //Single parameterized constructor of child class 
	{
		super(); //Calling default constructor of parent class using super keyword
		System.out.println("Child parameterized constructor called: " +name); //Printing the name
	} //End of parameterized constructor
	public static void main(String [] args) //main method
	{
		new ConstructorChainingParentChild(); //Call to default constructor of child class
		new ConstructorChainingParentChild("Joy"); //Call to parameterized constructor of child class
	} //End of main method
} //End of class
