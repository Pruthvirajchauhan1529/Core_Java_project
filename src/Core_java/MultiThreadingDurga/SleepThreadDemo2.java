package Core_java.MultiThreadingDurga;

class SleepThreadDemo2{
	public static void main(String[] args) {
		MyThread13 t = new MyThread13();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
	}
}