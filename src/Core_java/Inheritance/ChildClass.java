package Core_java.Inheritance;


public class ChildClass extends SupperClass{
	
	ChildClass(){
		this(10);
		System.out.println("No Arg Constructor for ChildClass");
	}
	ChildClass(int y){
		super(y);
		System.out.println("One Arg Constructor for ChildClass");
	}

	public static void main(String[] args) {
		ChildClass cl = new ChildClass();
	}

}