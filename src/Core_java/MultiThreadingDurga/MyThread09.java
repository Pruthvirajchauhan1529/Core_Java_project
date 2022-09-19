package Core_java.MultiThreadingDurga;

public class MyThread09 extends Thread {
    public void start(){
        super.start();
        System.out.println("Start method executed");
    }
    public void run(){
        System.out.println("Run method executed");
    }
    // public void start(){
    // 	System.out.println("Start method executed");
    // }
}
