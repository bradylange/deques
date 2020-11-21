package deque_stack;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: DequeAsStackApplication
 * Language: Java
 * Date: 2/13/18
 * Description: This program tests the functionality of the deque used as a stack data structure.
 */

//This program tests the functionality of the deque used as a stack data structure 
public class DequeAsStackApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args) 
	{
		// Instantiate the stack 
		DequeAsStack stack = new DequeAsStack(3);
		 
		System.out.println("***************************************** Deque Used as a Stack: *******************************************");
		
		// Push values into the stack
		int val1 = 20, val2 = 3, val3 = 24;
		stack.push(val1);
		stack.push(val2);
		stack.push(val3);
		System.out.println("Pushed Values into the Stack: ");
		System.out.println("********************************************************************************************************");
		System.out.println(val3 + "\n" + val2 + "\n" + val1);
		System.out.println("********************************************************************************************************\n");
		
		// Peek the top of the stack
		System.out.println("Peeking the Top of the Stack: ");
		System.out.println("********************************************************************************************************");
		System.out.println(stack.peek());
		System.out.println("********************************************************************************************************\n");
		
		// Remove all of the values from the stack
		int size = stack.getSize();
		System.out.println("Remove (Pop) All Values from the Stack: ");
		System.out.println("********************************************************************************************************");
		for (int i = 0; i < size; i++)
		{
			int pop = stack.pop();
			System.out.println("Removed (Popped): " + pop);
		}
		System.out.println("********************************************************************************************************\n");
		
		// Check if the stack is empty
		boolean empty = stack.isEmpty();
		if (empty == true)
		{
			System.out.println("Stack is Empty: ");
			System.out.println("********************************************************************************************************");
			System.out.println(empty);
			System.out.println("********************************************************************************************************\n");
		}
		
		// Check if the stack is full
		boolean full = stack.isFull();
		if (full == true)
		{
			System.out.println("Stack is Full: ");
			System.out.println("********************************************************************************************************");
			System.out.println(full);
			System.out.println("********************************************************************************************************\n");
		}
	}
// ------------------- End Main Method -------------------
} // End of class DequeAsStackApplication
