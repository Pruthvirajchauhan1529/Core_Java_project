package Core_java.MultiThreadingDurga;

public class AAA {
    public synchronized void d1(BBB b){
        System.out.println("Thread1 starts execution of d1() method");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread 1 trying to call B's last()");
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside A, this is last() method");
    }
}
