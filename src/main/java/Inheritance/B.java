package Inheritance;

public class B extends A{
    B(){
        //calling the parent's constructor
        System.out.println("B's constructor is called");
    }

    B(int x){
        super(x);
        System.out.println("B's constructor with int param is called");
    }

    B(String str){
        System.out.println("B's constructor with string param is called");
    }
}
