package Core_java.MultiThreadingDurga;

public class MyThread07 extends Thread{
    public void run(){
        for (int i=0; i<10; i++) {
            System.out.println("Seetha Thread");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
