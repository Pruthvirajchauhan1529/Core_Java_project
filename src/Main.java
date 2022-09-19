import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(s.subSequence(A,B));

      //  System.out.println(A.length()+ B.length());
      /*  if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        A = (A.substring(0,1).toUpperCase() +  A.substring(1));
        B = (B.substring(0,1).toUpperCase() +  B.substring(1));
        System.out.println(A+ " "+ B); */
    }
 }
