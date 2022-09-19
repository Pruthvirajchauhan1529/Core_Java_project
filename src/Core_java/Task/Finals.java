package Core_java.Task;

final class A4{
	void Display(){
		System.out.println("This is Display method for final class A");
	}
}
//class B extends A
class B4 {
	final int i =10;

	final void Show(){
		//System.out.println(this.i);
		System.out.println("This is the Final show method");
	}
}
class Finals extends B4{
	public static void main(String[] args) {
		
		A4 a = new A4();
		a.Display();

		Finals f = new Finals();
		f.Show();

		System.out.println("This is a final variable :-"+ f.i);	
	}	
}


// error: cannot inherit from final A
//class B extends A
// Final method can not be overridden in subclass