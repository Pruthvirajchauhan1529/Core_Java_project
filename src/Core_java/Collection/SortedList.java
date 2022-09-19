package Core_java.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class SortedList{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

			list.add("Z");
			list.add("A");
			list.add("Y");
			list.add("B");

			System.out.println("Before Sorting : "+list);
			Collections.sort(list, new MyComparator());

			System.out.println("After Sorting : "+list);

			int result = Collections.binarySearch(list,"C");

			System.out.println("Index Of Elements : "+result);

	}
}