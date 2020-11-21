package circular_linked_stack;

import circular_linked_list.CircularList;
import circular_linked_list.Link;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: CircularStack
 * Language: Java
 * Date: 2/23/18
 * Description: This class contains attributes that relate to a circular linked stack data structure. 
 * Data Structure Functions: Pop, Push, Peek, Check Empty, Check Full
 */

// This class contains attributes that relate to a stack data structure based off of a circular linked list
public class CircularStack 
{
	// Instance variables
	CircularList stack;												// Use the circular linked list as a stack data structure 
	int stackCap;													// Stack capacity 
	int stackSize;													// Stack size 
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Capacity 
	public CircularStack(int cap)
	{
		// Instantiate properties with parameter values 
		stack = new CircularList();
		stackCap = cap;
		stackSize = 0;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Pop Method -------------------
	// Method that removes a data item from the stack (popping in stack) 
	public Link pop()
	{
		if (isEmpty())												// Stack is empty 
		{
			return null;											// Return nothing 
		}
		else														// Stack is not empty 
		{
			stackSize--;											// Decrease stack size 
			return stack.delete();									// Call circular linked lists delete method and return deleted value 
		}
	}
// ------------------- End Pop Method -------------------
	
// ------------------- Push Method -------------------
	// Method that inserts a data item into the stack (pushing in stack)
	public void push(int id, double data)
	{
		if (isFull())												// Stack is full
		{
			System.out.println("Stack is full. Cannot enter more links.");
		}
		else														// Stack is not full 
		{
			stack.insert(id, data);									// Call circular linked lists insert method to insert data item 
			stackSize++;											// Increase stack size 
		}	
	}
// ------------------- End Push Method -------------------
	
// ------------------- Peek Method -------------------
	// Method that peeks into the stack and displays the top item 
	public void peek()
	{
		stack.peekLast();											// Call circular linked lists peek method to display item
	}
// ------------------- End Peek Method -------------------
	
// ------------------- Is Empty Method -------------------
	// Method that checks if the stack is empty
	public boolean isEmpty()
	{
		return stack.isEmpty();										// Call circular linked lists isEmpty method and return if it is empty 
	}
// ------------------- End Is Empty Method -------------------
	
// ------------------- Is Full Method -------------------
	// Method that checks if the stack is full
	public boolean isFull()
	{
		if (stack.isEmpty())										// Stack is empty 
		{
			return false;											// Stack is not full 
		}
		else if (stackSize == stackCap)								// Stack size is equal to the capacity 
		{
			return true;											// Stack is full 
		}
		else														// Has elements, but not full								
		{
			return false;											// Stack is not full 
		}
	}
// ------------------- End Is Full Method -------------------
} // End of class CircularStack
