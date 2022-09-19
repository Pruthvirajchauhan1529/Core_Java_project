package Core_java.Inheritance;

public class child01 extends parent01 {
    int c,d;
    child01(int a,int b,int c,int d){
        super(a,b);
        this.c = c;
        this.d = d;
    }
    void display(){

        System.out.println("Parent A "+super.a);
        System.out.println("Parent B "+super.b);
        System.out.println("Child C "+this.c);
        System.out.println("Child D "+this.d);

    }
    void f1(){
        //System.out.println(this);
        System.out.println("This is child class Method f1");
        super.f1();
    }
}
