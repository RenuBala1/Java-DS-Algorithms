package warmup;

import java.util.Arrays;
import java.util.Comparator;

public class StringUtilities {

	// Method 1 - Using Arrays.sort() method
	static String Sortstring(String inputString) {

		char[] tempArray=inputString.toCharArray();


		Arrays.sort(tempArray);

		return new String(tempArray);

	}

	// Method 2 - without Arrays.sort() method - ignore case
	static String Sortstring1(String inputString) {

		Character[] tempArray=new Character[inputString.length()];

		for(int i=0;i<inputString.length();i++)
		{
			tempArray[i]=inputString.charAt(i);
		}


		Arrays.sort(tempArray, new Comparator<Character>()
		{

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return Character.compare(Character.toLowerCase(o1),Character.toLowerCase(o2));

			}

		});

		StringBuffer sb= new StringBuffer(inputString.length());

		for(Character c: tempArray)
		{
			sb.append(c.charValue());
		}


		return sb.toString();

	}


	static String compresS(String input) {
		// TODO Auto-generated method stub

		StringBuilder output=new StringBuilder();
		String sortedStr=StringUtilities.Sortstring(input);

		System.out.println(sortedStr);

		int len =sortedStr.length();
		Character c = sortedStr.charAt(0);
		int count=1;
		int i=0;
		while(i+1<len)
		{
			if(c==sortedStr.charAt(i+1))
			{
				//System.out.println("Same");
				count++;
				i++;
				//System.out.println("Same"+count+""+i);
			}
			else
			{
				output.append(c).append(count);
				i++;
				c=sortedStr.charAt(i);
				count=1;
				//System.out.println("Diff"+count+""+i);
			}

		}

		output.append(c).append(count);
		System.out.println(output);
		return output.toString();
	}
}
