package Core_java.InnerClasses.Anonymous;

class AnonyThreadDemo2{
	public static void main(String[] args) {
			Thread t = new Thread(){
				public void run(){
					for (int i=1; i<=10; i++) {
						System.out.println("Child Thread");
					}
				}
			};
			t.start();

			for (int i=1; i<=10; i++) {
				System.out.println("Main Thread");
			}
		}	
}