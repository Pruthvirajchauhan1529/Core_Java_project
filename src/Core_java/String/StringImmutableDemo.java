package Core_java.String;

class User01{
	int id;
	String name;
	User01(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class StringImmutableDemo{
	public static void main(String[] args) {
		User01 user = new User01(1,"Dhuti");
		System.out.println(user);

		String s = new String("Nikk");
		System.out.println(s);

		Integer i = new Integer(345);
		System.out.println(i);
	}
}