package Core_java.InnerClasses.Anonymous;

class InterfaceInsideDemo2{
	public static void main(String[] args) {
		vehicle.DefaultVehicle d = new vehicle.DefaultVehicle();
		System.out.println(d.getNoOfWheels());//2

		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());//6
	}
}