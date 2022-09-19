package Core_java.MultiThreadingDurga;

class DeadLockThreadDemo extends Thread{
	AAA a = new AAA();
	BBB b = new BBB();
	public void m1(){
		this.start();
		a.d1(b);// This line executed by main thread
	}
	public void run(){
		b.d2(a); // This line executed by child thread
	}
	public static void main(String[] args) {
		DeadLockThreadDemo d = new DeadLockThreadDemo();	
		d.m1();
	}
}