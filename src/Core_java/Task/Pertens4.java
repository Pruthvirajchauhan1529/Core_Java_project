package Core_java.Task;

class Pertens4{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
			for (int k=4;k>=i ;k-- ) {
				System.out.print(" ");
			}
		}
	}
}