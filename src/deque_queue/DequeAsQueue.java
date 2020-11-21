package deque_queue;

import deque.Deque;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: DequeAsQueue
 * Language: Java
 * Date: 2/13/18
 * Description: This class contains attributes that relate to a queue data structure using the deques functions. 
 * Data Structure Functions: Insert Left, Remove Right, Peek Right, Check Empty, Check Full
 */

// This class contains functions of the queue data structure using the Deque class.
public class DequeAsQueue
{
	// Instance variables
	private Deque queue;													// Use the deque data structure to obtain queue properties
	private int maxSize;													// Capacity of the queue 
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Size
	public DequeAsQueue(int size)
	{
		// Instantiate properties with parameter values 
		maxSize = size;
		queue = new Deque(maxSize);
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Insert Method -------------------
	// Method that inserts from one side of the queue
	public void insert(int input)
	{
		queue.insertLeft(input);											// Insert items from the left of the queue 				
	}
// ------------------- End Insert Method -------------------
	
// ------------------- Remove Method -------------------
	// Method that removes from the opposite side of where it is being inserted using 'FIFO'
	public int remove()
	{
		return queue.removeRight();											// Return first item - Remove items from the right of the queue 
	}
// ------------------- End Remove Method -------------------
	
// ------------------- Peek Front Method -------------------
	// Method that allows the user to see the front data
	public int peekFront()
	{
		return queue.peekRight();											// Return the first item in the queue 				
	}
// ------------------- End Peek Front Method -------------------
	
// ------------------- Is Empty Method -------------------
	// Method that checks if the queue is empty
	public boolean isEmpty()
	{
		return queue.isEmpty();												// Return if the queue is empty 
	}
// ------------------- End Is Empty Method -------------------
	
// ------------------- Is Full Method -------------------
	// Method that checks if the queue is full
	public boolean isFull()
	{
		return queue.isFull();												// Return if the queue is full 
	}
// ------------------- End Is Full Method -------------------
	
// ------------------- Get Size Method -------------------
	// Method that returns the size of the queue
	public int getSize()
	{
		return queue.getSize();												// Return the size of the queue 
	}
// ------------------- End Get Size Method -------------------
} // End of class DequeAsQueue
