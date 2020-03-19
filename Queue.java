package DataStructures;

/**
 * This is the Queue class. What a stack is is that it is a FIFO (First-in-
 * first-out). When an object item is added to a queue array, then it will
 * add it to element 0 and the next to 1. When you want to remove an element
 * from the stack, it will remove the element that was first put in.
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B
 * Assignment: Data Structures: ArrayList-Like Structures, Stacks, and Queues
 * 
 */
public class Queue 
{
	//Instance variables
	private int numElements = 0;
	private Object[] queue = new Object[10];
	
	public void enqueue(Object n)
	{
		//If the number of elements reach the maximum capacity of the queue
		//length, then it'll expand.
		if(numElements == queue.length) 
		{
			//Expands the queue
			expandArray();
		}
			queue[numElements] = n;
			numElements++;
	}
	
	/**
	 * Precondition: There are values inside of the Queue.
	 * 
	 * Postcondition: Removes the element that was added first and shifts the 
	 * array to the right from where the Object was removed. 
	 */
	public Object dequeue()
	{
		//Initialize the front of the array.
		int front = 0;
		//Set a temporary Front to the actual front.
		Object tempF = queue[front]; 
		
		//Make a temp array that will store queue length.
		Object[] temp = new Object[queue.length];
		
		//Go through each element to numElements - 1. This is to avoid the 
		//ArrayOutOfBoundsException thrown inside the for loop.
		for(int i = 0; i < numElements - 1; i++)
		{
			//Set the temp array to when the element was removed. 
			temp[i] = queue[i + 1];
		}
		
		//Update front so that after removing, it will display the new front.
		front = front + 1;
		
		//Set the original queue to the new updated temp array.
		queue = temp;
		
		//Decrement numElements to reduce the size after removing.
		numElements--;
		
		//Return the removed element.
		return tempF;
	}
	
	/**
	 * Precondition: NumElements is equal to the queue.length.
	 * 
	 * Postcondition: Expands the queue length by 2 and returns that.
	 */
	private void expandArray()
	{
		//Make a temporary array that expands the length.
		Object[] tempArray = new Object[queue.length * 2];
		
		//Copy the information in the stack array to the temp array.
		for(int i = 0; i < queue.length; i++) 
		{
			tempArray[i] = queue[i];
		}
		
		//Set the temp array to the original queue so that the original
		//queue now has the expanded length.
		queue = tempArray;
	}
	
	/**
	 * Precondition: The stack array is filled and none of the indices are 
	 * empty.
	 * 
	 * Postcondition: Returns the size of the queue.
	 * 
	 * @return numElements
	 */
	public int size()
	{
		return numElements;
	}
	
	/**
	 * Precondition: Checks if the queue is empty.
	 * 
	 * Postcondition: returns true if the queue array is empty and returns 
	 * false if the queue array is filled.
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
	  * In this case, it would print out the elements in the queue
	  * 
	  * Ex. enqueue.B enqueue.a enqueue.t will output: Bat
	  * 
	  * @return String of all the elements
	  */
	public String toString()
	{
		String result = "";
		for(int i = 0; i < numElements ; i++)
		{
			result += queue[i];
		}
		return result;
	}
	
	@Override
	 /**
	  * Precondition: All methods in the class are working, there is a 
	  * size of the stack
	  * 
	  * Postcondition: Returns true if the size of the ArrayList and other
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
		
		//Type casts the n to a Queue class.
		Queue other = (Queue) n;
		
		//Checks if the size is equal
		if(this.size() != other.size())
		{
			return false;
		}
		
		//Goes through the elements and sees if the queue and the other is not
		//equal. Return false if they are not equal. 
		for(int i = 0; i < numElements; i++)
		{
			Object temp = other.dequeue();
			if(queue[i] != (temp))
			{
				return false;
			}
		}
		return true;
	}
}
