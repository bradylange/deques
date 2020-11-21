package deque;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: Deque 
 * Language: Java
 * Date: 2/13/18
 * Description: This class contains attributes related to the algorithms of the Deque data structure.
 * Data Structure Functions: Insert Left/Right, Remove Left/Right, Peek Left/Right, Check Empty, Check Full
 */

// This class contains attributes and algorithms related to a deque data structure 
public class Deque 
{
	// Instance variables 
	private int left, right, numOfElems, CAPACITY, center;							// Left side of deque, Right size of deque, number of elements, max capacity, center of the deque					
	private int [] array;															// Deque container 
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Capacity 
	public Deque(int cap)
	{
		// Instantiate properties with parameter values 
		CAPACITY = cap;
		center = CAPACITY / 2 - 1; 													// Get the deque center, used for the insert left and insert right methods	
		left = center;
		right = center + 1;
		numOfElems = 0;
		array = new int[CAPACITY];
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Insert Left Method -------------------
	// Method that inserts an item from the left of the deque
	public void insertLeft(int lNum)
	{	
		if (isFull())																// Deque is full do not insert data
		{
			System.out.println("The deque is full. You cannot insert from the left.");
		}
		else if (left == -1) 														// Deque needs to wrap-around 
		{
			left = CAPACITY - 1;													// Wrap around deque to end of the array
			array[left] = lNum; 													// Place the new item into the array
			numOfElems++; 															// Increase the size of the array
			left--;																	// Shift left one position from the left side of the deque
		}	
		else 																		// Deque does not need to be wrapped around
		{
			array[left] = lNum;														// Place the new item into the array							
			numOfElems++;															// Increase the size of the array
			left--;																	// Shift left one position from the left side of the deque
		}
	}
// ------------------- End Insert Left Method -------------------
	
// ------------------- Insert Right Method -------------------
	// Method that inserts an item from the right of the deque
	public void insertRight(int rNum)
	{
		if (isFull())																// Deque is full do not insert data
		{
			System.out.println("The deque is full. You cannot insert from the left.");
		}
		else if (right == CAPACITY)													// Deque needs to wrap-around 
		{
			right = 0;																// Wrap around deque to beginning of the array
			array[right] = rNum; 													// Place the new item into the array
			numOfElems++; 															// Increase the size of the array
			right++;																// Shift right one position from the right side of the deque
		}
		else 																		// Deque does not need to be wrapped around
		{
			array[right] = rNum;													// Place the new item into the array
			numOfElems++;															// Increase the size of the array
			right++;																// Shift right one position from the right side of the deque
		}
		
	}
// ------------------- End Insert Right Method -------------------
	
// ------------------- Remove Left Method -------------------
	// Method that removes an item from the left of the deque
	public int removeLeft()
	{
		if (isEmpty())																// Deque is empty exit the method 
		{
			System.out.println("The deque is empty. You cannot remove from the left.");
			System.exit(-1);
			return -1;
		}
		else																		// Deque is not empty 
		{
			if (left >= CAPACITY - 1)												// Process wrap-around 
			{
				left = 0;															// Wrap around the deque - circular deque 
			}
			
			int temp = array[left + 1];												// Get number being removed 
			array[left + 1] = 0;													// Set removed value to default number
			left++;																	// Shift right one position from the left side of the deque 
			numOfElems--;															// Decrease array size 
			return temp;															// Return removed item 
		}
	}
// ------------------- End Remove Left Method -------------------
	
// ------------------- Remove Right Method -------------------
	// Method that removes an item from the right of the deque
	public int removeRight()
	{
		if (isEmpty())																// Deque is empty exit the method 
		{
			System.out.println("The deque is empty. You cannot remove from the right.");
			System.exit(-1);
			return -1;
		}
		else																		// Deque is not empty 
		{
			if (right <= 0)															// Process wrap-around
			{
				right = CAPACITY;													// Wrap around the deque - circular deque 
			}
			
			int temp = array[right - 1];											// Get number being removed 
			array[right - 1] = 0;													// Set removed value to default number
			right--;																// Shift left one position from the right side of the deque
			numOfElems--;															// Decrease the array size
			return temp;															// Return the removed item 
		}
	}
// ------------------- Remove Right Method -------------------
	
// ------------------- Peek Right Method -------------------
	// Method that returns the first value on the right side of the deque
	public int peekRight()
	{
		if(!isEmpty())																// Deque is not empty 
		{	
			return array[right];													// Return the right side value
		}
		else																		// Deque is empty 
		{
			System.out.println("Deque is empty you cannot peek from the right.");
			System.exit(-1);
			return -1;																// Return negative one as the deque is empty 
		}
	}
// ------------------- End Peek Right Method -------------------
	
// ------------------- Peek Left Method -------------------
	// Method that returns the first value on the left side of the deque
	public int peekLeft()
	{
		if(!isEmpty())																// Deque is not empty 
		{
			return array[left];														// Return the left side value
		}
		else																		// Deque is empty 
		{
			System.out.println("Deque is empty you cannot peek from the left.");
			System.exit(-1);
			return -1;																// Return negative one as the deque is empty 
		}
	}
// ------------------- End Peek Left Method -------------------
	
// ------------------- Is Empty Method -------------------
	// Method that checks if the deque is empty
	public boolean isEmpty()
	{
		if(numOfElems == 0)															// There are no elements 						
		{
			return true;															// Return deque is empty 
		}
		else																		// There are elements 
		{
			return false;															// Return deque is not empty 
		}
	}
// ------------------- End Is Empty Method -------------------
	
// ------------------- Is Full Method -------------------
	// Method that checks if the deque if full
	public boolean isFull()
	{
		if(numOfElems == CAPACITY)												// Elements equal the capacity 
		{
			return true;														// Return deque is full 
		}
		else																	// Elements do not equal the capacity  
		{
			return false;														// Return deque is not full
		}
	}
// ------------------- End Is Full Method -------------------
	
// ------------------- Get Size Method -------------------
	// Method that returns the size of the deque 
	public int getSize()
	{
		return numOfElems;														// Return the size of the deque 
	}
// ------------------- End Get Size Method -------------------
} // End of class Deque
