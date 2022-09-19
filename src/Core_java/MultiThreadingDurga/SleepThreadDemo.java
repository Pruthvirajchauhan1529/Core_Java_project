package Core_java.MultiThreadingDurga;

class SleepThreadDemo{
	public static void main(String[] args) {
		MyThread12 t = new MyThread12();
		t.start();
		t.interrupt();
		System.out.println("End of the Main Thread");
	}
}