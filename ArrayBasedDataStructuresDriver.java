package DataStructures;

/*
 * The ArrayBasedBataStructuresDriver will test each methods in different 
 * class. This driver will test the methods in the Stack class, the methods
 * in the Queue class, and the methods in the ArrayList class. 
 * 
 * @author: Sung Ho Park
 * Class: CSS 143 B
 * Assignment: Data Structures: ArrayList-Like Structures, Stacks, and Queues
 */

public class ArrayBasedDataStructuresDriver 
{
	/**
	 * Precondition: Assuming it works, it should call in all the correct methods
	 * 
	 * Postcondition: It should return the methods and each methods correct 
	 * functions.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Methods to test
		stackTests();
		queueTests();
		arrayListTests();
	}

	/**
	 * Precondition: This will test each of the methods that is in the
	 * ArrayList class.
	 * 
	 * Postcondition: Returns the value or the print value of those methods
	 * and returns them correctly.
	 * 
	 */
	private static void arrayListTests()
	{

		System.out.println("Test for ArrayLists");
		System.out.println();
		
		//Calls the objects of the class ArrayLists 
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		
		//Check to see if ArrayList is empty
		System.out.println("Is the Array Empty?: " + a.isEmpty());
		
		//Insert the Object item at a specific index
		a.insert('B', 0);
		a.insert('a',0);
		a.insert('t',1);
		a.insert('B');
		a.insert('a');
		a.insert('t');
		a.insert('B');
		a.insert('a');
		a.insert('t');
		a.insert('B');
		a.insert('a');
		a.insert('t');
		
		//Is it empty?
		System.out.println("Is the Array Empty?: " + a.isEmpty());
		//Print it out
		System.out.println("Here is ArrayList\"a\": " + a.toString());
		
		//Insert the Object item at a specific index
		b.insert('B', 0);
		b.insert('a',0);
		b.insert('t',1);
		System.out.println("Here is ArrayList\"b\": " + b.toString());
		
		//Check to see if they are equals
		System.out.println("a and b are made, Are they equal?: " 
													+ a.equals(b));
		
		//Use the method get to get element at index
		System.out.println("The index at 1 is: " + a.get(1));
		//Get the size of the array
		System.out.println("The size of the array is: " + a.size());
		//Get the index of the the element
		System.out.println("The index of 't' is: " + a.indexOf('t'));
		
		//Loop around and remove each element at index 0 if "a" is not empty 
		while(a.isEmpty() == false) 
		{
			System.out.println("The Element removed is: " + a.remove(0));
		}
		System.out.println("");
	}

	/**
	 * Precondition: This will test each of the methods that is in the Queue 
	 * class.
	 * 
	 * Postcondition: Returns the value or the print value of those methods
	 * and returns them correctly.
	 */
	private static void queueTests() 
	{

		System.out.println("Test for Queues");
		System.out.println();
		
		//Make a new instance of the class for Queue
		Queue a = new Queue();
		Queue b = new Queue();
		
		//Check to see if the queue array is empty
		System.out.println("Is the Queue empty?: " + a.isEmpty());
		
		//Add elements in the instance variable
		a.enqueue('B');
		a.enqueue('a');
		a.enqueue('t');
		
		//Is it empty now?
		System.out.println("Is the Queue empty now?: " + a.isEmpty());
		//Print out the Queue array for a 
		System.out.println("The \"a\" Queue is: " + a.toString());
		
		//Add
		b.enqueue('B');
		b.enqueue('a');
		b.enqueue('t');
		
		//Print out the Queue array for b 
		System.out.println("The \"b\" Queue is: " + b.toString());
		
		//Are they equals? Call the equals method
		System.out.println("a and b are made, Are they equal?: " 
													+ a.equals(b));
		
		//Loop around and remove the element that first came in, if "a" is not
		//empty 
		while(a.isEmpty() == false)
		{
			System.out.println("The element that is dequeued is "
													+ a.dequeue());
		}
		System.out.println("");

	}

	/**
	 * Precondition: This will test each of the methods that is in the Stack 
	 * class.
	 * 
	 * Postcondition: Returns the value or the print value of those methods
	 * and returns them correctly.
	 * 
	 */
	private static void stackTests() 
	{
		System.out.println("Test for Stacks");
		System.out.println();
		//Make a new instance of the class for Stack
		Stack a = new Stack();
		Stack b = new Stack();
		
		//Check if the stack is empty
		System.out.println("Is the Stack empty?: " + a.isEmpty());
		a.push('B');
		a.push('a');
		a.push('t');
		a.push('B');
		a.push('a');
		a.push('t');
		a.push('B');
		a.push('a');
		a.push('t');
		a.push('B');
		a.push('a');
		a.push('t');
		
		//Is it empty now? Check
		System.out.println("Is the Stack empty?: " + a.isEmpty());
		//Print out the "a" Stack
		System.out.println("The \"a\" Stack is: " + a.toString());
		
		b.push('B');
		b.push('a');
		b.push('t');
		
		
		//Print out the "b" stack
		System.out.println("The \"b\" Stack is: " + b.toString());
		//Are they equal? Check
		System.out.println("a and b are made, Are they equal?: " 
													+ a.equals(b));
		
		//Loop around and remove the element that came in last, if "a" is not
		//empty 
//		while(a.isEmpty() == false) 
//		{
//			System.out.println("The Element removed is: " + a.pop());
//		}
	 System.out.println("");
	}
}

