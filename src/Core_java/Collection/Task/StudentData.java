package Core_java.Collection.Task;

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class StudentData {

	public static ArrayList<Student02> getStudentList() {

		ArrayList<Student02> list = new ArrayList<>();
		list.add(new Student02(111,"Harsh","Bapunagar"));
		list.add(new Student02(123,"Anup","Krishnanagar"));
		list.add(new Student02(122,"Avadh","Sola"));
		list.add(new Student02(124,"Avinash","Isakon"));
		list.add(new Student02(111, "Pratik","Rajpur"));

		return list;
	}

	public static HashSet<Student02> getStudentList2(){

		HashSet<Student02> set = new HashSet<>();
		set.add(new Student02(111,"Harsh","Bapunagar"));
		set.add(new Student02(123,"Anup","Krishnanagar"));
		set.add(new Student02(122,"Avadh","Sola"));
		set.add(new Student02(124,"Avinash","Isakon"));
		set.add(new Student02(111,"Harsh","Bapunagar"));

		return set;
	}
}