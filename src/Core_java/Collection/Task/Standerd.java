package Core_java.Collection.Task;

class Standerd{
	
	private int id;
	private String name;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String toString(){
		return "Standerd {" + " Id = "+ id + ", Name = "+ name + "}";
	}
}