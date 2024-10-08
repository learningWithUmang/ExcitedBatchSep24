package Generics;

public class Pair<A,B> {
    A first; //Integer
    B second; //String

    void setFirst(A x){
        first = x;
    }

    B getSecond(){
        return second;
    }

    public static<A,B> void doSomethingStatic(A x, B y){
        //You can't use class level generics in static methods
    }

    public <T, X>T doSomethingNonStatic(A x, T y){
        return y;
    }


    /*
    access_modifier <Generics comma sep> return_type methodName(params){
    }
     */

    /*
    {
        X
    }
     */
}
