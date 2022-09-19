package Core_java.Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;	 

public class LinkedListDemo{
	public static void main(String[] args) {
		
		Object objects[] = new Object[1000000];

		for (int i=0;i<objects.length ;i++ ) {
			objects[i] = new Object();
		}

		List<Object> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time Taken : "+(end - start));
	}
}