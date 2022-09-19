package Core_java.MultiThreading;

public class CheckProccessor implements Runnable{

	public void run(){
		System.out.println("Proccess the checks");
	}
	public static void main(String[] args) {
		
		CheckProccessor cp = new CheckProccessor();
		Thread t = new Thread(cp);
		t.start();
	}
}