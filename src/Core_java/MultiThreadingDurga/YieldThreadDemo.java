package Core_java.MultiThreadingDurga;

class YieldThreadDemo{
	public static void main(String[] args) {
		MyThread15 t = new MyThread15();
		t.start();

		for (int i=1; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}