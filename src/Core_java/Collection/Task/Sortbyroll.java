package Core_java.Collection.Task;

import Core_java.Collection.Task.Student02;

import java.util.Comparator;

public class Sortbyroll  implements Comparator<Student02> {
    public int compare(Student02 a, Student02 b){
        if(a.rollno > b.rollno){
            return 1;
        }else if(a.rollno < b.rollno){
            return -1;
        }else{
            return 0;
        }
        //return a.rollno - b.rollno;
    }
}
