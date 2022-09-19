package Core_java.MultiThreadingDurga;

class OverrideThreadDemo{
	public static void main(String[] args) {
		MyThread09 t = new MyThread09();
		t.start();
		System.out.println("Main Thread executed");
	}
}