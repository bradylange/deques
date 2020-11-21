package deque_stack;

import deque.Deque;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: DequeAsStack
 * Language: Java
 * Date: 2/13/18
 * Description: This class contains attributes that relate to a stack data structure using the deques functions. 
 * Data Structure Functions: Push, Pop, Peek, Check Empty, Check Full
 */

// This class contains stack attributes 
public class DequeAsStack
{
	// Instance variables 
	private Deque stack;												// Use the deque data structure to obtain stack properties
	private int maxSize;												// Capacity of the stack
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Size
	public DequeAsStack(int size) 
	{
		// Instantiate properties with parameter values 
		maxSize = size;
		stack = new Deque(maxSize);
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Push Method -------------------
	// Method that inserts items in a stack manner of last in first out (Insert only one way)
	public void push(int input)
	{
		stack.insertRight(input);										// Insert from the right side of the stack
	}
// ------------------- End Push Method -------------------
	
// ------------------- Pop Method -------------------
	// Method that removes items in a stack in the manner of last in first out 
	public int pop()
	{
		return stack.removeRight();										// Return removed item - Remove from the right side of the stack
	}
// ------------------- End Pop Method -------------------
	
// ------------------- Peek Method -------------------
	// Method that allows the user see the top of the stack
	public int peek()
	{
		return stack.peekRight();										// Return the top item from the right side of the stack 											
	}
// ------------------- End Peek Method -------------------
	
// ------------------- Is Empty Method -------------------
	// Method that checks if the stack is empty
	public boolean isEmpty()
	{
		return stack.isEmpty();											// Return if the stack is empty 
	}
// ------------------- End Is Empty Method -------------------
	
// ------------------- Is Full Method -------------------
	// Method that checks if the stack is full
	public boolean isFull()
	{
		return stack.isFull();											// Return if the stack is full
	}
// ------------------- End Is Full Method -------------------
	
// ------------------- Get Size Method -------------------
	// Method that returns the size of the stack
	public int getSize()
	{
		return stack.getSize();											// Return the size of the stack
	}
// ------------------- End Get Size Method -------------------
} // End of class DequeAsStack
