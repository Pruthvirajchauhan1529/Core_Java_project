package Core_java.MultiThreadingDurga;

class PriorityThreadDemo{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(6);
		MyThread10 t = new MyThread10();
		System.out.println(t.getPriority());
		
	}
}