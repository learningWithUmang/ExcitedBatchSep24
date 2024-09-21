package Constructors;


public class Client {
    public static void main(String[] args) {
        //Student st = new Student();

        ///Student st2 = new Student();

        //Student st3 = new Student("Umang", 12);

        //Student st4 = new Student(1);

        //System.out.println("Debug statement");

        Student st1 = new Student("Umang", 12);

        Student st3 = st1;
        /*
        I want to create a copy of this object
        I want a new object entirely and values of attributes should be same for both of them

         */

        Student st2 = new Student(st1);

        st2.name = "Sjy";
        st2.batch_id = 10;


        //System.out.println(st);
        //System.out.println(st1);

        //st1.name = "Kavyakanti";

        System.out.println();

        /*
        class -
        batch_id
        instructor
        schedule
        assignemtn
        same session link

        name, psp, phno
         */

    }
}
/*
Default const. is only created if you do not have your own const.
 */