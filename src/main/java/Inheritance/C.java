package Inheritance;

public class C extends B{
    C(){
        super();
        //calling the parent's constructor
        System.out.println("C's constructor is called");
    }

    C(String str, int x){
        super(x);
        System.out.println("C's constructor with string param is called + " + str);
    }

}
