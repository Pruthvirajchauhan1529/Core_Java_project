package Core_java.MultiThreadingDurga;

public class MyThread12 extends Thread{
    public void run(){
        try{
            for (int i=1; i<=10; i++) {
                System.out.println("I m Lazy Thread");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("I got Interrupted");
        }
    }
}
