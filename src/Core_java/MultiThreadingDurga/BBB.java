package Core_java.MultiThreadingDurga;

public class BBB {
    public synchronized void d2(AAA a){
        System.out.println("Thread2 starts execution of d2() method");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread 2 trying to call A's last()");
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside B, this is last() method");
    }
}
