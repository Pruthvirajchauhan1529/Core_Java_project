package Core_java.Collection.Task;

import java.util.Comparator;

public class SortbyName implements Comparator<Student02> {
    public int compare(Student02 a, Student02 b){
        return a.name.compareTo(b.name);
    }
}
