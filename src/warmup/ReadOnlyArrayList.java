package warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*An ArrayList can be made read-only easily with the help of Collections.unmodifiableList() method. 
This method takes the modifiable ArrayList as a parameter and returns the read-only unmodifiable view of this ArrayList. Syntax:

 */

public class ReadOnlyArrayList {	
	public static void main(String[] args) {
		try {
			List<Character> list1 = new ArrayList<Character>();
			list1.add('X');
			list1.add('Y');
			list1.add('Z');
			System.out.println("Initial list: " + list1);
			List<Character> list2 = Collections.unmodifiableList(list1);
			System.out.println("Unmodifiable list: " + list2);
			list2.add('A');
		}
		catch(UnsupportedOperationException e)
		{
			System.out.println("Exception thrown :" + e);
		}
	}

}
