package Core_java.MultiThreadingDurga;

class PriorityThreadDemo2{
	public static void main(String[] args) {
		
		MyThread11 t = new MyThread11();
		t.setPriority(9);
		//System.out.println(t.getPriority());
		t.start();
		for (int i=1; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}	