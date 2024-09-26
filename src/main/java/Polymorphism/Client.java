package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<A> ls = new ArrayList<>();

        //10 objects of B
        //10 objects of c
        //10 objects of D
        //B, C,D all are child of A => doSomething()
        List<A> ls1 = new ArrayList<>();



        ls.add(new A());
        ls.add(new B());
        ls.add(new B());

        for(A obj : ls){
            obj.doSomething();
        }

        A a = new B();
        a.x();

        B b = new B();
        b.x();

        //You have 100s of child classes of A
        //All that you're concerned about is attributes of A
        //

    }
}
