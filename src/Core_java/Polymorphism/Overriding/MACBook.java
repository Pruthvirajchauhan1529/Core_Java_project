package Core_java.Polymorphism.Overriding;

class MACBook01{

	void start(){
		System.out.println("Inside MacBook Start");
	}
	void shutdown(){
		System.out.println("Inside MacBook Shutdown");
	}
}
class MACBookPro01 extends MACBook01{

	void start(){
		System.out.println("Inside MACBookPro start method");
	}
	void shutdown(){
		System.out.println("Inside MACBookPro shutdown method");
	}
}
class MACBookAir01 extends MACBook01{

	void start(){
		System.out.println("Inside MACBookAir start method");
	}
	void shutdown(){
		System.out.println("Inside MACBookAir shutdown method");
	}
}
class RunTimeBinding01{
		public static void main(String[] args) {
			
			MACBook m1 = new MACBookPro();
			m1.start();
			m1.shutdown();
		}
}