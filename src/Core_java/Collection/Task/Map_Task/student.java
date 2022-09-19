package Core_java.Collection.Task.Map_Task;

public class student {
    int roll;
    String name;
    String address;
    int marks;
    public student(int roll,String name,String address, int marks){
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public String toString(){
        return "Roll No "+ roll+" Name "+name+" Address "+address+" Marks "+marks;
    }

}
