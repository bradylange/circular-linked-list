package circular_linked_list;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: CircularList
 * Language: Java
 * Date: 2/23/18
 * Description: This class contains attributes that relate to a circular linked list data structure. The design of a circular linked list is more 
 * powerful having a reference to a first, current, and last link in the list.
 * Data Structure Functions: Insert, Delete, Delete Key, Find, Display List, Peek, Check Empty
 */

// This class contains functions of circular linked list (first element and last element linked)
public class CircularList 
{
	// Instance variables												// Note: Variable first and last are used for linked list queues (more powerful)
	Link current; 														// Points to the current position in the list		
	Link first; 														// Points to the first link placed into the list
	Link last; 															// Points to the last link placed into the list
	int listSize;														// Size of the linked list
// ------------------- Default Constructor -------------------
	// Default Constructor
	public CircularList()
	{
		// Instantiate default properties 
		listSize = 0;
		current = null;
		first = null;
		last = null;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Insert Method -------------------
	// Method that inserts a link after the current link
	public void insert(int id, double data)
	{
	      Link newLink = new Link(id, data);								// Create new link to add to the linked list 
	      if (isEmpty())													// Linked list is empty 
	      {
	    	  first = newLink;												// Set the first link to the new link
	    	  last = newLink;												// Set the last link to the new link - creates a circular list 
	    	  current = newLink;											// Set the current link to the new link 
	    	  newLink.next = current.next;									// Set the new link's next link to the current link's next link 
	    	  current.next = newLink;										// Set the current link's next link to the new link
	    	  listSize++;													// Increase the linked list's size 
	      }
	      else																// Linked list is not empty
	      {
	    	  current = first;												// Set the current link to the first link in the list
			  newLink.next = current.next;									// Set the new link's next link to the current link's next link
			  current.next = newLink;										// Set the current link's next link to the new link
			  last = newLink;												// Set the last link to the new link
		      listSize++;													// Increase the linked list's size 
	      }
	}
// ------------------- End Insert Method -------------------
	
// ------------------- Delete Method -------------------
	// Method that deletes one link after the current link
	public Link delete()
	{
		if (isEmpty())														// Linked list is empty 
		{
			return null;													// Return nothing
		}
		else																// Linked list is not empty 
		{
			// Change the first and last link if they're the link being deleted 
			if (current.next == first)										// Current link's next link is equal to the first link 
			{
				first = current;											// Set the first link to the current link 
			}
			if (current.next == last)										// Current link's next link is equal to the last link
			{
				last = last.next;											// Set the last link to its next link 
			}
			
			Link deletedLink = current.next;								// Store the deleted link in a variable to display it was deleted
			current.next = current.next.next;								// Set the current link's next link to the the current link's next link's next link
			listSize--;														// Decrease the list size as a link was deleted
			return deletedLink;												// Return the deleted link
		}
	}
// ------------------- End Delete Method -------------------
	
// ------------------- Delete Key Method -------------------
	// Method that deletes a link with a given key
	public Link deleteKey(int key)
	{
		if (isEmpty())														// Linked list is empty 
		{
			return null;													// Return nothing 
		}
		
		Link returnDeletedLink;												// Store the deleted link in a variable to display it was deleted
		Link previous = current;											// Keep track of the previous link in the list
		int listBound = 0;													// Keeps track of how many items have been iterated through 
		
		while (current.id != key && listBound <= listSize)					// Search for the link with a specific key 
		{
			previous = current;												// Keep track of the link before moving onto the next link
			current = current.next;											// Move through the linked list
			listBound++;													// Increment the counter 
		}
		
		// Change the first and last link if they're the link being deleted 
		if (current.id == first.id && current.id == key) 					// Current link's ID equals the first link's ID and current link's ID equals the key 
		{
			first = previous;												// Set the first link to the previous link
		}
		if (current.id == last.id && current.id == key)						// Current link's ID equals the last link's ID and current link's ID equals the key 
		{
			last = last.next;												// Set the last link to the last link's next link 
		}
		
		if (current.id == key)												// Found the link, current link's ID equals the key 
		{
			returnDeletedLink = current;									// Link that is being deleted
			previous.next = current.next;									// Linking the previous link to the current links next link
			current = previous.next;										// Stepping to the next link in the list since the current link is being deleted
			listSize--;														// Decreasing list size as a link was deleted
			return returnDeletedLink;
		}
		else																// Did not find the link
		{
			System.out.println("The link with the key of " + key + " is not in the list.");
			return null;													// Return nothing 
		}
	}
// ------------------- End Delete Key Method -------------------
	
// ------------------- Find Method -------------------
	// Method that finds data in a linked list
	public Link find(int key)
	{
		if (isEmpty())														// Linked list is empty 
		{
			return null;													// Return nothing 
		}
			
		int listBound = 0;													// Keeps track the amount of items that have been iterated through
		while (current.id != key && listBound <= listSize)					// Search for the link with a specific key
		{
			current = current.next; 										// Go to the next link
			listBound++;													// Increment the counter
		}
		
		if (current.id == key)												// Found the link, current link's ID equals the key 
		{
			return current; 												// Return the current link
		}
		else																// Did not find the link
		{
			System.out.println("The link with the key of " + key + " is not in the list.");
			return null;													// Return nothing 
		}
	}
// ------------------- End Find Method -------------------
	
// ------------------- Display List Method -------------------
	// Method that displays the linked list 
	public void displayList()
	{
		for (int i = 0; i < listSize; i++)									// Iterate through the linked list
		{
			current.displayLink();											// Print data
			current = current.next; 										// Move the current link to the next link
		}
	}
// ------------------- End Display List Method -------------------

// ------------------- Step Method -------------------
	// Method that moves from the current link to the next link
	public void step()
	{
		if (isEmpty())														// Linked list is empty 
		{
			System.out.println("Null");										// Print null
		}
		else 																// Linked list is not empty 
		{	
			current = current.next;											// Move the current link to the next link 
		}
	}
	
// ------------------- Peek Method -------------------
	// Method that displays the first link in the linked list 
	public void peek()
	{
		if (isEmpty())														// Linked list is empty 
		{
			System.out.print("Null");										// Print null
		}
		else 																// Linked list is not empty 
		{
			first.displayLink();											// Display the first link in the list 
		}
	}
// ------------------- End Peek Method -------------------
	
// ------------------- Peek Method -------------------
	// Method that displays the last link in the linked list 
	public void peekLast()
	{
		if (isEmpty())														// Linked list is empty 
		{
			System.out.print("Null");										// Print null
		}
		else 																// Linked list is not empty 
		{
			last.displayLink();												// Display the last link in the list 
		}
	}
// ------------------- End Peek Method -------------------
	
// ------------------- Is Empty Method -------------------
	// Method that checks if the linked list is empty
	public boolean isEmpty()
	{
		if (listSize == 0)													// Linked list is empty 
		{
			return true;													// Return that the linked list is empty 
		}
		else																// Linked list is not empty 
		{
			return false;													// Return that the linked list is not empty 
		}
	}
// ------------------- End Is Empty Method -------------------
} // End of class CircularList 
