package Core_java.MultiThreadingDurga;

class JoinThreadDemo{
	public static void main(String[] args) {
		MyThread06 t = new MyThread06();
		t.start();
		try{
			t.join(10000);	
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}