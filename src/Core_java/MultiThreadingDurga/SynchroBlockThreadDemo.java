package Core_java.MultiThreadingDurga;

class Display01{

	public void wish(String name){
	
		System.out.println("11111");
		System.out.println("11112");
		System.out.println("11113");
		System.out.println("11114");
		System.out.println("11115");
		System.out.println("11116");
		System.out.println("11117");
		System.out.println("11118");
		System.out.println("11119");
		System.out.println("11120");
		synchronized(Display01.class){
		for (int i=1; i<=5; i++) {
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
		System.out.println("11121");
		System.out.println("11122");
		System.out.println("11123");
		System.out.println("11124");
		System.out.println("11125");
		System.out.println("11126");
		System.out.println("11127");
		System.out.println("11128");
		System.out.println("11129");
		System.out.println("11130");
	}
}

class SynchroBlockThreadDemo extends Thread{
	Display01 d;
	String name;
	SynchroBlockThreadDemo(Display01 d,String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}

	public static void main(String[] args) {
		
		Display01 d1 = new Display01();
		Display01 d2 = new Display01();
		SynchroBlockThreadDemo t1 = new SynchroBlockThreadDemo(d1,"Dhoni");
		SynchroBlockThreadDemo t2 = new SynchroBlockThreadDemo(d2,"Raina");
	
		t1.start();
		t2.start();	
	}
}