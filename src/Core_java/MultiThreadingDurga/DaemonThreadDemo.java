package Core_java.MultiThreadingDurga;

class DaemonThreadDemo{
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isDaemon());	// false
		//Thread.currentThread().setDaemon(true); // RE :- IllegalThreadStateException

		MyThread02 t = new MyThread02();
		System.out.println(t.isDaemon());//false
		t.setDaemon(true);
		System.out.println(t.isDaemon()); // true
	}
}