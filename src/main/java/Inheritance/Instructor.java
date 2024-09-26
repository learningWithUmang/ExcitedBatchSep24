package Inheritance;

public class Instructor extends User{
    double avgRating;
    String roleType;
    //RI, FTE
    void scheduleClass(){
        System.out.println("Instructor is scheduling a class");
    }
    void startSession(){
        System.out.println("Instructor is starting the session");
    }

    Instructor(){
        //passes this line
        System.out.println("Instructor's constructor is called");
    }
}


/*
extends - add
it simply adds all attributes and behaviours
of parent class in the child class
 */