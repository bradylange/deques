package deque;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: DequeApplication
 * Language: Java
 * Date: 2/13/18
 * Description: This program tests the functionality of the deque data structure. 
 */

// This program tests the functionality of the deque data structure 
public class DequeApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String[] args) 
	{
		// Instantiate the deque
		Deque deque = new Deque(6);
	
		System.out.println("***************************************** Deque: *******************************************");
		
		// Insert from the left
		int val1 = 4, val2 = 10, val3 = 7;
		deque.insertLeft(val1);
		deque.insertLeft(val2);
		deque.insertLeft(val3);
		System.out.println("Inserted Values from the Left: ");
		System.out.println("********************************************************************************************************");
		System.out.println(val1 + ", " + val2 + ", " + val3);
		System.out.println("********************************************************************************************************\n");
		
		// Remove from the left
		int rLeft1 = deque.removeLeft();
		int rLeft2 = deque.removeLeft();
		int rLeft3 = deque.removeLeft();
		
		// Display the values removed from the left
		System.out.println("Removed Values from the Left: ");
		System.out.println("********************************************************************************************************");
		System.out.println(rLeft1 + ", " + rLeft2 + ", " + rLeft3);
		System.out.println("********************************************************************************************************\n");
		
		// Insert from the right
		int val4 = 3, val5 = 4, val6 = 5;
		deque.insertRight(val4);
		deque.insertRight(val5);
		deque.insertRight(val6);
		System.out.println("Inserted Values from the Right: ");
		System.out.println("********************************************************************************************************");
		System.out.println(val4 + ", " + val5 + ", " + val6);
		System.out.println("********************************************************************************************************\n");
		
		// Remove from the right 
		int rRight1 = deque.removeRight();
		int rRight2 = deque.removeRight();
		int rRight3 = deque.removeRight();
		
		// Display the values removed from the right 
		System.out.println("Removed Values from the Right: ");
		System.out.println("********************************************************************************************************");
		System.out.println(rRight1 + ", " + rRight2 + ", " + rRight3);
		System.out.println("********************************************************************************************************\n");
		
		// Insert from the left showing the wrap around queue
		int val7 = 1, val8 = 107, val9 = 7, val10 = 6, val11 = 4, val12 = 100;
		deque.insertLeft(val7);
		deque.insertLeft(val8);
		deque.insertLeft(val9);
		deque.insertLeft(val10);
		deque.insertLeft(val11);
		deque.insertLeft(val12);
		System.out.println("Inserted Values from the Left: ");
		System.out.println("********************************************************************************************************");
		System.out.println(val7 + ", " + val8 + ", " + val9 + ", " + val10 + ", " + val11 + ", " + val12);
		System.out.println("********************************************************************************************************\n");

		// Peek into the deque from the left
		int pk1 = deque.peekLeft();
		System.out.println("Peek from the Left: ");
		System.out.println("********************************************************************************************************");
		System.out.println(pk1);
		System.out.println("********************************************************************************************************\n");
		
		// Peek into the deque from the right
		int pk2 = deque.peekRight();
		System.out.println("Peek from the Right: ");
		System.out.println("********************************************************************************************************");
		System.out.println(pk2);
		System.out.println("********************************************************************************************************\n");
		// Format 
		if (deque.isFull() == false && deque.isEmpty() == false)
		{
			System.out.println("********************************************************************************************************\n");
		}
		
		// Check if the deque is full
		boolean full = deque.isFull();
		if (full == true)
		{
			System.out.println("Deque is Full: ");
			System.out.println("********************************************************************************************************");
			System.out.println(full);
			System.out.println("********************************************************************************************************\n");
		}
		
		// Check if the deque is empty
		boolean empty = deque.isEmpty();
		if (empty == true)
		{
			System.out.println("Deque is Empty: ");
			System.out.println("********************************************************************************************************");
			System.out.println(empty);
			System.out.println("********************************************************************************************************\n");
		}
	} 
// ------------------- End Main Method -------------------
} // End of class DequeApplication
