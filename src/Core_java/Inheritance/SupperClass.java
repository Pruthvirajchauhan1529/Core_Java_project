package Core_java.Inheritance;

public class SupperClass {
    int x;
    SupperClass(){

        System.out.println("No Arg Constructor for SupperClass");
    }
    SupperClass(int x){
        this();
        this.x = x;
        System.out.println("One Arg Constructor for SupperClass");
    }
}

