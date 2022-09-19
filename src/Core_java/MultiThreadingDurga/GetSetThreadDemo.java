package Core_java.MultiThreadingDurga;

class GetSetThreadDemo{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread02 t = new MyThread02();
		System.out.println(t.getName());
		Thread.currentThread().setName("Pruthviraj Chauhan");
		System.out.println(Thread.currentThread().getName());
		
	}
}