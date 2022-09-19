package Core_java.Task;

class A5{
	void Show(){
		System.out.println("This Show Method");
	}
}
//public class B5{
//	void Display(){
//		System.out.println("This is Display Method");
//	}
//}
public class MultiClass{
	public static void main(String[] args) {
		A5 a = new A5();
		a.Show();

//		B5 b = new B5();
//		b.Display();
	}
}

/*MultiClass.java:1: error: class A is public, should be declared in a file named A.java
public class A{
       ^
MultiClass.java:6: error: class B is public, should be declared in a file named B.java
public class B{
       ^
2 errors
*/