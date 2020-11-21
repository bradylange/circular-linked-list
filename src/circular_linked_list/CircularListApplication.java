package circular_linked_list;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: CircularListApplication
 * Language: Java
 * Date: 2/23/18
 * Description: This program tests the functionality of the CircularList class.
 */

// This class tests the functionality of the circular linked list data structure
public class CircularListApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String[] args) 
	{
		// Instantiate a circular linked list 
		CircularList list = new CircularList();
		
		// Insert links into the linked list
		list.insert(1, 59);
		list.insert(2, 65);
		list.insert(3, 2);
		list.insert(4, 90.5);
		 
		// Display the links in the linked list
		System.out.println("***************************************** Circular Linked List: *****************************************");
		System.out.println("Inserting Links -- Circular List Iteration in Decreasing Order: ");
		System.out.println("********************************************************************************************************");
		list.displayList();
		System.out.println("********************************************************************************************************\n");
		 
		// Search for a link in the linked list
		int findKey = 3;
		Link findLink = list.find(findKey);
		System.out.println("Searching for a Link in the Linked List: ");
		System.out.println("********************************************************************************************************");
		if (findLink != null)
		{
			System.out.print("Link " + findKey + " was found: ");
			findLink.displayLink();
		}
		System.out.println("********************************************************************************************************\n");
		
		// Insert links into the linked list 
		System.out.println("Inserting Links -- Circular List Iteration in Decreasing Order:");
		System.out.println("********************************************************************************************************");
		list.displayList();
		System.out.println("********************************************************************************************************\n");
		
		// Peek into the linked list
		System.out.println("Peeking into the Linked List: ");
		System.out.println("********************************************************************************************************");
		list.peek();
		System.out.println("********************************************************************************************************\n");

		// Go to the next link in the linked list
		System.out.println("Current Link: ");
		System.out.println("********************************************************************************************************");
		list.current.displayLink();
		System.out.println("********************************************************************************************************\n");
		list.step();
		System.out.println("Step Over Link -- New Current Link: ");
		System.out.println("********************************************************************************************************");
		list.current.displayLink();
		System.out.println("********************************************************************************************************\n");
		
		// Delete a link using a key to find the exact one
		int key = 1;
		Link deleteKeyLink = list.deleteKey(key);
		System.out.println("Deleting a Link with an Exact Value from the Linked List: ");
		System.out.println("********************************************************************************************************");
		if (deleteKeyLink != null)
		{
			System.out.print("Deleted link with the key " + key + ": ");
			deleteKeyLink.displayLink();
		}
		System.out.println("********************************************************************************************************\n");
		
		// Delete links from the linked list with no key
		System.out.println("Removing All Values from the Linked List: ");
		System.out.println("********************************************************************************************************");
		while (list.listSize != 0)
		{
			Link deletedLink = list.delete();
			System.out.print("Deleted: ");
			deletedLink.displayLink();
		}
		System.out.println("********************************************************************************************************\n");
		

		// Check if the linked list is empty
		boolean empty = list.isEmpty();
		System.out.println("Linked List is Empty: ");
		System.out.println("********************************************************************************************************");
		System.out.println(empty);
		System.out.println("********************************************************************************************************\n");
		
		// Display the linked list to prove it is empty
		System.out.println("Empty Linked List: ");
		System.out.println("********************************************************************************************************");
		list.displayList();
		System.out.println("\n********************************************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class CircularListApplication
