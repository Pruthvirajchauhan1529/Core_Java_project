package Core_java.Collection.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

class MapDemo1{
	public static void main(String[] args) {
		
		Map map1 = new HashMap();

		map1.put(1,"Amit");
		map1.put(5,"Mukesh");
		map1.put(3,"Dhuv");
		map1.put(9,"Ankit");

		System.out.println(map1);
		for (Object mp: map1.entrySet()) {
			System.out.println(mp);
		}

		Iterator itr = map1.keySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		// Set set = map.entrySet();
		// Iterator itr = set.iterator();

		// while(itr.hasNext()){
		// 	Map.Entry entry = (Map.Entry)itr.next();
		// 	System.out.println(entry.getKey()+" "+entry.getValue());
		// }
	}
}
