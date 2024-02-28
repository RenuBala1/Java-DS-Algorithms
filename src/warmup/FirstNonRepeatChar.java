package warmup;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {
	public static void main(String args[])
	{
		String str = "GeeksForGeek";
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		int i=0;
		while(i<str.length())
		{
			if(str.charAt(i) == ' ') continue;
			if(map1.containsKey(str.charAt(i)))
			{
				Integer val=map1.get(str.charAt(i));
				map1.put(str.charAt(i),val+1);
			}
			else
				map1.put(str.charAt(i),1);
			i++;
		}
		i=0;
		Character result=null;
		while(i<str.length())
		{
			if(map1.get(str.charAt(i))==1)
			{
				result=str.charAt(i);
				break;
			}
			i++;

		}
		if(result!=null)
		{
			System.out.println("First non repeating character : "+result);
		}

	}

}
