package Core_java.AccessModifier;

class AccessModifier extends B{


	public static void main(String[] args) {
		
		AccessModifier obj = new AccessModifier();

		//System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);

		B ab = new B();
			//System.out.println(ab.a);
			System.out.println(ab.b);
			System.out.println(ab.c);
			System.out.println(ab.d);
	}
}

/*Class C extends B{

	AccessModifier obj1 = new AccessModifier();
	System.out.println(obj1.b);
	System.out.println(obj1.c);
	System.out.println(obj1.d);
}*/