package Core_java.MultiThreading.yield;

public class YieldDemo{
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();

		for (int i = 1; i<=10; i++) {
			System.out.println("Parent Thread");			
		}
	}
}