package Core_java.MultiThreadingDurga;

public class MyThread05 extends Thread{
    public void run()
    {
        System.out.println("Run method executed by Thread :"+ Thread.currentThread().getName());
    }
}
