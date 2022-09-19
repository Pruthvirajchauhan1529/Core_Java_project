package Core_java.MultiThreadingDurga;

class GetSetThreadDemo2{
	public static void main(String[] args) {
		MyThread05 t = new MyThread05();
		t.start();
		System.out.println("Main method executed by Thread :" + Thread.currentThread().getName());
	}
}