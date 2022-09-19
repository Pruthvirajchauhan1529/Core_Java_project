package Core_java.MultiThreadingDurga;

class ThreadA1{
	public static void main(String[] args) throws InterruptedException {
		ThreadB1 t = new ThreadB1();
		t.start();
		t.join();
		System.out.println(t.total);
	}
}

class ThreadB1 extends Thread{
	int total=0;
	public void run(){
		for (int i=1; i<100; i++) {
			total = total + i;
		}
		System.out.println(total);
	}

}