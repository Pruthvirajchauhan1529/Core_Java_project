package Core_java.Task.Exception;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class Voting12{
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :- ");
		 a =sc.nextInt();

		 if(a<18){
		 	throw new YoungerAgeException("You are not eligibal for voting");
		 }
		 else{
		 	System.out.println("You are eligibal for voting");
		 }
	}
} 