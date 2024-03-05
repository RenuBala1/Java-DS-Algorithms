package warmup;

import java.util.Arrays;
import java.util.Comparator;



public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "Geeksforgeeks";
		
		// Method1
		String ouputString= StringUtilities.Sortstring(inputString);		
		System.out.println("String after sorting : "+ ouputString);


		//Method2
		String ouputString1= StringUtilities.Sortstring1(inputString);

		// Method1
		System.out.println("String after sorting : "+ ouputString1);


	}

	

}
