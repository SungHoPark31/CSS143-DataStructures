package DataStructures;

/**
 * The ArrayList makes it so that you can dynamically change the values 
 * of the number of elements. What this class is doing is that it will
 * insert an Object at any given index, remove an Object at any given 
 * index, get the index, get the Element, size, etc. 
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B
 * Assignment: Data Structures: ArrayList-Like Structures, Stacks, and Queues
 */
public class ArrayList
{
	//Instance variables.
	private int numElements = 0;
	private Object[] array = new Object[10];
	
	/**
	 * Precondition: Assuming that there is a length this will add the object 
	 * inside of the desired index.
	 * 
	 * Postcondition: Add the object n to the desired index in the array. If 
	 * the length is equal to number of elements, expand the array.
	 * @param n
	 * @param index
	 */
	public void insert(Object n, int index)
	{
		
		//If the size is zero or the index is bigger than the size
		//increment the size 
		expandArray();
		//Put the Object into the index of the array and increment
		array[numElements] = n;
		numElements++;
	}
	
	public void insert(Object n)
	{
		
		//If the size is zero or the index is bigger than the size
		//increment the size 
		expandArray();
		//Put the Object into the index of the array and increment
		array[numElements] = n;
		numElements++;
	}
	
	/**
	 * Precondition: There is a length and there are elements inside of
	 * the array.
	 * 
	 * Postcondition: Removes the object in the index and returns the 
	 * object that is removed. 
	 * 
	 * @param index
	 * @return Object
	 */
	public Object remove(int index)
	{
		//If the size is less than the index, then throw an error.
		if(numElements > array.length)
		{
			System.out.println("Error, you can't do that");
			return null;
		}
		else
		{
			//Made a temporary array
			Object temp = array[index];
			Object[] tempArray = new Object[array.length];
			
			//This will copy the array starting from 0 to where the index 
			//before the index was
			
			for(int i = 0; i < index; i++)
			{
				tempArray[i] = array[i];
			}
			
			//This will copy the array starting from the index after the 
			//index removed and will copy that on till it reaches array.length
			//minus 1 because we removed an index.
			for(int i = index + 1; i < array.length - 1; i++)
			{
				tempArray[i - 1] = array[i];
			}
			
			array = tempArray;
			//subtract size due to removing. 
			numElements--;
			return temp;
		}
	}
	
	/**
	 * Precondition: The Object n that we are looking for is in the array.
	 * 
	 * Postcondition: Return the index that the Object n is in.
	 * @param n
	 * @return index
	 */
	public int indexOf(Object n)
	{
		//Goes through the array and if n is found, then 
		// return the index.
		for(int i = 0; i < numElements; i++)
		{
			if(array[i] == n)
			{
				return i;
			}
		}
		//or else return -1.
		return -1;
	}
	
	/**
	 * Precondition: If the array reaches out of bounds and throws an
	 * ArrayOutOfBoundsException.
	 * 
	 * Postcondition: Makes a temp array, expands the array and sets the 
	 * values of the array into temp array.
	 */
	private void expandArray()
	{
		if(numElements == array.length)
		{
			Object[] tempArray = new Object[array.length * 2];
			for(int i = 0; i < array.length; i++) 
			{
				tempArray[i] = array[i];
			}
			array = tempArray;
		}
	}
	
	/**
	 * Precondition: This is if the array is empty.
	 * 
	 * Postcondition: returns true if the array is empty and returns false 
	 * if the array is filled.
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
	
	/**
	 * Precondition: All the elements are in the array.
	 * 
	 * Postcondition: Goes to the specific
	 * index and returns the element in that index.
	 * 
	 * @param index
	 * @return Object
	 */
	public Object get(int index)
	{
		return array[index];
	}
	
	/**
	 * Precondition: The array is filled and none of the indices are 
	 * empty.
	 * 
	 * Postcondition: Returns the size of the ArrayList.
	 * 
	 * @return numElements
	 */
	public int size()
	{
		return numElements;
	}
	
	@Override
	 /**
	  * Precondition: All methods in the class are working, there is a 
	  * size of the ArrayList
	  * 
	  * Postcondition: Returns true if the size of the ArrayList and other
	  * are equal and if the individual elements inside the array are equal.
	  * If at least one of these conditions are not met, then it returns false.
	  * 
	  * @return true if all conditions are met, false if one of them doesn't
	  */
	public boolean equals(Object other)
	{
		if(other == null)
		{
			return false;
		}
		ArrayList other1 = (ArrayList) other;
		
		for(int i = 0; i < numElements; i++)
		{
			if(array[i] != other1.get(i))
			{
				return false;
			}
		}
		return true;
	}
	
	@Override
	/**
	  * Precondition: Assuming all the methods work in the class.
	  * 
	  * Postcondition: Prints out what ever is needed into a string.
	  * In this case, it would print out the elements in the ArrayList.
	  * 
	  * @return String of all the elements
	  */
	public String toString()
	{
		String result = "";
		for(int i = 0; i < numElements; i++)
		{
			result += array[i];
		}
		return result;
	}
	
}
	


