package Core_java.Collection;

public class Student {
    int roll;
    String name;
    String address;
    String stander;

    public Student(int roll, String name, String address, String stander){
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.stander = stander;
    }
    public String toString(){
        return "Student roll no = "+roll+ ", Name "+name+ ", Address "+address+", Stander "+stander;
    }
}
