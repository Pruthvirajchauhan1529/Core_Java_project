package Core_java.Collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class StringComparatorDemo{
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>(new Comparators());

		set.add("abcxyzzdf");
		set.add("xyzfrds");
		set.add("pqrwgefdwef");
		set.add("efg");
		set.add("defzzzzzzzzzzzzzzz");

		for (String st : set) {
			System.out.println("Odering :- "+st);
		}
		
		//System.out.println(set);
	}
}