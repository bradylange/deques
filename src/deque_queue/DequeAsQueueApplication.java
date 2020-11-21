package deque_queue;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: DequeAsQueueApplication
 * Language: Java
 * Date: 2/13/18
 * Description: This program tests the functionality of the deque used as a queue data structure. 
 */

// This program tests the functionality of the deque used as a queue data structure 
public class DequeAsQueueApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String[] args) 
	{
		// Instantiate the queue
		DequeAsQueue queue = new DequeAsQueue(4);
		
		System.out.println("***************************************** Deque Used as a Queue: *******************************************");
		
		// Insert data into the queue
		int val1 = 111, val2 = 113, val3 = 1;
		queue.insert(val1);
		queue.insert(val2);
		queue.insert(val3);
		System.out.println("Inserted Values into the Queue: ");
		System.out.println("********************************************************************************************************");
		System.out.println(val1 + ", " + val2 + ", " + val3);
		System.out.println("********************************************************************************************************\n");
		
		// Remove data from the queue, removes numbers based upon 'FIFO' 
		int rm1 = queue.remove();
		int rm2 = queue.remove();
		System.out.println("Removed Values from the Queue: ");
		System.out.println("********************************************************************************************************");
		System.out.println(rm1 + ", " + rm2);
		System.out.println("********************************************************************************************************\n");

		// Insert more data to prove the queue can use wrap-around algorithm 
		val1 = 4;
		val2 = 67;
		val3 = 98;
		queue.insert(val1);
		queue.insert(val2);
		queue.insert(val3);
		System.out.println("More Inserted Values into the Queue: ");
		System.out.println("********************************************************************************************************");
		System.out.println(val1 + ", " + val2 + ", " + val3);
		System.out.println("********************************************************************************************************\n");
		
		// Remove the rest of the values in the queue after it has shown wrap-around
		int size = queue.getSize();
		System.out.println("Remove All Values from the Queue: ");
		System.out.println("********************************************************************************************************");
		for (int i = 0; i < size; i++)
		{
			int rm3 = queue.remove();
			System.out.println("Removed: " + rm3);
		}
		System.out.println("********************************************************************************************************\n");
		
		// Check if the queue is empty
		boolean empty = queue.isEmpty();
		if (empty == true)
		{
			System.out.println("Queue is Empty: ");
			System.out.println("********************************************************************************************************");
			System.out.println(empty);
			System.out.println("********************************************************************************************************\n");
		}
		
		// Check if the queue is full
		boolean full = queue.isFull();
		if (full == true)
		{
			System.out.println("Queue is Full: ");
			System.out.println("********************************************************************************************************");
			System.out.println(full);
			System.out.println("********************************************************************************************************\n");
		}
	}
// ------------------- End Main Method -------------------
} // End of class DequeAsQueueApplication
