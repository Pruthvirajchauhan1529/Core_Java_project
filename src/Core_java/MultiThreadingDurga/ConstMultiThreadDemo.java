package Core_java.MultiThreadingDurga;

class ConstMultiThreadDemo{
	public static void main(String[] args) {
		MyThread01 t = new MyThread01();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("main Method");
	}
}