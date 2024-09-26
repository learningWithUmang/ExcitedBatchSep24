package LearningStatic;

public class AcademyStudent {
    String name;
    String email;
    String phoneNo;
    String address;
    double psp;
    final static String universityName = "scaler"; //scaler academy
    final static double fees = 10000;
    static String curriculum;

     static void doSomething(){
        //do you need a object to call this method?
        //psp = 12;
        //You cannot access non static / instance variables from static method
        System.out.println("Doing something");
    }

    void doSome(){
        System.out.println(universityName);
        doSomething();
    }
}
