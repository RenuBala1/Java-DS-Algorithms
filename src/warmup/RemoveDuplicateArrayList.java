package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList {

	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>();

		list1.addAll(Arrays.asList(1,2,3,4,5,3,4,2,1));

		System.out.println("Before removing duplicates" + list1);


		System.out.println("Method1: After removing duplicates" + removeDuplicates1(list1));


		List<Integer> list3 = removeDuplicates2(list1);

		System.out.println("Method2: After removing duplicates" + list3);


		List<Integer> list4 = removeDuplicates3(list1);

		System.out.println("Method3: After removing duplicates" + list4);

	}

	//Using Java 8 stream.distinct()
	public static List<Integer> removeDuplicates1(List<Integer> list)
	{

		List<Integer> list2 = new ArrayList<Integer>();
		list2 = list.stream().distinct().collect(Collectors.toList());

		return list2;


	}

	// Using LinkedHashSet
	public static List<Integer> removeDuplicates2(List<Integer> list)
	{

		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(list);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(set);

		return list2;


	}

	// Using Iterator
	public static List<Integer> removeDuplicates3(List<Integer> list)
	{
		List<Integer> list2 = new ArrayList<Integer>();
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Integer elem = (Integer) it.next();
			if(!list2.contains(elem))
			{
				list2.add(elem);
			}
		}
		return list2;
	}
}
