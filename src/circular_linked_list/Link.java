package circular_linked_list;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: Link
 * Language: Java
 * Date: 2/23/18
 * Description: This class has link properties and methods that allows for the development of the link list data structure. 
 */

// This class contains link attributes
public class Link 
{
	// Instance variables
	double data;														// Link data
	int id;																// Link identification
	Link next;															// Next link in the list 
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Identification, Data 
	public Link(int id, double data) 
	{
		// Instantiate properties with parameter values 
		this.id = id;
		this.data = data;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Display Link Method -------------------
	// Method that displays the contents of the link
	public void displayLink()
	{
		System.out.println("{ ID: " + id + " | Data: " + data + " }");
	}
// ------------------- End Display Link Method -------------------
} // End of class Link
