package Core_java.MultiThreadingDurga;

class JoinThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread08.mt = Thread.currentThread();
		MyThread08 t = new MyThread08();
		t.start();
		//t.join();

		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}