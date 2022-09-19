package Core_java.Collection.Task;

public class Student02 {
    int rollno;
    String name, address;
    public Student02(int rollno,String name,String address){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.rollno+" "+this.name+" "+this.address;
    }
}
