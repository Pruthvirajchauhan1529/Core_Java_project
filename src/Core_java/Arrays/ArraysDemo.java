package Core_java.Arrays;

class ArraysDemo{
	public static void main(String[] args) {
		
		int arr[] = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println("Elements of an array");
		for(int element : arr){
			System.out.println(element);
		}
	}
}