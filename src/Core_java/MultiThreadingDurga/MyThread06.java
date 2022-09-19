package Core_java.MultiThreadingDurga;

public class MyThread06 extends Thread{

    public void run(){
        System.out.println("No agrs method");
    }
    public void run(int i){
        System.out.println("int agrs method");
    }

}
