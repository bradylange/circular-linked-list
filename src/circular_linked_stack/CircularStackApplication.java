package circular_linked_stack;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: CircularStackApplication
 * Language: Java
 * Date: 2/23/18
 * Description: This program tests the functionality of the circular linked stack data structure. 
 */

// This program tests the functionality of the circular stack
public class CircularStackApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args)
	{
		// Instantiate the stack data structure 
		CircularStack stack = new CircularStack(4);
		
		// Push elements into the stack
		System.out.println("***************************************** Circular Linked Stack: *****************************************");
		System.out.println("Pushing Links into the Stack -- Circular List Iteration in Decreasing Order: ");
		System.out.println("********************************************************************************************************");
		System.out.println("-- Bottom of Stack --");
		stack.push(5, 6);											// Push link
		stack.peek();												// Display top link
		stack.push(6, 20);											// Push link
		stack.peek();												// Display top link
		stack.push(7, 200);											// Push link
		stack.peek();												// Display top link
		stack.push(8, 570);											// Push link
		stack.peek();												// Display top link
		System.out.println("-- Top of Stack --");
		System.out.println("********************************************************************************************************\n");
		
		// Display the last link pushed into the stack
		System.out.println("Last Link Pushed into the Stack: ");
		System.out.println("********************************************************************************************************");
		stack.peek();												// Display top link
		System.out.println("********************************************************************************************************\n");
		
		// Remove elements from the stack (LIFO)
		System.out.println("Popping Elements off of the Stack: ");
		System.out.println("********************************************************************************************************");
		stack.peek();												// Display top link
		stack.pop();												// Pop link
		stack.peek();												// Display top link
		stack.pop();												// Pop link
		System.out.println("********************************************************************************************************\n");
		
		// Check to see if more links can be added to the stack
		System.out.println("Try to Push More Links than Capacity: ");
		System.out.println("********************************************************************************************************");
		System.out.println("-- Bottom of Stack --");
		stack.push(9, 200);											// Push link
		stack.peek();												// Display top link
		stack.push(10, 656);										// Push link
		stack.peek();												// Display top link
		stack.push(11, 454); 										// Will not push this link into the stack since there is a capacity
		System.out.println("-- Top of Stack --");
		if (stack.stackSize == 7)
		{
			stack.peek();											// Display top link
		}
		System.out.println("********************************************************************************************************\n");
		
		// Check if the stack is empty
		System.out.println("Stack's Elements: ");
		System.out.println("********************************************************************************************************");
		if (stack.isEmpty())
		{
			System.out.println("The stack is empty.");
		}
		else
		{
			System.out.println("The stack is not empty.");
		}
		System.out.println("********************************************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class CircularStackApplication
