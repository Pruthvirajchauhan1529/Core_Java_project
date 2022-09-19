package Core_java.InnerClasses.Anonymous;

public interface vehicle {
    public int getNoOfWheels();
    class DefaultVehicle implements vehicle{
        public int getNoOfWheels(){
            return 2;
        }
    }
}
