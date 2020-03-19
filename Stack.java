package DataStructures;

/**
 * This is the Stack class. What a stack is is that it is a FILO (First-in-
 * last-out). When an object item is added to a stack array, then it will
 * add it to element 0 and the next to 1. When you want to remove an element
 * from the stack, it will remove the element that was most recently put in.
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B
 * Assignment: Data Structures: ArrayList-Like Structures, Stacks, and Queues
 * 
 */
public class Stack 
{
	//Instance variables
	private int numElements = 0;
	private Object[] stack = new Object[10];
	
	/**
	 * Precondition: All values are of the object n and are of the same type.
	 * 
	 * Postcondition: Adds the value n into the array. If the number of 
	 * elements reach the maximum capacity of the stack length, then it'll 
	 * expand.
	 * 
	 * @param n
	 */
	public void push(Object n)
	{
		 //If the number of elements reach the maximum capacity of the stack 
		//length, then it'll expand.
		if(numElements == stack.length) 
		{
			//Expands the stack
			expandArray();
		}
		
		//Otherwise, add n to the number of elements that it is currently
		//in and increment numElements.
		stack[numElements] = n;
		numElements++;
	}
	
	/**
	 * Precondition: There are values inside of the Stack.
	 * 
	 * Postcondition: Removes the element that was added last and shifts the 
	 * array to the left from where the Object was removed. 
	 */
	public Object pop()
	{
		//Make a temp variable to store what is being removed.
		Object tempV = stack[numElements - 1]; 
		
		//Make a copy array of the stack.
		Object[] temp = new Object[stack.length];
		
		//Copy the elements of stack to the copyArray after it is popped./
		for(int i = 0; i < numElements - 1; i++)
		{
			temp[i] = stack[i];
		}
		//Decrement elements
		numElements--;
		//Set the original stacks to the now popped copy array.
		stack = temp;
		//Return what was removed/popped.
		return tempV;
	}
	
	/**
	 * Precondition: NumElements is equal to the stack.length.
	 * 
	 * Postcondition: Expands the stack length by 2 and returns that.
	 */
	private void expandArray()
	{

		//Make a temporary array that expands the length.
		Object[] tempArray = new Object[stack.length * 2];
		
		//Copy the information in the stack array to the temp array.
		for(int i = 0; i < numElements ; i++) 
		{
			tempArray[i] = stack[i];
		}
		//Set the temp array to the original array so that the original
		//array now has the expanded length.
		stack = tempArray;
	}
	
	/**
	 * Precondition: The stack array is filled and none of the indices are 
	 * empty.
	 * 
	 * Postcondition: Returns the size of the stack.
	 * 
	 * @return numElements
	 */
	public int size()
	{
		return numElements;
	}
	
	/**
	 * Precondition: Checks if the stack is empty.
	 * 
	 * Postcondition: returns true if the stack array is empty and returns 
	 * false if the array is filled.
	 * 
	 * @return true if empty
	 * @return false if not empty
	 */
	public boolean isEmpty()
	{
		if(numElements == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	/**
	  * Precondition: Assuming all the methods work in the class.
	  * 
	  * Postcondition: Prints out what ever is needed into a string.
	  * In this case, it would print out the elements in the stack, but the 
	  * first element will be in last. 
	  * Ex. push.B push.A pushT will output: taB
	  * 
	  * @return String of all the elements
	  */
	public String toString()
	{
		String result = "";
		for(int i = numElements - 1; i >= 0; i--)
		{
			result += stack[i] + " ";
		}
		return result;
	}
	
	@Override
	 /**
	  * Precondition: All methods in the class are working, there is a 
	  * size of the stack
	  * 
	  * Postcondition: Returns true if the size of the stack and other
	  * are equal and if the individual elements inside both arrays are equal.
	  * If at least one of these conditions are not met, then it returns false.
	  * 
	  * @return true if all conditions are met, false if one of them doesn't.
	  */
	public boolean equals(Object n)
	{
		if(n == null)
		{
			return false;
		}
		//Type casts the n to a Stack class.
		Stack other = (Stack) n;
		
		//Checks if the size is equal
		if(this.size() != other.size())
		{
			return false;
		}
		
		//Goes through the elements and sees if the stack and the other is not
		//equal. Return false if they are not equal. 
		for(int i = numElements - 1; i >= 0; i--)
		{
			if(stack[i] != (other.pop()))
			{
				return false;
			}
		}
		return true;
	}
}
