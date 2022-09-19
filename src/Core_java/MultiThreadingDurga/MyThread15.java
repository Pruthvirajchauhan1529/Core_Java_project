package Core_java.MultiThreadingDurga;

public class MyThread15 extends Thread{
    public void run(){
        for (int i=1; i<10 ;i++) {
            System.out.println("Child Method");
            Thread.yield();
        }
    }
}
