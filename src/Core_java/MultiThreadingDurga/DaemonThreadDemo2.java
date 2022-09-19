package Core_java.MultiThreadingDurga;

class DaemonThreadDemo2{
	public static void main(String[] args) {
		
		MyThread03 t = new MyThread03();
		t.setDaemon(true);
		t.start();
		System.out.println("End of the main method");
	}
}