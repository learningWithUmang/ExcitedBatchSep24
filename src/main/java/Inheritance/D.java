package Inheritance;

public class D extends C{
    D(){
        //calling the parent's constructor
        System.out.println("D's constructor is called");
    }
    D(int x, String str){
        //calling the parent's constructor
        super(str, x);
        System.out.println("D's constructor with int param is called");
    }
}
