package Core_java.Abstraction.interfaces;

class Honda implements Car {

		public void go(){
			System.out.println("Inside Hondas Go()");
		}

		public void stop(){
			System.out.println("Inside Hondas Stop() ");
		}

		public void Start(){
			System.out.println("This is a start method..");
		}
		public void service(){
			System.out.println("This is a Service method..");
		}
}
