package Core_java.Task.interfaces;

public interface Bike{

	void Start();
	void service();
	default void stop(){
		System.out.println("Inside Bike interface of stop method");
	}
}