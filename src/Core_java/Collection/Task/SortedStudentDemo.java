package Core_java.Collection.Task;

import java.util.*;
import java.lang.*;

public class SortedStudentDemo{
	public static void main(String[] args) {
		
		//ArrayList<Student> list = StudentData.getStudentList();

		HashSet<Student02> set = new HashSet<>();
		set.add(new Student02(111,"Harsh","Bapunagar"));
		set.add(new Student02(123,"Anup","Krishnanagar"));
		set.add(new Student02(122,"Avadh","Sola"));
		set.add(new Student02(124,"Avinash","Isakon"));
		set.add(new Student02(111,"Harsh","Bapunagar"));

		ArrayList<Student02> als = new ArrayList<Student02>(set);
		Collections.sort(als, new Sortbyroll());
		Collections.sort(als, new SortbyName());
		for (Student02 st : als) {
			System.out.println(st);
		}

		// System.out.println("Unsorted");
		// for (int i=0; i<set.size(); i++) {
		// 	System.out.println(set.get(i));
		// }
		
		// System.out.println("------------------------------------");
		// Collections.sort(list, new Sortbyroll());
		// System.out.println("Sorted By Roll_Number");
		// for (int i=0; i<list.size(); i++) {
		// 	System.out.println(list.get(i));
		// }

		// System.out.println("------------------------------------");
		// Collections.sort(list, new SortbyName());
		// System.out.println("Sorted By Name");
		// for(int i=0;i<list.size();i++){
		// 	System.out.println(list.get(i));
		// }
	}
}