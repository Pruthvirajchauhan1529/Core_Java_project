package Core_java.Collection;

import java.util.Comparator;

public class Employees implements Comparator<Employees> {
    int id;
    String name;

    public Employees(int id, String name){
        this.id = id;
        this.name = name;
    }

    // public int compareTo(Employee e){
    // 	int id1 = this.id;
    // 	int id2 = e.id;

    // 	return id1 - id2;
    // }
    public int compare(Employees o1, Employees o2){
        String s1 = o1.name;
        String s2 = o2.name;

        return s1.compareTo(s2);
    }
}
