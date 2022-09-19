package Core_java.InnerClasses.Anonymous;

class AnonyThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i=1; i<=10; i++) {
			System.out.println("Main Thread");
		}
	}
}

