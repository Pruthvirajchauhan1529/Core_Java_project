package Core_java.MultiThreadingDurga;

class Display02{
	//public static synchronized void wish(String name)
	public synchronized void wish(String name){
		for (int i = 1; i<=5; i++) {
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
class MyClass extends Thread{
	Display02 d;
	String name;
	MyClass(Display02 d, String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}
class SynchronizeThreadDemo{
	public static void main(String[] args) {
		Display02 d1 = new Display02();
		Display02 d2 = new Display02();
		//Display d3 = new Display();
		MyClass t1 = new MyClass(d1,"Dhoni");
		MyClass t2 = new MyClass(d2,"Raina");
		//MyClass t3 = new MyClass(d3,"Pathan");
		t1.start();
		t2.start();
		//t3.start();
	}
}