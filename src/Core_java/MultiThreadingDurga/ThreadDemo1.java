package Core_java.MultiThreadingDurga;

class ThreadDemo1{
	public static void main(String[] args) {
		
		MyThread14 t = new MyThread14();
		t.start();

		for (int i=1; i<=10; i++) {
			System.out.println("Main Thread");
		}
	}
}